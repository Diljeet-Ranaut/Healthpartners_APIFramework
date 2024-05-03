package com.health.API.tests;

import com.health.API.api.StatusCode;
import com.health.API.pojo.payload.Practitioners_Pojo;
import com.health.API.api.applicationAPI.PractitionerAPI;
import com.health.API.utils.DataLoader;
import io.qameta.allure.Description;
import io.qameta.allure.*;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static com.health.API.api.ProjectConstants.*;
import static com.health.API.utils.CommonHandler.assertStatusCode;
import static com.health.API.utils.CommonHandler.getPractitionerBuilder;
import static io.qameta.allure.SeverityLevel.CRITICAL;
import static org.hamcrest.MatcherAssert.assertThat;

@Epic("Play List")
@Feature("Playlist API")
public class PractitionerTests extends BaseTests {

    //Report generate: allure serve allure-results
// CMD Maven: mvn clean test -DBaseURI=https://webuat1.healthpartners.com
    @Story(" Any Story name")
    @Severity(CRITICAL)
    @Owner("Daljeet Singh Ranot")
    @Link(name = "Website", url = "https://google.com/")
    @Issue("MAR-7422")
    @TmsLink("TMS-1234")
    @Description("This is Schema test")
    @Test(description = "Schema validation for Slots")
    public void shouldBeAbleToValidateSlotsSchema() {
        List<Integer> practitionerIds = new ArrayList<>();
        practitionerIds.add(practitionerId);
        Practitioners_Pojo payload = getPractitionerBuilder(practitionerIds, slotLimit, lng, lat, appointmentType);
        Response response = PractitionerAPI.post(payload, DataLoader.getInstance().getPractitioner_slot_endPoint(), DataLoader.getInstance().getSlot_Schema_Path());
        assertStatusCode(response.statusCode(), StatusCode.CODE_200);
    }


}