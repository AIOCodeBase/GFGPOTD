# 📌 **Contribution Guidelines** 🏗

## **To start contributing, follow the below guidelines:**

**1.**  Fork [this](https://github.com/AIOCodeBase/GFGPOTD) repository.

**2.**  Clone your forked copy of the project.

```
   git clone https://github.com/AIOCodeBase/GFGPOTD.git
```

**3.** Navigate to the project directory.
```
   cd GFGPOTD
```

**4.** Create a new branch:
```
   git checkout -b YourBranchName
```

**5.** Make changes in source code.

**6.** Stage your changes and commit

```
   git add .
   git commit -m "<your_commit_message>"
```

**7.** Push your local commits to the remote repo.

```
   git push origin YourBranchName
```

**8.** Create a [PR](https://help.github.com/en/github/collaborating-with-issues-and-pull-requests/creating-a-pull-request)

<br />
<hr />
<br />

## **If anyone contribute to this repository, then the changes will not reflect in your local repository. For that:**

**1.** Setup a reference(remote) to the original repository to get all the changes from the remote.
```
   git remote add upstream  https://github.com/AIOCodeBase/GFGPOTD
```

**2.** Check the remotes for this repository.
```
   git remote -v
```

**3.** Fetching from the remote repository will bring in its branches and their respective commits.
```
   git fetch upstream
```

**4.** Make sure that you're on your master branch.
```
   git checkout main
```

**5.** Now that we have fetched the upstream repository, we want to merge its changes into our local branch. This will bring that branch into sync with the upstream, without losing our local changes.
```
   git merge upstream/main
```

<br />
<hr />
<br />

## **Sync a fork of a repository to keep it up-to-date with the upstream repository.**

For detailed information visit:
```
https://docs.github.com/en/pull-requests/collaborating-with-pull-requests/working-with-forks/syncing-a-fork
```

## **Note:** _Before changing or adding new code, always sync your forked repository._