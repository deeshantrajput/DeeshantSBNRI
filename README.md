# DeeshantSBNRI
Github API: https://api.github.com/orgs/octokit/repos?page=1&per_page=10

- Used RecyclerView to show the items.
- Used MVVM pattern for the architecture and handle screen orientation(landscape/portrait).
- Added pagination and allow the user to scroll down to load more results.
- Stored the data in Room so that users can see the existing fetched data even if the internet is not available.
- Added open_issues_count, license, permissions, name and description field for each cell in the recycler view.
