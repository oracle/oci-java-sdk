/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * This extension defines attributes specific to Apps that represent instances of Multicloud Service App
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AppExtensionMulticloudServiceAppApp.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AppExtensionMulticloudServiceAppApp
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"multicloudServiceType", "multicloudPlatformUrl"})
    public AppExtensionMulticloudServiceAppApp(
            MulticloudServiceType multicloudServiceType, String multicloudPlatformUrl) {
        super();
        this.multicloudServiceType = multicloudServiceType;
        this.multicloudPlatformUrl = multicloudPlatformUrl;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Specifies the service type for which the application is configured for multicloud integration. For applicable external service types, app will invoke multicloud service for runtime operations
         * <p>
         **Added In:** 2301202328
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: immutable
         *  - required: true
         *  - returned: request
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("multicloudServiceType")
        private MulticloudServiceType multicloudServiceType;

        /**
         * Specifies the service type for which the application is configured for multicloud integration. For applicable external service types, app will invoke multicloud service for runtime operations
         * <p>
         **Added In:** 2301202328
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: immutable
         *  - required: true
         *  - returned: request
         *  - type: string
         *  - uniqueness: none
         * @param multicloudServiceType the value to set
         * @return this builder
         **/
        public Builder multicloudServiceType(MulticloudServiceType multicloudServiceType) {
            this.multicloudServiceType = multicloudServiceType;
            this.__explicitlySet__.add("multicloudServiceType");
            return this;
        }
        /**
         * The multicloud platform service URL which the application will invoke for runtime operations such as AWSCredentials api invocation
         * <p>
         **Added In:** 2301202328
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: immutable
         *  - required: false
         *  - returned: request
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("multicloudPlatformUrl")
        private String multicloudPlatformUrl;

        /**
         * The multicloud platform service URL which the application will invoke for runtime operations such as AWSCredentials api invocation
         * <p>
         **Added In:** 2301202328
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: immutable
         *  - required: false
         *  - returned: request
         *  - type: string
         *  - uniqueness: none
         * @param multicloudPlatformUrl the value to set
         * @return this builder
         **/
        public Builder multicloudPlatformUrl(String multicloudPlatformUrl) {
            this.multicloudPlatformUrl = multicloudPlatformUrl;
            this.__explicitlySet__.add("multicloudPlatformUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AppExtensionMulticloudServiceAppApp build() {
            AppExtensionMulticloudServiceAppApp model =
                    new AppExtensionMulticloudServiceAppApp(
                            this.multicloudServiceType, this.multicloudPlatformUrl);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AppExtensionMulticloudServiceAppApp model) {
            if (model.wasPropertyExplicitlySet("multicloudServiceType")) {
                this.multicloudServiceType(model.getMulticloudServiceType());
            }
            if (model.wasPropertyExplicitlySet("multicloudPlatformUrl")) {
                this.multicloudPlatformUrl(model.getMulticloudPlatformUrl());
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
     * Specifies the service type for which the application is configured for multicloud integration. For applicable external service types, app will invoke multicloud service for runtime operations
     * <p>
     **Added In:** 2301202328
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: immutable
     *  - required: true
     *  - returned: request
     *  - type: string
     *  - uniqueness: none
     **/
    public enum MulticloudServiceType {
        AwsCognito("AWSCognito"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(MulticloudServiceType.class);

        private final String value;
        private static java.util.Map<String, MulticloudServiceType> map;

        static {
            map = new java.util.HashMap<>();
            for (MulticloudServiceType v : MulticloudServiceType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        MulticloudServiceType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static MulticloudServiceType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'MulticloudServiceType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Specifies the service type for which the application is configured for multicloud integration. For applicable external service types, app will invoke multicloud service for runtime operations
     * <p>
     **Added In:** 2301202328
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: immutable
     *  - required: true
     *  - returned: request
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("multicloudServiceType")
    private final MulticloudServiceType multicloudServiceType;

    /**
     * Specifies the service type for which the application is configured for multicloud integration. For applicable external service types, app will invoke multicloud service for runtime operations
     * <p>
     **Added In:** 2301202328
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: immutable
     *  - required: true
     *  - returned: request
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public MulticloudServiceType getMulticloudServiceType() {
        return multicloudServiceType;
    }

    /**
     * The multicloud platform service URL which the application will invoke for runtime operations such as AWSCredentials api invocation
     * <p>
     **Added In:** 2301202328
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: immutable
     *  - required: false
     *  - returned: request
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("multicloudPlatformUrl")
    private final String multicloudPlatformUrl;

    /**
     * The multicloud platform service URL which the application will invoke for runtime operations such as AWSCredentials api invocation
     * <p>
     **Added In:** 2301202328
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: immutable
     *  - required: false
     *  - returned: request
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getMulticloudPlatformUrl() {
        return multicloudPlatformUrl;
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
        sb.append("AppExtensionMulticloudServiceAppApp(");
        sb.append("super=").append(super.toString());
        sb.append("multicloudServiceType=").append(String.valueOf(this.multicloudServiceType));
        sb.append(", multicloudPlatformUrl=").append(String.valueOf(this.multicloudPlatformUrl));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AppExtensionMulticloudServiceAppApp)) {
            return false;
        }

        AppExtensionMulticloudServiceAppApp other = (AppExtensionMulticloudServiceAppApp) o;
        return java.util.Objects.equals(this.multicloudServiceType, other.multicloudServiceType)
                && java.util.Objects.equals(this.multicloudPlatformUrl, other.multicloudPlatformUrl)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.multicloudServiceType == null
                                ? 43
                                : this.multicloudServiceType.hashCode());
        result =
                (result * PRIME)
                        + (this.multicloudPlatformUrl == null
                                ? 43
                                : this.multicloudPlatformUrl.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
