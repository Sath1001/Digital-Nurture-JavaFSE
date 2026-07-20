# Git Hands-On Lab (HOL 1 - HOL 5) Solutions

## Overview
This document contains the step-by-step instructions and command sequences for completing Git Hands-On Labs 1 through 5.

## Git HOL 1: Repository Setup & Basics
- `git init`: Initializes local repository.
- `git status`: Checks working tree status.
- `git add .`: Stages modified and untracked files.
- `git commit -m "Initial commit"`: Saves staged changes to local commit history.

## Git HOL 2: Git Ignore Implementation
- Create `.gitignore` file.
- Configure ignoring rules:
  ```
  *.log
  log/
  *.bak
  ```
- Verify with `git status` that `.log` files and `log/` folder are ignored.

## Git HOL 3: Branching & Merging
- Create branch: `git branch GitNewBranch`
- Switch to branch: `git checkout GitNewBranch`
- Add files, stage, and commit.
- Switch back to `main`: `git checkout main`
- Merge branch: `git merge GitNewBranch`
- Observe log: `git log --oneline --graph --decorate`
- Delete branch: `git branch -d GitNewBranch`

## Git HOL 4: Conflict Resolution
- Create branch: `git branch GitWork`
- Modify `hello.xml` on `GitWork` branch and commit.
- Switch to `main` and modify `hello.xml` with different content and commit.
- Execute merge: `git merge GitWork` (triggers merge conflict).
- Resolve conflict markers in `hello.xml`.
- Stage resolved file: `git add hello.xml`
- Commit resolution: `git commit -m "Resolved merge conflict"`
- Delete branch: `git branch -d GitWork`

## Git HOL 5: Remote Synchronization
- `git pull origin main`: Fetch and merge latest remote commits.
- `git push origin main`: Push local commits to GitHub.
