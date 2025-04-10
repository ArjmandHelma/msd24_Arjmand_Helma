Here is the English translation of your text:



#  Practice for Source Code Comments and Git Commit Messages

##  Source Code Comments

Good comments in the code help other developers  understand *why* something was done – not just *what* is happening.

###  Tips for good comments:

- Describe the *purpose* and *motivation* behind non-obvious code.
- Write *complete sentences* – no gibberish.
- Comment on *complex logic*, not trivial operations.
- Keep comments *up-to-date* – outdated comments lead to misunderstandings.
- Avoid redundant comments like:



##  Git Commit Messages

Good commit messages are crucial for the *readability of the project history* and help with team collaboration.

###  Structure of a commit message:

1. *First line:*  
   - Max. 50 characters  
   - Use the *imperative form*, e.g., "Fix", "Add", "Refactor"  
   - Examples:  
     - Add user login validation  
     - Fix bug in payment logic

2. *Blank line*

3. *Detailed description (optional):*  
   - Why was this commit made?  
   - What was changed?

###  Example of a good commit message:

```
Add validation for empty input fields

Prevents the form from being submitted without
filling all required inputs. Related to issue #42.
```

---
