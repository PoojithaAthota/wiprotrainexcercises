var x=4;
let y =0;
const z=10;

function f(){
    x=9;
    let y =8;
    console.log("x inside a function :" +x);
    console.log("y inside function is :"+y);
if(true){
    let z =20;
    console.log("y in if block is :"+y);
}
}
f();

