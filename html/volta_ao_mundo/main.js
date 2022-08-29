var db = {
    "V" : ["venezuela", "vaticano"],
    "O" : ["otawa", "ondina"],
    "L" : ["lisboa", "londres", "londrina"],
    "T" : ["turquia", "tocantins"],
    "A" : ["alemanha", "argentina"]
};

var index = 0;
var tentativas = 2;

function capitalize(string) {
    return string.charAt(0).toUpperCase() + string.slice(1);
}

document.getElementById("palavra")
    .addEventListener("keydown", function(e) {
        if(e.key === "Enter" || e.keyValue === 13) {
            document.getElementById("submit").click();
        }
    });

document.getElementById("submit").addEventListener("click", function(e) {
    let lugar = document.getElementById("palavra").value.toLowerCase();
    let hint = document.getElementById("feedback");
    hint.classList = [];
    if (lugar == "" || lugar == null) {
        hint.className = "error";
        hint.innerHTML = "Você precisa informar um lugar para ir!";
        return;
    }
    document.getElementById("palavra").value = "";
    let check = Object.keys(db)[index].toLowerCase();
    if (lugar.startsWith(check)) {
        hint.className = "success";
        hint.innerHTML = `Você pode ir para ${capitalize(lugar)}`;
        if (!db[check.toUpperCase()].includes(lugar)) {
            db[check.toUpperCase()].push(lugar);
        }
        tentativas = 2;
        index < 4 ? index++ : index = 0;
    } else {
        if (tentativas > 0) {
            hint.className = "error";
            hint.innerHTML = `Você não pode ir para ${capitalize(lugar)}`;
            tentativas--;
        } else {
            hint.className = "error";
            let lugarDisponivel = db[check.toUpperCase()][Math.floor(Math.random()*db[check.toUpperCase()].length)]
            hint.innerHTML = `Você não pode ir para ${capitalize(lugar)}, mas você pode ir para ${capitalize(lugarDisponivel)}`;
            tentativas = 2;
            index < 4 ? index++ : index = 0;
        }
    }
});