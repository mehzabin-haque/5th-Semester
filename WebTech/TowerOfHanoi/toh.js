// window.onload = function() {
//     var list = document.getElementById("div1"),
//         button = document.getElementById("reset1");


//     function shuffle(items) {
//         // let div2_ele = div2.children;
//         // while (div2_ele.length > 0) {
//         //     div1.appendChild(div2_elements[0]);
//         // }
//         var cached = items.slice(0),
//             temp, i = cached.length,
//             rand;
//         while (--i) {
//             rand = Math.floor(i * Math.random());
//             temp = cached[rand];
//             cached[rand] = cached[i];
//             cached[i] = temp;
//         }
//         return cached;
//     }

//     function shuffleNodes() {
//         var nodes = list.children,
//             i = 0;
//         nodes = Array.prototype.slice.call(nodes);
//         nodes = shuffle(nodes);
//         while (i < nodes.length) {
//             list.appendChild(nodes[i]);
//             ++i;
//         }
//     }
//     document.getElementById("reset1").onclick = shuffleNodes;

// }


function chk() {
    let butns = document.querySelectorAll(".button");
    let arr = [];
    for (let i = 0; i < butns.length; i++) {
        arr.push(butns[i].innerHTML);
    }
    arraySorted(arr);
}

function arraySorted(arr) {

    let isSorted = true;
    for (let i = 0; i < arr.length - 1; i++) {
        if (arr[i] > arr[i + 1]) {
            isSorted = false;
            break;
        }

    }
    if (isSorted) {
        alert("You have won the game. Now gimme treat :D ");
    } else {
        alert("Not sorted. Try again :( ");
    }


}