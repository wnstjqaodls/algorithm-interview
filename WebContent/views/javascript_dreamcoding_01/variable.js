// 1. Use strict
// added in ES 5
'use strict'
alert("Alert Called");

// 2. Variable
// let (added in ES6)
let globalName = 'glboal Name'
{
    let name = 'subkim'
    console.log(name);
    name = 'hello';
    console.log(name);
}
    console.log(name);
    console.log(globalName);

// var (쓰지마!)
// var hoisting (어디에 선언했든 상관없이 최상단으로 끌어올려짐!)
// var 는 블록스코프가 없다!! 어디에서나 아무곳에서나 사용가능..
{
    age = 4;
    var age;//이렇게 선언전에 할당이 가능하다..
}
console.log(age);

// 3.Constant
// 변경가능한것 : mutable 데이터타입 > string , number , null , undefined 등등..
// 변경불가능한것 : immutable 데이터타입
// 장점
// - 보안 (값변경이안됨)
// - 쓰레드 안정성 (여러 쓰레드가 동시에 변수에접근해서 값을 변경할때 불가능하기때문)
// - 휴먼 mistakes 줄어들음
const daysInWeek = 7;
const maxNumber = 5;
console.log(typeof daysInWeek);
console.log(typeof maxNumber); // 자바스크립트에서는 둘다 동일하게 number 임


// 4. Variable types
// primitive : number 타입
// object  > box 컨테이너에 저장됨
// function , first-class function  info : 즉 함수를 객체에 할당가능하고 , 인자로도 전달가능한것을 말함.
const tempNum = 4; // Integer
const tempNum2 = 16.4; // Decimal

const infinity = 1 / 0; // 무한대... 가되어버림
const naN  = 'not a number' / 2;
console.log(infinity)
console.log(naN)

// 4.1 bigInt (최근에 추가됨)
const bigInt = 1234567890123456789012345678901234567890n; // 숫자끝에 n 만 붙이면 사용가능
console.log(`value is : ${bigInt} type : ${typeof bigInt}` );


// 5. string
// 자바스크립트에서는 한가지의 글자든 여러개든 string 하나로쓰임.
const char = 'c';
const brendan = 'brendan';
const greeting = 'greeting';

// template litterrals
const helloBob = `hi ${brendan}! `;

// 6. boolean
const canRead = true;
const test = 3 < 1 ; // false

// null
let nothing = null;

// undefined
let x;

// 6. Daynamic type
let text = 'hello';
console.log(text.charAt(0));


// xxx 7. Object Type
const elie = {name : 'elie' , age: 28};
// elie 가 바라보는 포인터의 ref 는 변경불가능하지만(다른오브젝트로 할당은불가).. elie.age 등의 안의 요소는 변경가능하다.
elie.age = 20;
console.log(elie.age);
// elie = {some : 'data'}; 불가능
