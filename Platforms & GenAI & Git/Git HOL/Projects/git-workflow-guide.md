# Git Version Control Hands-On Guide

## Overview
This hands-on guide details fundamental and advanced Git commands, branching strategies, and collaboration workflows used in enterprise software development.

## Core Git Commands

### Repository Setup
```bash
git init
git clone https://github.com/Sath1001/Digital-Nurture-JavaFSE.git
```

### Staging and Committing
```bash
git status
git add .
git commit -m "Module Commit Message"
```

### Branching and Merging
```bash
git branch feature/jwt-auth
git checkout feature/jwt-auth
git merge feature/jwt-auth
```

### Remote Operations
```bash
git remote -v
git push origin main
git pull origin main
```
