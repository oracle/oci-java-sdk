/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * WebTier Policy <br>
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
        builder = AppExtensionWebTierPolicyApp.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AppExtensionWebTierPolicyApp
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "webTierPolicyJson",
        "webTierPolicyAZControl",
        "resourceRef"
    })
    public AppExtensionWebTierPolicyApp(
            String webTierPolicyJson,
            WebTierPolicyAZControl webTierPolicyAZControl,
            Boolean resourceRef) {
        super();
        this.webTierPolicyJson = webTierPolicyJson;
        this.webTierPolicyAZControl = webTierPolicyAZControl;
        this.resourceRef = resourceRef;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Store the web tier policy for an application as a string in Javascript Object
         * Notification (JSON) format.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: request - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("webTierPolicyJson")
        private String webTierPolicyJson;

        /**
         * Store the web tier policy for an application as a string in Javascript Object
         * Notification (JSON) format.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: request - type: string - uniqueness: none
         *
         * @param webTierPolicyJson the value to set
         * @return this builder
         */
        public Builder webTierPolicyJson(String webTierPolicyJson) {
            this.webTierPolicyJson = webTierPolicyJson;
            this.__explicitlySet__.add("webTierPolicyJson");
            return this;
        }
        /**
         * Webtier policy AZ Control
         *
         * <p>*Added In:** 19.2.1
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("webTierPolicyAZControl")
        private WebTierPolicyAZControl webTierPolicyAZControl;

        /**
         * Webtier policy AZ Control
         *
         * <p>*Added In:** 19.2.1
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: string - uniqueness: none
         *
         * @param webTierPolicyAZControl the value to set
         * @return this builder
         */
        public Builder webTierPolicyAZControl(WebTierPolicyAZControl webTierPolicyAZControl) {
            this.webTierPolicyAZControl = webTierPolicyAZControl;
            this.__explicitlySet__.add("webTierPolicyAZControl");
            return this;
        }
        /**
         * If this Attribute is true, resource ref id and resource ref name attributes will we
         * included in wtp json response.
         *
         * <p>*Added In:** 19.2.1
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceRef")
        private Boolean resourceRef;

        /**
         * If this Attribute is true, resource ref id and resource ref name attributes will we
         * included in wtp json response.
         *
         * <p>*Added In:** 19.2.1
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: boolean - uniqueness: none
         *
         * @param resourceRef the value to set
         * @return this builder
         */
        public Builder resourceRef(Boolean resourceRef) {
            this.resourceRef = resourceRef;
            this.__explicitlySet__.add("resourceRef");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AppExtensionWebTierPolicyApp build() {
            AppExtensionWebTierPolicyApp model =
                    new AppExtensionWebTierPolicyApp(
                            this.webTierPolicyJson, this.webTierPolicyAZControl, this.resourceRef);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AppExtensionWebTierPolicyApp model) {
            if (model.wasPropertyExplicitlySet("webTierPolicyJson")) {
                this.webTierPolicyJson(model.getWebTierPolicyJson());
            }
            if (model.wasPropertyExplicitlySet("webTierPolicyAZControl")) {
                this.webTierPolicyAZControl(model.getWebTierPolicyAZControl());
            }
            if (model.wasPropertyExplicitlySet("resourceRef")) {
                this.resourceRef(model.getResourceRef());
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
     * Store the web tier policy for an application as a string in Javascript Object Notification
     * (JSON) format.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: request - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("webTierPolicyJson")
    private final String webTierPolicyJson;

    /**
     * Store the web tier policy for an application as a string in Javascript Object Notification
     * (JSON) format.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: request - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getWebTierPolicyJson() {
        return webTierPolicyJson;
    }

    /**
     * Webtier policy AZ Control
     *
     * <p>*Added In:** 19.2.1
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: string - uniqueness: none
     */
    public enum WebTierPolicyAZControl implements com.oracle.bmc.http.internal.BmcEnum {
        Server("server"),
        Local("local"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(WebTierPolicyAZControl.class);

        private final String value;
        private static java.util.Map<String, WebTierPolicyAZControl> map;

        static {
            map = new java.util.HashMap<>();
            for (WebTierPolicyAZControl v : WebTierPolicyAZControl.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        WebTierPolicyAZControl(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static WebTierPolicyAZControl create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'WebTierPolicyAZControl', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Webtier policy AZ Control
     *
     * <p>*Added In:** 19.2.1
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("webTierPolicyAZControl")
    private final WebTierPolicyAZControl webTierPolicyAZControl;

    /**
     * Webtier policy AZ Control
     *
     * <p>*Added In:** 19.2.1
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public WebTierPolicyAZControl getWebTierPolicyAZControl() {
        return webTierPolicyAZControl;
    }

    /**
     * If this Attribute is true, resource ref id and resource ref name attributes will we included
     * in wtp json response.
     *
     * <p>*Added In:** 19.2.1
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceRef")
    private final Boolean resourceRef;

    /**
     * If this Attribute is true, resource ref id and resource ref name attributes will we included
     * in wtp json response.
     *
     * <p>*Added In:** 19.2.1
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getResourceRef() {
        return resourceRef;
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
        sb.append("AppExtensionWebTierPolicyApp(");
        sb.append("super=").append(super.toString());
        sb.append("webTierPolicyJson=").append(String.valueOf(this.webTierPolicyJson));
        sb.append(", webTierPolicyAZControl=").append(String.valueOf(this.webTierPolicyAZControl));
        sb.append(", resourceRef=").append(String.valueOf(this.resourceRef));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AppExtensionWebTierPolicyApp)) {
            return false;
        }

        AppExtensionWebTierPolicyApp other = (AppExtensionWebTierPolicyApp) o;
        return java.util.Objects.equals(this.webTierPolicyJson, other.webTierPolicyJson)
                && java.util.Objects.equals(
                        this.webTierPolicyAZControl, other.webTierPolicyAZControl)
                && java.util.Objects.equals(this.resourceRef, other.resourceRef)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.webTierPolicyJson == null ? 43 : this.webTierPolicyJson.hashCode());
        result =
                (result * PRIME)
                        + (this.webTierPolicyAZControl == null
                                ? 43
                                : this.webTierPolicyAZControl.hashCode());
        result = (result * PRIME) + (this.resourceRef == null ? 43 : this.resourceRef.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
