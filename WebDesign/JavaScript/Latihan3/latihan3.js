function nilaiMaksimal() {
    let max = 0;
    for (let i = 0; i < 3; i++) {
        let angka = prompt("masukan angka ke - " + (i + 1));
        let id = "angka" + (i + 1);
        document.getElementById(id).innerHTML = "Angka ke " + (i + 1) + " : " + angka;
        if (angka > max) {
            max = angka;
        }
    }
    document.getElementById("angkaMax").innerHTML = "Angka Maksimal : " + max;
}

function ctof() {
    let fahrenheit = prompt("Masukan suhu Celsius yang ingin diubah ke Fahrenheit");
    let hasilCtoF = alert(fahrenheit * 9 / 5 + 32);
}

function ftoc() {
    let celcius = prompt("masukan suhu Fahrenheit yang ingin di konversikan ke Celsius : ");
    let hasilFtoC = alert((celcius - 32) * 5 / 9)
} "Masukan suhu Celsius yang ingin diubah ke Fahrenheit"

function factorial() {

    let berapaFactorial = prompt("Berapa kali factorial yang ingin dibuat ");

    var table = document.getElementsByTagName("table")[0];
    for (let i = 0; i < berapaFactorial; i++) {
        let hasil = 1;
        if (i == 0 || i == 1) {
            hasil == 1;
        }
        else {
            for (let j = 1; j < i; j++) {
                hasil *= j;
            }
        }
        table.appendChild(document.createElement("tr"));
        let tr  = document.getElementsByTagName("tr")[i+1];
        tr.appendChild(document.createElement("td"));
        tr.appendChild(document.createElement("td"));
        tr.getElementsByTagName("td")[0].innerHTML = i + "!";
        tr.getElementsByTagName("td")[1].innerHTML = hasil;
    }


}