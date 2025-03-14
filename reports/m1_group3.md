# Milestone 1 Report

## Project Status and Planned Changes

The project has several fully implemented features, including login, basic search, post and comment editing, comment deletion, and user profile management. However, there is a notable lack of mobile application. Improvements are planned for sign-up (adding a confirm password field), object creation (enhanced attributes and filtering), advanced search (semantic and tag-based search with better filtering), post deletion (restriction if comments exist), and voting (separate scoring for different aspects). Additional features like anonymous posting, image uploads in comments, feed recommendations, and preserving posts/comments when a user deletes their profile are in progress. Several critical functionalities, such as reporting (posts, comments, and users), following (tags, posts, and users), and comment voting/filtering, are yet to be implemented. 

✅: Fully implemented
☑️: Improvement planned
⬜: Not implemented

| Status | Feature | Planned Changes (if any) |
| --- | --- | --- |
| ☑️ | Sign up | Confirm password field will be added. |
| ✅ | Login |  | 
| ☑️ | Object creation | Anonymous posting, geolocation, multiple addition for an attribute will be added. Unnecessary attributes (e.g. taste, smell, etc.) will be removed. |
| ✅  | Basic search |  |
| ☑️ | Advanced search | Semantic search related to ancestors on Wikidata, tag search, and/or options for multiple filters, range selection for appropriate attributes will be added. Search results screen will display the search filters. |
| ✅ | Edit post |  |
| ☑️ | Delete post | Post should not be deleted if there is a comment for that post. |
| ☑️ | Voting posts | Using separate scoring for mysteriousness, description, etc. and taking the average will be considered.|
| ⬜ | Reporting posts | It will be implemented. |
| ☑️ | Create comment | Adding image and selecting tags will be added. |
| ⬜ | Voting comments | It will be implemented. |
| ⬜ | Reporting comments | It will be implemented. |
| ⬜ | Filtering comments | It will be implemented. |
| ✅ | Edit comment |  |
| ✅ | Delete comment |  |
| ☑️ | Feed | Recommendations will be added. |
| ⬜ | Following tags | It will be implemented. |
| ⬜ | Following posts | It will be implemented. |
| ⬜ | Following users | It will be implemented. |
| ✅ | User profile |  |
| ✅ | Edit profile |  |
| ☑️ | Delete profile | Posts and comments should be stayed as anonymous when a user deletes the account. |
| ⬜ | Reporting users | It will be implemented. |

----

## Customer Feedback and Reflections

Customer has given feedback regarding various aspects of the software.

#### 1. Attributes
- Certain attributes, such as taste and smell, may not be relevant for mystery objects. It would be beneficial to consider removing them to improve data accuracy.

#### 2. Search Functionality
- Implementing a tag-based search would allow users to quickly find relevant content.
- An advanced search feature with filters such as range-based and exact match would provide greater precision in search results.
- Further improvements in advanced search capabilities will refine the user experience.

#### 3. Mobile Experience:
- Speech-to-Text: Enabling speech-to-text functionality can enhance accessibility and ease of use.
- Camera Integration: Utilizing the device camera for capturing and uploading relevant content could add value.
- Location-Based Features: Implementing location-aware search and notifications for nearby items would provide contextual relevance.
- User-Centric UX Design: Mobile features should prioritize the user’s needs, considering factors such as attention span, battery limitations, and screen size constraints.

#### 4. Post Management
- Posts with existing comments should not be deletable to maintain conversation integrity.
- When an account is deleted:
    - If there are no associated comments, the post should be removed.
    - If there are comments, the post should remain but be attributed to an anonymous user.

#### 5. Professional and Sincere Customer Demos
- Future customer demonstrations should be conducted in a manner that is both professional and engaging. The presentation should clearly communicate functionality while maintaining a sincere and approachable tone to foster trust and confidence in the system.

---

## Deliverables


### Software Requirements Specification
- Link: https://github.com/betulnesibe/swe574-Spring25/wiki/Requirements-Specification
- Status: Requirement specification is finalized for now. It will be revised based on future customer feedbacks.
- Evaluation: It is revised and improved based on feedbacks. Requirements specification process is on track.
- Impact: Since it is finalized, the project requirements are acknowledged well.

### Software Design (UML diagrams)
| Diagram | Link |
|---|---|
| Entity relationship diagram | https://github.com/betulnesibe/swe574-Spring25/wiki/Entity-Relationship-Diagram |
| Sequence diagrams | https://github.com/betulnesibe/swe574-Spring25/wiki/Sequence-Diagrams|
| Class diagram | https://github.com/betulnesibe/swe574-Spring25/wiki/Class-Diagram |
| Use case diagrams | https://github.com/betulnesibe/swe574-Spring25/wiki/Use-Case-Diagrams |

- Status: Above diagrams are designed for the project. 
- Evaluation: Data flow diagrams will be designed in the future.
- Impact: Thanks to the diagrams, the project development becomes easier as they show the workings of the system.

