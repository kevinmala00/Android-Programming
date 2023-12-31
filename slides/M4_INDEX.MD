
## [M1] ACTIVITY, INTENT AND UI DESIGN
* APPLICATION STRUCTURE
	+ application lifecycle and priority
	+ application core components
* ACTIVITY AND INTENT
	+ [intro](https://developer.android.com/guide/components/activities/intro-activities)
		- *Task and Android multitasking system*
	+ [activity lifecycle](https://developer.android.com/guide/components/activities/activity-lifecycle)
	+ [context](https://developer.android.com/reference/android/content/Context)
	+ activity class and methods
		- finish()
		- setContentView()
		- findViewById()
	+ [managing lifecycle](https://developer.android.com/guide/components/activities/activity-lifecycle)
		- oncreate(), 
		- onstart(), 
		- onresume(), 
		- onpause(), 
		- onstop(), 
		- onrestart(), 
		- ondestroy()), 
	+ [Save and restore UI state](https://developer.android.com/guide/components/activities/activity-lifecycle#saras)
		- onSaveInstanceState(Bundle outState), 
		- onRestoreInstanceState(Bundle savedInstanceState) 	
	+ appcompatactivity
	+ creating activities
		- extends activity or appcopatactivity class
		- add activity on manifest (automatic if you create activity with new->activity
	+ [intent](https://developer.android.com/reference/android/content/Intent)
		- starting activities and sharing data between activities
		- ~~resolving intents and resolveActivity() method~~
		- ~~intent filters~~
		- ~~[Starting Activities and Getting Results]( https://developer.android.com/reference/android/app/Activity#starting-activities-and-getting-results)~~
* UI DESING
	+ intro
	+ view hierarchy
	+ view - widgets
		- android widget toolbox (button, textview, editext, )
	+ view group - layout
		- constraint layout
		- linear layout
		- relative layout
		- frame layout
		- scroll view
	+ optimizing layout
	+ handling events
	+ ~~view binding~~
	+ ~~Material design~~
