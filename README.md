Start redis:

```
docker run --rm --name my-redis -p 6379:6379 -d redis
```

Run unit tests.

Stop redis:

```
docker stop my-redis
```