### Scenarios and Mockups
- Link: [Mock-up screens](https://github.com/betulnesibe/swe574-Spring25/wiki/Mock%E2%80%90up-Screens) and [Mock-up scenario](https://github.com/betulnesibe/swe574-Spring25/wiki/Mock%E2%80%90up-Scenario)
- Status: Mock-up scenario is created. Mock-up screens for web is designed but mobile version is not designed yet.
- Evaluation: Mock-up screens for mobile application should be designed.
- Impact: Since web version is designed, the frontend and backend can be developed accordingly. The same should be done for the mobile in order to start development.

### Project Plan
- Link: https://github.com/betulnesibe/swe574-Spring25/wiki/Project-Plan
- Status: Project plan for the second and final milestones are planned.
- Evaluation: It is a tentative plan that might change due to the new developments.
- Impact: According to this project plan, the project will be released on time and with all the requirements satisfied.

### Communication Plan
- Link: https://github.com/betulnesibe/swe574-Spring25/wiki/Communication-Plan
- Status: Communication plan is in place.
- Evaluation: Initial communication plan is revised based on the team's needs and it is in its final format.
- Impact: Since the communication is the key element for the team work, well-established communication plan is vital for the project progress.

### Responsibility Assignment Matrix
- Link: https://github.com/betulnesibe/swe574-Spring25/wiki/Responsibility-Asssignment-Matrix
- Status: The responsibility assignment matrix is in place.
- Evaluation: The initial responsibilities were decided in [this](https://github.com/betulnesibe/swe574-Spring25/wiki/2025%E2%80%9002%E2%80%9017-%E2%80%90-Meeting-Notes) meeting. It is revised and finalized based on the team's needs.
- Impact: This matrix clarifies team roles, ensuring accountability and reducing confusion by clearly defining who is responsible for each task. This enhances collaboration, prevents task overlap, and improves efficiency, leading to smoother project execution.

### Weekly reports and any additional meeting notes
- Link: https://github.com/betulnesibe/swe574-Spring25/wiki/Meeting-Notes
- Status: All the meetings have separate meeting notes.
- Evaluation: Meeting notes have been written after each meeting. Each meeting note include agenda, discussion & progress, action items & decisions. 
- Impact: Meeting notes ensure to go along within the project plan.

### Pre-release version:
- Link: https://github.com/betulnesibe/swe574-Spring25/releases/tag/customer-milestone-1
- Status: Web version is released and deployed[here](http://146.148.44.179:3000/). Mobile version is planned to be released.
- Evaluation: The web version has been successfully released, with key features performing well. 
- Impact: The planned mobile version is expected to significantly enhance accessibility and user engagement, broadening the platform’s reach.

---

## Tools and Processes

| Tool | Purpose|
| -------- | ----------- |
| Android Studio | To build Android application |
| Canva | To design mock-up screens for web and mobile |
| Discord | To hold unlimited online meetings and share files |
| Docker | To make deployment across devices |
| Google Cloud Platform | Cloud service to deploy |
| Git | Version control system to track changes |
| GitHub | Repository to manage project code, documentation, and packages |
| GitHub Desktop | Desktop application to easily use GitHub repository features |
| Kanban Board | Project management system to track progress |
| Postman | To build and use APIs |
| PostgreSQL | Database |
| Swagger | API endpoint management tool |
| VS Code | IDE for developing application |
| IntelliJ IDEA | IDE for developing Java application |
| WhatsApp | To conduct immediate communication |

- Git and GitHub is used in project workflow to establishing clear conventions regarding code and issues. 
- For communication, WhatsApp and Discord have proven to be reliable platforms, while GitHub issues and the Kanban board offer a practical way to track progress. 
- Our web application, built with Spring Boot, Swagger, and PostgreSQL, is running smoothly, and we intend to continue using Android Studio for mobile app development. 
- The app is containerized with Docker and deployed on Google Cloud Platform. 
- The development suite includes VS Code, IntelliJ IDEA, and Android Studio. 
- Meeting reports are being noted on Github Wiki page, and we plan to keep using this tool for future documentation. 
- To track progress of the project, Kanban Board on Github repository is used.
We’re satisfied with our current setup but are open to making changes as needed in the future.

---- 

## The requirements addressed in this milestone.

Since we are using an existing project, the following features according to requirements specification is implemented for this milestone.
- All of the required fields in post creation is implemended. (Requirements specification 2.3.1)
- Post editing is implemented. (Requirements specification 2.3.4)
- Post deletion is implemented. (Requirements specification 2.3.4)

---

## Individual contributions.

### Enes Duman

**Responsibilities:**

I was responsible for integrating key functionalities and resolving issues in the codebase. Specifically, I implemented the EDIT and DELETE features for posts, addressed login issues from the previous project and deployed the repository to Google Cloud VM.
**My contributions are mainly:**
- Provided the base project as the foundation for team collaboration.
- Implemented EDIT and DELETE functionality for posts.
- Resolved login issues encountered in the previous version of the project.
- Added mandatory fields to post creation.
- Deployed the project to Google Cloud VM for accessibility and scalability.
**Code-Related ones:**
- EDIT and DELETE for Posts: https://github.com/betulnesibe/swe574-Spring25/issues/20
    Bugs related to this: https://github.com/betulnesibe/swe574-Spring25/issues/27

- Login Issue Fixes: https://github.com/betulnesibe/swe574-Spring25/issues/25

- Mandatory fields implementation: https://github.com/betulnesibe/swe574-Spring25/issues/21

**Non-Code-Related ones:**
- Helped others with project setup and transition from the previous project.
- Assisted teammates in understanding and working with the existing codebase.
- Provided documentation and guidelines for deployment on Google Cloud VM. Though deployment is mainly done via our shell script!

**Pull Requests Created, Merged, and Reviewed:**
https://github.com/betulnesibe/swe574-Spring25/pull/29

**Additional Information:**
N/A

### Eray Kahraman

**Responsibilities:**
- Frontend, Code reviewer, Testing

**Main Contributions**

- My main contributions until now are revising requirements and comparing current level of the project with the target, in order to extract work plan and issues to be created

**Code-related significant issues** 
  - Contribute code reviews and provide feedback for implementations.
  - Set up of local development environment (Issue #39)

**Non-code-related significant issues:**

  - Requirements specification: I have revised requirements according to feedbacks.
  - Work plan: Created work plan together with team.

**Pull requests created, merged, and reviewed:**
- Colloborated multiple code reviews, created no individual pull request.

**Additional information:**
- N/A

### Nesibe Betül Döner
- Responsibilities: Project communicato, Frontend, Code reviewer, Project manager, Design & document, Presenter.
- Main contributions: During this period, my primary contributions have been in project management and documentation, as we are building upon an existing project (Enes’). Enes has been guiding the team as we onboard and integrate into the project. Most of our meetings focus on understanding the existing code structure, and we contribute according to Enes’ lead on coding tasks. In addition, I have been responsible for writing meeting notes and maintaining other project documentation.
- Code-related significant issues: 
  - Set up of local development environment (Issue #15) (Issue #15)
  - I attended coding meetings and reviewed and provided feedback.  
- Non-code-related significant issues:
_(Note: Many of these tasks required collaboration and shared decision-making, but I took the lead on documenting our progress.)_
  - Communication Plan (#1): Collaboratively developed a communication plan for the team.
  - Issue Templates (#2): Alongside Yusuf, we created issue templates to streamline issue management and improve workflow.
  - Meeting Notes (#3): I have been documenting meeting notes since the beginning of the project, ensuring key discussions are captured.
  - Requirement Elicitation Questions (#4): Drafted the requirement elicitation questions and documented the corresponding answers.
  - Mock-up Screens for Web (#28): Worked with Yılmaz to design mock-up screens for the web platform using Canva. We integrated both existing and planned features into the screens.
  - Mock-up Scenario (#30): Developed the mock-up scenario for the platform’s user flow.
  - Milestone Report 1 (Issues #31, #32, #34, #35, #37): Participated in the creation of the milestone report as a group, with me documenting and writing the report based on our discussions and decisions.
- Pull requests: NA
- Additional information: NA

## Osman Yusuf Yıldırım

**Responsibilities:**
- Mobile application development
- API integration
- Git workflow management
- Knowledge sharing and code reviews

**Main contributions:**

My primary contributions involved setting up the mobile application structure for API calls and integrating data models corresponding to each API endpoint. I shared my professional experience with the team to facilitate smooth integration and effective development practices.

**Code-related significant issues:**

- Structured the mobile app's API interaction layer, including setting up and integrating data models for each endpoint.
- Managed the Git workflow for the application, ensuring proper branching, merging, and version control practices.
- Conducted detailed code reviews to maintain high standards and improve code quality across the project.

**Non-code-related significant issues:**

- Created and assigned tasks to facilitate organized integration into the development progress.
- Actively participated in discussions and provided insights based on my professional background to enhance overall project practices and team development workflows.

**Pull requests created, merged, and reviewed:**

- Conducted multiple code reviews to facilitate smooth integration of team contributions; no significant merge conflicts encountered.

**Additional information:**

- N/A


### **Group Member Name: Yılmaz**  
- **Responsibilities:** Backend development, mobile development, DevOps, code review, and testing.  
- **Main contributions** for Customer Milestone 1:  
  - [Mockup screens](https://github.com/betulnesibe/swe574-Spring25/wiki/Mock%E2%80%90up-Screens): I worked with Nesibe to create mock-up screens for the web platform using Canva. We included both current and future features in the designs.
  - [Requirement specification](https://github.com/betulnesibe/swe574-Spring25/wiki/Requirements-Specification)
  - Provide feedback on pull requests in the repository.
- **Code-related significant issues:**  
  - I reviewed and provided feedback on code edits made on the backend and frontend during code meetings.
  - Set up of local development environment (Issue #15) (Issue #15)
- **Non-code-related significant issues:**  
  - Reviewed and contributed to requirement specifications.  
- **Pull requests that you have created, merged, and reviewed:**  
  - I took part in several code reviews but didn’t create any individual pull requests.
- **Additional information:**  
  - N/A




