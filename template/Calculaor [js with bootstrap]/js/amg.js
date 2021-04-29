let num_1 = document.querySelector('#num_1');
        let num_2 = document.querySelector('#num_2');
        let op = document.querySelector('#op');
        let result = document.querySelector('#result');

        let addi = (a, b) => {
            return a+b;
        }
        let mult = (a, b) => {
            return a*b;
        }
        let subt = (a, b) => {
            return a-b;
        }
        let dive = (a, b) => {
            return a/b;
        }

        let calc = (callfun) => {
            let a = Number(num_1.value);
            let b = Number(num_2.value);
            let result = 0;
            result = callfun(a, b);
            return result;
        }



        let add = document.querySelector('#add');
        add.addEventListener('click', function () {   
            op.innerText = '+';
            let output = calc( addi);
            result.innerText = output;
        });
        let sub = document.querySelector('#sub');
        sub.addEventListener('click', function () {   
            op.innerText = '+';
            let output = calc( subt);
            result.innerText = output;
        });
        let mul = document.querySelector('#mul');
        mul.addEventListener('click', function () {   
            op.innerText = '+';
            let output = calc( mult);
            result.innerText = output;
        });
        let div = document.querySelector('#div');
        div.addEventListener('click', function () {   
            op.innerText = '+';
            let output = calc( dive);
            result.innerText = output;
        });
