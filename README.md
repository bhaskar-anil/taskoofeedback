# taskoofeedback
feedback api for taskoo

## Supports following APIs:
 1. `/api/feedbacks/ofseeker`
 2. `/api/feedbacks/ofseeker`

`POST`

```json
{
	"task" : {
		"id" : 100,
		"title" : "i want to move my sofa",
		"taskCode" : "i_want_to_move_sofa"
	},
	"category" : {
		"id" : 100,
		"title" : "packers and movers",
		"categoryCode" : "packers_movers"
	},
	
	"feedbackData" : [
		{
			"feedbackMaster" : {
				"id" : 10,
				"feedbackMasterTitle" : "Quality of work"
			},
			"rating" : 4,
			"comment" : null
		},
		{
			"feedbackMaster" : {
				"id" : 20,
				"feedbackMasterTitle" : "Professionalism"
			},
			"rating" : 4,
			"comment" : null
		}
		],
	
	"user" : {
		"id" : 1,
		"email" : "asdads@mail.com",
		"shortName" : "shibani jena",
		"longName" : "shibani shankar jena cto"
	},
	
	"comment" : "i am really happy about the service provided to me, i want to get serviced again"
}
```
