$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/GetPodium.feature");
formatter.feature({
  "name": "Podium Test",
  "description": "  As a user\n  I want to\n  submit and retrieve the podium test details",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@UserJourney:get_adjustable_summary_calculation_by_id"
    }
  ]
});
formatter.scenario({
  "name": "Get Podium tests details",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@UserJourney:get_adjustable_summary_calculation_by_id"
    }
  ]
});
formatter.step({
  "name": "I retrieve podium test details https://podium-slns-interview.getsandbox.com/products",
  "keyword": "When "
});
formatter.match({
  "location": "PodiumSteps.getpodiumTestDetails(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should successfully be able to view the retrieved podium test details",
  "rows": [
    {
      "cells": [
        "data.id",
        "1"
      ]
    },
    {
      "cells": [
        "data.name",
        "5 yr fixed"
      ]
    },
    {
      "cells": [
        "data.lender.name",
        "Lender A"
      ]
    },
    {
      "cells": [
        "data.lender.logo",
        "https://via.placeholder.com/80x55"
      ]
    },
    {
      "cells": [
        "data.monthlyRepayment",
        "567"
      ]
    },
    {
      "cells": [
        "data.interestRate",
        "4.3"
      ]
    },
    {
      "cells": [
        "data.minAge",
        "18"
      ]
    },
    {
      "cells": [
        "data.maxAge",
        "70"
      ]
    },
    {
      "cells": [
        "data.loanToValue",
        "0.8"
      ]
    },
    {
      "cells": [
        "data.type",
        "fixed"
      ]
    },
    {
      "cells": [
        "data.initialTerm",
        "5"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "PodiumSteps.verifyPodiumTestDetails(String,String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "submit mortgage applicant details",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@UserJourney:get_adjustable_summary_calculation_by_id"
    }
  ]
});
formatter.step({
  "name": "I am a new mortgage applicant",
  "keyword": "Given "
});
formatter.match({
  "location": "PodiumSteps.newMortgageApplicant()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I submit my mortgage application",
  "keyword": "When "
});
formatter.match({
  "location": "PodiumSteps.submitMortgageApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be able  to successfully submit my mortgage application",
  "keyword": "Then "
});
formatter.match({
  "location": "PodiumSteps.verifySubmissionOfMortgageApplication()"
});
formatter.result({
  "status": "passed"
});
});