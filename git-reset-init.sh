rm -r .git
git init
git remote add origin https://github.deere.com/scs-apps/ma-indexes-api.git
git fetch --all
git reset --hard origin/master
