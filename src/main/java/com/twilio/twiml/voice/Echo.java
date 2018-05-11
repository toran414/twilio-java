/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.twiml.voice;

import com.twilio.twiml.TwiML;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * TwiML wrapper for {@code <Echo>}
 */
public class Echo extends TwiML {
    /**
     * For XML Serialization/Deserialization
     */
    private Echo() {
        this(new Builder());
    }

    /**
     * Create a new {@code <Echo>} element
     */
    private Echo(Builder b) {
        super("Echo", Collections.<TwiML>emptyList(), b.options);
    }

    /**
     * Create a new {@code <Echo>} element
     */
    public static class Builder {
        private Map<String, String> options = new HashMap<>();

        /**
         * Set additional attributes on this TwiML element that will appear in generated
         * XML.
         */
        public Builder option(String key, String value) {
            this.options.put(key, value);
            return this;
        }

        /**
         * Create and return resulting {@code <Echo>} element
         */
        public Echo build() {
            return new Echo(this);
        }
    }
}