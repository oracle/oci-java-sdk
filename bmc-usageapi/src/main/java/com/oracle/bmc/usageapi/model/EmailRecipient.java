/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.usageapi.model;

/**
 * The email recipient to receive usage statements for the subscription.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200107")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = EmailRecipient.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class EmailRecipient extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"firstName", "lastName", "emailId", "lifecycleState"})
    public EmailRecipient(
            String firstName, String lastName, String emailId, LifecycleState lifecycleState) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
        this.lifecycleState = lifecycleState;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * the first name of the recipient.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("firstName")
        private String firstName;

        /**
         * the first name of the recipient.
         * @param firstName the value to set
         * @return this builder
         **/
        public Builder firstName(String firstName) {
            this.firstName = firstName;
            this.__explicitlySet__.add("firstName");
            return this;
        }
        /**
         * the last name of the recipient.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lastName")
        private String lastName;

        /**
         * the last name of the recipient.
         * @param lastName the value to set
         * @return this builder
         **/
        public Builder lastName(String lastName) {
            this.lastName = lastName;
            this.__explicitlySet__.add("lastName");
            return this;
        }
        /**
         * the email of the recipient.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("emailId")
        private String emailId;

        /**
         * the email of the recipient.
         * @param emailId the value to set
         * @return this builder
         **/
        public Builder emailId(String emailId) {
            this.emailId = emailId;
            this.__explicitlySet__.add("emailId");
            return this;
        }
        /**
         * The email recipient lifecycle state.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The email recipient lifecycle state.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EmailRecipient build() {
            EmailRecipient model =
                    new EmailRecipient(
                            this.firstName, this.lastName, this.emailId, this.lifecycleState);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EmailRecipient model) {
            if (model.wasPropertyExplicitlySet("firstName")) {
                this.firstName(model.getFirstName());
            }
            if (model.wasPropertyExplicitlySet("lastName")) {
                this.lastName(model.getLastName());
            }
            if (model.wasPropertyExplicitlySet("emailId")) {
                this.emailId(model.getEmailId());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * the first name of the recipient.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("firstName")
    private final String firstName;

    /**
     * the first name of the recipient.
     * @return the value
     **/
    public String getFirstName() {
        return firstName;
    }

    /**
     * the last name of the recipient.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lastName")
    private final String lastName;

    /**
     * the last name of the recipient.
     * @return the value
     **/
    public String getLastName() {
        return lastName;
    }

    /**
     * the email of the recipient.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("emailId")
    private final String emailId;

    /**
     * the email of the recipient.
     * @return the value
     **/
    public String getEmailId() {
        return emailId;
    }

    /**
     * The email recipient lifecycle state.
     **/
    public enum LifecycleState {
        Active("ACTIVE"),
        Inactive("INACTIVE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The email recipient lifecycle state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The email recipient lifecycle state.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("EmailRecipient(");
        sb.append("super=").append(super.toString());
        sb.append("firstName=").append(String.valueOf(this.firstName));
        sb.append(", lastName=").append(String.valueOf(this.lastName));
        sb.append(", emailId=").append(String.valueOf(this.emailId));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EmailRecipient)) {
            return false;
        }

        EmailRecipient other = (EmailRecipient) o;
        return java.util.Objects.equals(this.firstName, other.firstName)
                && java.util.Objects.equals(this.lastName, other.lastName)
                && java.util.Objects.equals(this.emailId, other.emailId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.firstName == null ? 43 : this.firstName.hashCode());
        result = (result * PRIME) + (this.lastName == null ? 43 : this.lastName.hashCode());
        result = (result * PRIME) + (this.emailId == null ? 43 : this.emailId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
