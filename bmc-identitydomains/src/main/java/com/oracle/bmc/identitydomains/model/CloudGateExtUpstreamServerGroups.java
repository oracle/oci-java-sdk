/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * A list of upstream server groups <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CloudGateExtUpstreamServerGroups.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CloudGateExtUpstreamServerGroups
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"value", "ref", "nginxSettings", "ssl", "displayName"})
    public CloudGateExtUpstreamServerGroups(
            String value, String ref, String nginxSettings, Boolean ssl, String displayName) {
        super();
        this.value = value;
        this.ref = ref;
        this.nginxSettings = nginxSettings;
        this.ssl = ssl;
        this.displayName = displayName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Name for the Upstream Block
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readOnly - required: true - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * Name for the Upstream Block
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readOnly - required: true - returned: default - type: string - uniqueness:
         * none
         *
         * @param value the value to set
         * @return this builder
         */
        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }
        /**
         * URI of the upstream server groups
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readOnly - required: false - returned: default - type: reference -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("$ref")
        private String ref;

        /**
         * URI of the upstream server groups
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readOnly - required: false - returned: default - type: reference -
         * uniqueness: none
         *
         * @param ref the value to set
         * @return this builder
         */
        public Builder ref(String ref) {
            this.ref = ref;
            this.__explicitlySet__.add("ref");
            return this;
        }
        /**
         * Any additional settings in nginx configuration form
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readOnly - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nginxSettings")
        private String nginxSettings;

        /**
         * Any additional settings in nginx configuration form
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readOnly - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param nginxSettings the value to set
         * @return this builder
         */
        public Builder nginxSettings(String nginxSettings) {
            this.nginxSettings = nginxSettings;
            this.__explicitlySet__.add("nginxSettings");
            return this;
        }
        /**
         * SSL flag for the Upstream Block
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readOnly - required: false - returned: default - type: boolean -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ssl")
        private Boolean ssl;

        /**
         * SSL flag for the Upstream Block
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readOnly - required: false - returned: default - type: boolean -
         * uniqueness: none
         *
         * @param ssl the value to set
         * @return this builder
         */
        public Builder ssl(Boolean ssl) {
            this.ssl = ssl;
            this.__explicitlySet__.add("ssl");
            return this;
        }
        /**
         * Display name of upstream
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readOnly - required: true - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Display name of upstream
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readOnly - required: true - returned: default - type: string - uniqueness:
         * none
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CloudGateExtUpstreamServerGroups build() {
            CloudGateExtUpstreamServerGroups model =
                    new CloudGateExtUpstreamServerGroups(
                            this.value, this.ref, this.nginxSettings, this.ssl, this.displayName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CloudGateExtUpstreamServerGroups model) {
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
            }
            if (model.wasPropertyExplicitlySet("ref")) {
                this.ref(model.getRef());
            }
            if (model.wasPropertyExplicitlySet("nginxSettings")) {
                this.nginxSettings(model.getNginxSettings());
            }
            if (model.wasPropertyExplicitlySet("ssl")) {
                this.ssl(model.getSsl());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Name for the Upstream Block
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: true - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * Name for the Upstream Block
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: true - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * URI of the upstream server groups
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: reference - uniqueness:
     * none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("$ref")
    private final String ref;

    /**
     * URI of the upstream server groups
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: reference - uniqueness:
     * none
     *
     * @return the value
     */
    public String getRef() {
        return ref;
    }

    /**
     * Any additional settings in nginx configuration form
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nginxSettings")
    private final String nginxSettings;

    /**
     * Any additional settings in nginx configuration form
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getNginxSettings() {
        return nginxSettings;
    }

    /**
     * SSL flag for the Upstream Block
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ssl")
    private final Boolean ssl;

    /**
     * SSL flag for the Upstream Block
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getSsl() {
        return ssl;
    }

    /**
     * Display name of upstream
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readOnly - required: true - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Display name of upstream
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readOnly - required: true - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CloudGateExtUpstreamServerGroups(");
        sb.append("super=").append(super.toString());
        sb.append("value=").append(String.valueOf(this.value));
        sb.append(", ref=").append(String.valueOf(this.ref));
        sb.append(", nginxSettings=").append(String.valueOf(this.nginxSettings));
        sb.append(", ssl=").append(String.valueOf(this.ssl));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CloudGateExtUpstreamServerGroups)) {
            return false;
        }

        CloudGateExtUpstreamServerGroups other = (CloudGateExtUpstreamServerGroups) o;
        return java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.ref, other.ref)
                && java.util.Objects.equals(this.nginxSettings, other.nginxSettings)
                && java.util.Objects.equals(this.ssl, other.ssl)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + (this.ref == null ? 43 : this.ref.hashCode());
        result =
                (result * PRIME)
                        + (this.nginxSettings == null ? 43 : this.nginxSettings.hashCode());
        result = (result * PRIME) + (this.ssl == null ? 43 : this.ssl.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
