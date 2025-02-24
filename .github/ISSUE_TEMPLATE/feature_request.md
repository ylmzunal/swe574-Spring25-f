name: Feature Request
description: Suggest a new feature or enhancement
title: "[FEATURE] <Short description>"
labels: enhancement
assignees: ''

body:
  - type: markdown
    attributes:
      value: "## 🚀 Feature Request\nA clear and concise description of the feature."

  - type: textarea
    attributes:
      label: "Why is this feature needed?"
      description: "Explain the problem this feature will solve."
      placeholder: "Describe the need for this feature..."
    validations:
      required: true

  - type: textarea
    attributes:
      label: "Proposed Solution"
      description: "Describe how this feature should work."
      placeholder: "Provide a detailed solution or approach."
    validations:
      required: true

  - type: textarea
    attributes:
      label: "Alternatives Considered"
      description: "Have you considered other solutions?"
      placeholder: "Describe any alternative solutions you've thought about."
  
  - type: checkboxes
    attributes:
      label: "Checklist"
      description: "Before submitting, please check the following:"
      options:
        - label: "I have checked for duplicate issues."
          required: true
        - label: "I have described the feature in detail."
          required: true
