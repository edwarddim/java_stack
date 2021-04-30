class TrieNode {
    constructor(letter = null) {
      this.letter = letter;
      // children will be TrieNodes as well
      this.children = {};
      // if 
      this.endWord = false;
    }
}
  
class Trie {
    constructor() {
        this.root = new TrieNode("");
    }

    add(word) {
        let node = this.root;
        // Iterate through word and for each letter
        for (let letter of word) {
            // If the next letter is not listed, add a new 
            // node for that letter
            if (!node.children.hasOwnProperty(letter)) {
                node.children[letter] = new TrieNode(letter);
            }
            // Move on to the next letter node.
            node = node.children[letter];
        }
        node.endWord = true;
        return this;
    }

    // RECURSIVE
    addRecursive(word, node = this.root, partial = "") {
        // when val str has been sliced all the way it will be empty str
        // NAH.
    }
}

let searchHistory = new Trie();
searchHistory.add("cat").add("can").add("candy").add("apple").add("a").add("an").add("and");
console.log(searchHistory);