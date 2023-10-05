package ai.ramsden;

import io.micronaut.http.annotation.*;

@Controller("/dental")
public class DentalController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}