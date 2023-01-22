window.onload = function() {
    var list = document.getElementById("div1"),
        button = document.getElementById("reset1");

    function shuffle(items) {
        var cached = items.slice(0),
            temp, i = cached.length,
            rand;
        while (--i) {
            rand = Math.floor(i * Math.random());
            temp = cached[rand];
            cached[rand] = cached[i];
            cached[i] = temp;
        }
        return cached;
    }

    function shuffleNodes() {
        var nodes = list.children,
            i = 0;
        nodes = Array.prototype.slice.call(nodes);
        nodes = shuffle(nodes);
        while (i < nodes.length) {
            list.appendChild(nodes[i]);
            ++i;
        }
    }
    document.getElementById("reset1").onclick = shuffleNodes;

}