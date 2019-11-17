# taskoofeedback
feedback api for taskoo

## Supports following APIs:
 - `/api/feedbacks/ofseeker`
 - `/api/feedbacks/ofseeker`

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
			"feedbackOf" : {
				"id" : 10,
				"feedbackMaster" : "Quality of work"
			},
			"rating" : 4,
			"comment" : null
		},
		{
			"feedbackOf" : {
				"id" : 20,
				"feedbackMaster" : "Professionalism"
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
