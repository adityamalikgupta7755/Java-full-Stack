const musicContainer = document.querySelector('.music-container');
const playBtn = document.querySelector('#play');
const prevBtn = document.querySelector('#previous');
const nextBtn = document.querySelector('#next');
const audio = document.querySelector('#audio');
const progress = document.querySelector('.progress');
const progressContainer = document.querySelector('.progress-container');
const title = document.querySelector('#title');
const cover = document.querySelector('#cover');


// song title
const songs =['Thoda','hey','summer','ukulele']

//keep track of songs
let songIndex = 2;

//load song
loadSong(songs[songIndex]);

// update song detail

function loadSong(song){
    title.innerText = song;
    audio.src = `music/${song}.mp3`
    cover.src = `img/${song}.jpg`
}

function playSong(){
    musicContainer.classList.add('play');
    playBtn.querySelector('i.fas').classList.remove('fa-play');
    playBtn.querySelector('i.fas').classList.add('fa-pause');

    audio.play()
}

function pauseSong(){
    musicContainer.classList.remove('play');
    playBtn.querySelector('i.fas').classList.add('fa-play');
    playBtn.querySelector('i.fas').classList.remove('fa-pause');
    audio.pause()
}

function prevSong()
{
    songIndex--;
    
    if(songIndex<0)
    {
        songIndex = songs.length-1;
    }

    loadSong(songs[songIndex])

    playSong()
}

function nextSong()
{
    songIndex++;
    
    if(songIndex>songs.length-1)
    {
        songIndex = 0;
    }

    loadSong(songs[songIndex])

    playSong()
}

function updateProgress(e) {
    // console.log(e.srcElement.duration);
    // console.log(e.srcElement.currentTime);

    const {duration,currentTime} = e.srcElement
    const progressPercent = (currentTime /duration)*100
    progress.style.width = `${progressPercent}%`
    //    console.log(`${progressPercent}%`);

}

function setProgress(e){
    const width = this.clientWidth
    const clickX = e.offsetX
    const duration = audio.duration

    audio.currentTime = (clickX / width)*duration
    console.log(clickX)

}


playBtn.addEventListener('click', ()=> {
    const isPlaying = musicContainer.classList.contains('play');
    
    if(isPlaying){
        pauseSong()
    }
    else {
        playSong()
    }
})

//change song

prevBtn.addEventListener('click',prevSong)
nextBtn.addEventListener('click',nextSong)

audio.addEventListener('timeupdate', updateProgress)
progressContainer.addEventListener('click', setProgress)

audio.addEventListener('ended', nextSong)