# springboot-joins-dto1

joining tables <br>
entity object - model <br>
request dto - save new request with foreign key <br>
response dto - custom response with new response model <br>

<br>

## model:
```
{
    "id": 14,
    "name": "Albert",
    "age": 22,
    "classroom": {
        "id": 1,
        "name": "A1"
    }
}
```

## post request:
```
    {
        "name": "Albert",
        "age": 22,
        "class_id": 1
    }
```

## response:
```
    {
        "id": 14,
        "name": "Albert",
        "age": 22,
        "classroom": "A1"
    }
```
