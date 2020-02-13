/*Part 1*/
var db = [
{Name:'Manish', Age: 21, Salary: 6000, DOB:'01-01-1999'},
{Name:'Aman', Age: 22, Salary: 7000, DOB:'01-01-1999'},
{Name:'Kandy', Age: 23, Salary: 6000, DOB:'01-01-1999'},
{Name:'Kartik', Age: 23, Salary: 500, DOB:'01-01-1999'},]


/*Part 2*/
console.log(db)

let incsal = [];
for (let i = 0; i< db.length; i++){
if (db[i].Salary > 5000){
incsal.push(db[i]);}}

console.log(incsal);
/*Part 3*/
let groupt = db.reduce((r,a) => {
	r[a.Age] = [...r[a.Age] || [], a]
	return r;
},{});
/*Part 4*/
let increment = [];
for (let k = 0; k< db.length; k++){
if (db[k].Salary < 1000 && db[k].Age>20){
let po = db[k].Salary * 5;
increment.push(po);}}

console.log(increment);
