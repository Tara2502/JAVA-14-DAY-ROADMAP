\# Day 7 - Git \& GitHub Notes



\## What is Version Control?



Version Control is a system that records changes made to files over time, allowing developers to track history, collaborate, and restore previous versions when needed.



\---



\# Why Version Control?



Before version control:



\- Multiple copies of the same project were created manually.

\- Difficult to track changes.

\- Difficult to know who changed what.

\- Risk of losing important code.

\- Team collaboration was difficult.



Version Control solves these problems by maintaining a complete history of changes.



\---



\# Types of Version Control



\## Centralized Version Control (CVCS)



\- One central server.

\- Developers depend on the server.

\- If the server fails, work may stop.



Examples:

\- SVN

\- Perforce



\---



\## Distributed Version Control (DVCS)



\- Every developer has a complete copy of the repository.

\- Work can continue offline.

\- Better collaboration and backup.



Examples:

\- Git

\- Mercurial



\---



\# Git Architecture



Working Directory

↓

Staging Area

↓

Local Repository

↓

Remote Repository (GitHub)



\---



\# Working Directory



Contains the files currently being edited.



\---



\# Staging Area



Temporary area where selected changes are prepared before committing.



Purpose:

\- Select specific files.

\- Review changes.

\- Avoid committing unwanted files.



\---



\# Local Repository



Stored inside the hidden .git folder.



Contains:

\- Complete commit history

\- Branches

\- Tags

\- Configuration



\---



\# Remote Repository



A Git repository hosted on a remote server such as GitHub that enables backup, collaboration, and synchronization.



\---



\# Git vs GitHub



Git:

\- Version Control System

\- Installed locally

\- Works offline



GitHub:

\- Cloud hosting platform

\- Stores Git repositories online

\- Used for collaboration



\---



\# Basic Git Commands



git init

Creates a new Git repository.



git status

Shows repository status.



git add

Moves files to the staging area.



git commit

Creates a snapshot of staged changes.



git log

Displays commit history.



git diff

Shows changes between versions.



git restore

Discards uncommitted changes.



git rm

Deletes a file and stages the deletion.



git mv

Renames a file and stages the rename.



\---



\# .gitignore



Specifies files and folders Git should ignore.



Common entries:

\- target/

\- .idea/

\- .vscode/

\- \*.class

\- \*.log

\- .env



\---



\# Branching



A branch is an independent line of development.



Purpose:

\- Develop features safely.

\- Fix bugs independently.

\- Experiment without affecting the main branch.



\---



\# Branch Commands



git branch

Lists or creates branches.



git switch

Switches branches.



git checkout

Legacy command for switching branches.



\---



\# Merge



Combines one branch into another.



Workflow:



git switch master



git merge feature/login



\---



\# Fast-Forward Merge



Occurs when the target branch has no additional commits.



Git simply moves the branch pointer forward.



\---



\# Merge Conflict



Occurs when two branches modify the same part of a file.



Conflict markers:



<<<<<<< HEAD

=======

>>>>>>> branch-name



Resolve manually, then:



git add



git commit



\---



\# Delete Branch



git branch -d feature/login



Deletes the local branch after it has been merged.



\---



\# Remote Repository Commands



git remote

Lists configured remotes.



git remote -v

Shows remote names and URLs.



git fetch

Downloads remote changes without merging.



git pull

Fetches and merges remote changes.



git push

Uploads local commits to GitHub.



git clone

Downloads an existing repository.



\---



\# Important Concepts



origin

Default alias for the remote repository.



HEAD

Pointer to the currently checked-out branch.



Commit Hash

Unique identifier for every commit.



\---



\# Frequently Asked Interview Questions



Difference between Git and GitHub.



Difference between git fetch and git pull.



Difference between git init and git clone.



Difference between merge and merge conflict.



Purpose of the staging area.



Why branches are lightweight.



Purpose of .gitignore.



Difference between local and remote repositories.



Difference between origin and upstream.



Why Git is called a Distributed Version Control System.



\---



\# Key Takeaways



\- Git tracks project history.

\- Commits create snapshots.

\- Branches are lightweight pointers.

\- Merge combines branch histories.

\- Merge conflicts require manual resolution.

\- GitHub stores remote repositories.

\- fetch downloads changes.

\- pull = fetch + merge.

\- push uploads local commits.

