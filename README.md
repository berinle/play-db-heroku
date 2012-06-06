## Sample CRUD play2 applicaiton
Working configuration

NOTE: Even with the recent update to heroku for play2 apps, evolutions are still not done by default, so you either need to update $JAVA_OPTS using **heroku config:add** or keep you **Profile** with the contents below.

**Procfile** must contain this:
	web: target/start -Dhttp.port=${PORT} -DapplyEvolutions.default=true -Ddb.default.driver=org.postgresql.Driver -Ddb.default.url=$DATABASE_URL ${JAVA_OPTS}
	
Also see: [Heroku Play20 Support](https://groups.google.com/forum/?fromgroups#!topic/play-framework/Vf83JoxHc-4)	