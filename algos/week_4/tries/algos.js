class TrieNode {
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
    let node = this.root;
    word = word.toLowerCase();

    //go down each node;
    for (const char of word) {
      if (!node.children.hasOwnProperty(char)) {
        return false;
      }
      node = node.children[char]; // Incrementing the node using the pointer
    }
    if (node.isEndOfWord == true) return true;
    else return false;
  }

  /**
   * Recursively print the characters in the Trie
   * @param {TrieNode} node  The current node.
   */
  printAllKeys() {
    if (node.char != null) console.log(node.char);

    for (let c in node.children) {
      this.printAllKeys(node.children[c]);
    }
  }

  /**
   * Recursively find the number of characters in the Trie
   * Note: the empty string at the root counts as size = 0
   * @param {TrieNode} node the current node
   * @param {int} size the size of the Trie
   * @returns {int} the size of the Trie
   */
  size(node = this.root, size = 0) {
    // looping through the children of the node
    for (const char in node.children) {
      size = this.size(node.children[char], size + 1);
    }

    return size;
  }
}

var words = [
  "the",
  "a",
  "there",
  "answer",
  "any",
  "by",
  "bye",
  "their",
  "out",
  "outside",
  "quest",
];

var words = ["always", "dog"]

const trie = new Trie();
for (const w of words) {
  trie.add(w);
}

console.log(trie.size());
