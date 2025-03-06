# How to work with Git?
Here’s an overview of the Git commands, including their functionality, parameters, affected data, and where changes occur.
| Command   | Function               |Parameters         | Affected Data    | Changes occur in:
|-----------|------------------------|-------------------|------------------|-----------------|
|`git config`| sets Git's configuration options|`--global`,`--lokal`,`--list`|Meta Information|local(config files)|
|`git init`|initializes a new Git repository|`--bare`| Repository Metadata|Local (working directory)|
|`git commit`| saves changes to the local repository|`-m "message"`,`--amend`|staged files|Local (new version in repository)|
|`git status`| shows the current state of the working directory and staging area.  |---|shows changes|no changes|
|`git add`|stages changes|`.`,`file.txt`|User files|local(staging area)|
|`git log`|shows the commit history of a Git repository|`--oneline`,`--graph`|commit metadata|no changes|
|`git diff`|compare changes|`--staged`|user files|no changes|
|`git pull`|updates the local repository with changes from a remote one|`origin main`|User files,metadata|Local (working directory)|
|`git push`|Uploads commits to remote|`origin main`|User files,metadata|Remote(server)|