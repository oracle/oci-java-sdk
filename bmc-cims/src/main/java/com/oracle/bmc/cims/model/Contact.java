/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cims.model;

/**
 * Contact details for the customer.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181231")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Contact.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class Contact {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("contactName")
        private String contactName;

        public Builder contactName(String contactName) {
            this.contactName = contactName;
            this.__explicitlySet__.add("contactName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("contactEmail")
        private String contactEmail;

        public Builder contactEmail(String contactEmail) {
            this.contactEmail = contactEmail;
            this.__explicitlySet__.add("contactEmail");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("contactPhone")
        private String contactPhone;

        public Builder contactPhone(String contactPhone) {
            this.contactPhone = contactPhone;
            this.__explicitlySet__.add("contactPhone");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("contactType")
        private ContactType contactType;

        public Builder contactType(ContactType contactType) {
            this.contactType = contactType;
            this.__explicitlySet__.add("contactType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Contact build() {
            Contact __instance__ =
                    new Contact(contactName, contactEmail, contactPhone, contactType);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Contact o) {
            Builder copiedBuilder =
                    contactName(o.getContactName())
                            .contactEmail(o.getContactEmail())
                            .contactPhone(o.getContactPhone())
                            .contactType(o.getContactType());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The name of the contact person.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("contactName")
    String contactName;

    /**
     * The email of the contact person.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("contactEmail")
    String contactEmail;

    /**
     * The phone number of the contact person.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("contactPhone")
    String contactPhone;
    /**
     * The type of contact, such as primary or alternate.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum ContactType {
        Primary("PRIMARY"),
        Alternate("ALTERNATE"),
        Secondary("SECONDARY"),
        Admin("ADMIN"),
        Manager("MANAGER"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, ContactType> map;

        static {
            map = new java.util.HashMap<>();
            for (ContactType v : ContactType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ContactType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ContactType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ContactType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The type of contact, such as primary or alternate.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("contactType")
    ContactType contactType;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
