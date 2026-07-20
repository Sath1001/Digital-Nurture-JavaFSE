# Module 11: Version Control - GIT Hands-On Guide

## Overview
This hands-on guide covers fundamental and advanced Git commands, branching strategies, merge conflict resolution, and remote repository management.

## 1. Basic Git Commands
- `git init`: Initialize local Git repository.
- `git status`: Inspect status of working directory and staging area.
- `git add .`: Stage all modified and untracked files.
- `git commit -m "Commit message"`: Commit staged changes to local repository.

## 2. Git Ignore Rules
Create `.gitignore` to exclude log files and temporary build artifacts:
```
*.log
log/
*.bak
target/
node_modules/
```

## 3. Branching & Merging
- Create branch: `git branch GitNewBranch`
- Switch branch: `git checkout GitNewBranch`
- Merge branch into main: `git checkout main && git merge GitNewBranch`
- Delete branch: `git branch -d GitNewBranch`
- Display branch graph log: `git log --oneline --graph --decorate`

## 4. Conflict Resolution
- Edit same file on both `main` and feature branch (`GitWork`).
- Attempt `git merge GitWork` to trigger merge conflict.
- Resolve conflict markers manually in editor.
- Stage resolved file (`git add hello.xml`) and complete merge commit.

## 5. Remote Operations
- Add remote: `git remote add origin https://github.com/Sath1001/Digital-Nurture-JavaFSE.git`
- Pull remote changes: `git pull origin main`
- Push local commits: `git push origin main`
