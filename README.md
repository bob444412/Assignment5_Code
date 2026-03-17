![CI](https://github.com/bob444412/Assignment5_Code/actions/workflows/SE333_CI.yml/badge.svg)


Assignment 5 – Playwright Testing with MCP
Project Overview
This project demonstrates automated UI testing using Playwright in Java. It includes both manual UI testing and AI-assisted testing using the Playwright MCP agent. The tests simulate a user workflow on the DePaul bookstore website, including searching for products, adding items to the cart, and verifying results.


The project is configured with GitHub Actions to automatically run tests on every push. The workflow installs dependencies, sets up Playwright, and executes all tests using Maven.

https://github.com/bob444412/Assignment5_Code/actions


Reflection: Manual vs AI-Assisted UI Testing


Manual UI testing required writing Java code using Playwright to simulate user actions such as navigating pages, locating elements, and verifying results. This process provided full control over the test logic but required more time and effort, especially when dealing with selectors and debugging errors.
AI-assisted UI testing using the Playwright MCP agent simplified this process. Instead of writing code manually, I described the workflow in natural language, such as searching for earbuds, adding items to the cart, and verifying results. The AI generated the Playwright test code automatically, which made development faster and easier.
In terms of ease of use, the AI-assisted approach was more efficient and reduced the need for manual coding. However, the generated tests sometimes required adjustments to improve accuracy and reliability. Manual tests were more stable and precise since they were explicitly written.
From a maintenance perspective, AI-generated tests are quicker to update but may be harder to debug, while manual tests are easier to maintain long-term due to their clear structure.
Overall, AI-assisted testing improves productivity, while manual testing ensures better control and reliability. A combination of both approaches provides the best results.
