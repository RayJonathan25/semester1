
//Nomor 1
console.log("Nomor 1");

var hasil = ["2", "6", "7", "5", "3", "2", "9"];

for (let i = 0; i < hasil.length; i++) {
    let perkalian = parseInt(hasil[i] * 2);
    console.log(perkalian);
}

console.log(" ");
//Nomor 2
console.log("Nomor 2");
var x = ["2", "10", "5", "7", "13"];
var y = ["5", "7", "3", "2", "9"];


for (let i = 0; i < x.length; i++) {
    let hasil2 = parseInt(x[i] * y[i]);
    console.log(hasil2)
}

console.log(" ");
//nomor 3
console.log("Nomor 3");

var n = ["10", "19", "5", "20", "13"];
for (let i = 0; i < x.length; i++) {
    if (parseInt(x[i] > n[i])) {
        let hasil3 = parseInt(x[i]) * parseInt(n[i]);
        console.log(hasil3);
    } else if (parseInt(n[i] / x[i])) {
        let hasil3 = parseInt(n[i]) / parseInt(x[i]);
        console.log(hasil3);
    } else { console.log("Error") }
}

console.log(" ")
//nomor 4
console.log("Nomor 4");
var z = ["-1", "2", "-6", "5", "-3"];

for (let i = 0; i < z.length; i++) {
    let hasil4 = parseInt(x[i]) * parseInt(y[i]) * parseInt(z[i]);
    if (hasil4 < 0) {
        console.log(hasil4 + " " + " = " + "Negatif");
    } else if (hasil4 > 0) {
        console.log(hasil4 + " " + " = " + "Positif");
    }
    else {
        console.log("Salah Input");
    }
}

console.log(" ");
//nomor 5
console.log("Nomor 5");
for (i = z.length - 1; i >= 0; i--) {
    console.log(z[i]);
}

console.log(" ");
//nomor 6
console.log("Nomor 6");
var kata = "racecar";
let pembanding = 0;
for (let i = 0; i < kata.length / 2; i++) {

    if (kata.charAt(i) == kata.charAt(kata.length - (i + 1))) {
        pembanding++;
    }
    if (pembanding >= kata.length
        / 2) {
        hasil = true;
    } else { hasil = !true }
}
if (hasil == true) {
    console.log("Palindrom")
} else { console.log("Bukan Palindrom") }



console.log(" ");
//nomor 7
console.log("Nomor 7");
let students = [['David', 70], ['Sandra', 90], ['Diva', 68], ['Rama', 95], ['Thomas', 70]];
let rataRata = 0;
for (i = 0; i < students.length; i++) {
    rataRata += students[i][1];
} 
let hasilAkhir = rataRata/students.length;
console.log(hasilAkhir);
if(hasilAkhir <= 50){
    console.log("E");
}else if(hasilAkhir <= 60){
    console.log("D");
}else if(hasilAkhir <= 80){
    console.log("C");
}else if(hasilAkhir <= 90){
    console.log("B");
}else if(hasilAkhir <= 100){
    console.log("A");
}

console.log(" ");
//nomor 8
let button = document.querySelectorAll('input[name="warna"]');
console.log(button);

for (let i = 0; i < button.length; i++) {
    button[i].addEventListener('click', function () {
        console.log(this.value);
        document.getElementById('container').classList.remove("warnaPink", "warnaLightBlue", "warnaYellow", "warnaPurple");
        document.getElementById('container').classList.add(this.value);
    });
}