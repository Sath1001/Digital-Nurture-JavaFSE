#!/bin/bash

# Git HOL 1: Basic Commands
git init
git status
git add .
git commit -m "Git HOL 1: Initial commit"

# Git HOL 2: Git Ignore
echo "*.log" >> .gitignore
echo "log/" >> .gitignore
git add .gitignore
git commit -m "Git HOL 2: Added .gitignore for log files"

# Git HOL 3: Branching and Merging
git branch GitNewBranch
git checkout GitNewBranch
echo "<branch>GitNewBranch</branch>" >> hello.xml
git add hello.xml
git commit -m "Git HOL 3: Changes in GitNewBranch"
git checkout main
git merge GitNewBranch
git log --oneline --graph --decorate
git branch -d GitNewBranch

# Git HOL 4: Conflict Resolution
git branch GitWork
git checkout GitWork
echo "<work>Conflict Work</work>" >> hello.xml
git add hello.xml
git commit -m "Git HOL 4: Work in GitWork branch"
git checkout main
echo "<master>Conflict Master</master>" >> hello.xml
git add hello.xml
git commit -m "Git HOL 4: Work in main branch"
git merge GitWork || true
git add hello.xml
git commit -m "Git HOL 4: Resolved merge conflict"
git branch -d GitWork
git log --oneline --graph --decorate

# Git HOL 5: Push and Clean Up
git pull origin main
git push origin main
