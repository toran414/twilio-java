/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.twiml.voice;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test class for {@link Echo}
 */
public class EchoTest {
    @Test
    public void testEmptyElement() {
        Echo elem = new Echo.Builder().build();

        Assert.assertEquals(
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<Echo/>",
            elem.toXml()
        );
    }

    @Test
    public void testEmptyElementUrl() {
        Echo elem = new Echo.Builder().build();

        Assert.assertEquals("%3C%3Fxml+version%3D%221.0%22+encoding%3D%22UTF-8%22%3F%3E%3CEcho%2F%3E", elem.toUrl());
    }

    @Test
    public void testElementWithExtraAttributes() {
        Echo elem = new Echo.Builder().option("foo", "bar").option("a", "b").build();

        Assert.assertEquals(
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<Echo a=\"b\" foo=\"bar\"/>",
            elem.toXml()
        );
    }
}