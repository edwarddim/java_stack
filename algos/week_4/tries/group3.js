class TrieNode {
  //Karalynn, Muhammad, Nathon, Tristen, Christian
  constructor(char = null) {
    // each node stores its own character value
    this.character = char;
    // each node has a JS object
    // the keys are characters
    // the values are TrieNodes
    this.children = {};
    // each node has a boolean check to see if its the end of a word
    this.isEndOfWord = false;
  }
}
class Trie {
  constructor() {
    // root node represents an empty string
    this.root = new TrieNode("");
  }
  /**
   * Adds the given to the Trie.
   * @param {string} word Word that is being added to the Trie
   * @returns {boolean} true/false status of adding the word
   */
  add(word) {
    // edge case to exit early if the input word is empty
    if (word === "") return false;
    // SETUP
    let node = this.root;
    word = word.toLowerCase();
    for (const char of word) {
      if (!node.children.hasOwnProperty(char)) {
        node.children[char] = new TrieNode(char);
      }
      node = node.children[char];
    }
    node.isEndOfWord = true;
    return true;
  }
  /**
   * Searches for a Complete word in the Trie.
   * This algo does not check for substrings.
   * @param {string} word Word to search for in the Trie
   * @returns {boolean} true/false was the word found
   */
   contains(word) {
    if (this.root.children == {}) {
        return false;
    }
    var arrayOfCharacters = word.split("");
    if (!arrayOfCharacters[0] in this.root.children) {
        return false;
    }
    var isWordFound = false;
    var nodeSearcher = this.root.children[arrayOfCharacters[0]];
    console.log("First character node", nodeSearcher);
    var lastIndex = arrayOfCharacters.length - 1;
    for (var i = 1; i <= lastIndex; i++) {
        nodeSearcher = nodeSearcher.children[arrayOfCharacters[i]];
        console.log(
            "\nLETTER SEARCHED",
            arrayOfCharacters[i],
            "CURRENT VALUE OF i",
            i,
            "CURRENT NODE",
            nodeSearcher
        );
        if (i == lastIndex) {
            console.log("LAST current index", i);
            console.log("LAST NODE", nodeSearcher);
            if (nodeSearcher.isEndOfWord == false) {
                console.log("Last index, not end of word", nodeSearcher);
                isWordFound = false;
                return isWordFound;
            } else {
                console.log("Last index, yes end of word", nodeSearcher);
                isWordFound = true;
                return isWordFound;
            }
        }
        if (i < lastIndex) {
            console.log("CHILDREN, NOT LAST", nodeSearcher.children);
            var nextLetterIndex = i + 1;
            var nextLetter = arrayOfCharacters[nextLetterIndex];
            if (!nodeSearcher.children[nextLetter]) {
                console.log(
                    "NODE WHERE NEXT LETTER IS NOT FOUND",
                    nodeSearcher
                );
                isWordFound = false;
                return isWordFound;
            }
        }
    }
    return isWordFound;
}
  /**
   * Recursively print the characters in the Trie
   * @param {TrieNode} node  The current node.
   */
  printAllKeys() {
    //print the current key
    //call this function on each key in the object
  }
  /**
   * Recursively find the number of characters in the Trie
   * Note: the empty string at the root counts as size = 0
   * @param {TrieNode} node the current node
   * @param {int} size the size of the Trie
   * @returns {int} the size of the Trie
   */
  size() {

  }
}
var words = ["the", "a","there","answer","any","by","bye","their","out","outside","quest",];
const trieTest = new Trie();
for (const w of words) {
  trieTest.add(w);
};
console.log(trieTest.contains("then")); //returns false
console.log(trieTest.contains("any")); //returns true