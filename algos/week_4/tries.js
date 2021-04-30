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

    /**
     * Returns an array with any complete words beginning
     * with the given starting substring.
     * - Time: O(?)
     * - Space: O(?)
     * @returns {array} of strings
     */
    autoComplete(startingSubstring) {
        let startNode = this.getLastOfSubstring(startingSubstring);
        return this.getCompletions(startingSubstring, "", startNode);
    }

    // Finds the last letter node of the given substring
    getLastOfSubstring(substring) {
        let runner = this.root;
        for (let letter of substring) {
            if (runner.children.hasOwnProperty(letter)) {
                runner = runner.children[letter];
            }
        }
        // console.log("last node letter: ", runner.letter);
        return runner;
    }

    // RECURSIVE CALL TO GET WORD COMBINATIONS
    getCompletions(prepend="", branchString="", node=this.root, completions=[]) {
        if (node.endWord) {
            completions.push(prepend+branchString);
        }
        if (!node.children) {
            return completions; 
        }
        for (let letter in node.children) {
            this.getCompletions(prepend, branchString + node.children[letter].letter, node.children[letter], completions);
        }
        // console.log("end? ", completions);
        return completions;
    }
}

let searchHistory = new Trie();
searchHistory.add("cat").add("can").add("candy").add("apple").add("a").add("an").add("and");
console.log(searchHistory);

console.log(searchHistory.autoComplete("a"));
console.log(searchHistory.autoComplete("ca"));