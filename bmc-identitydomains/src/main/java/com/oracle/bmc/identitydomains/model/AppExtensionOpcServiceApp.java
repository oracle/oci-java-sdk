/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * This extension defines attributes specific to Apps that represent instances of an Oracle Public
 * Cloud (OPC) service. <br>
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
        builder = AppExtensionOpcServiceApp.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AppExtensionOpcServiceApp
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "serviceInstanceIdentifier",
        "region",
        "currentFederationMode",
        "currentSynchronizationMode",
        "nextFederationMode",
        "nextSynchronizationMode",
        "enablingNextFedSyncModes"
    })
    public AppExtensionOpcServiceApp(
            String serviceInstanceIdentifier,
            String region,
            CurrentFederationMode currentFederationMode,
            CurrentSynchronizationMode currentSynchronizationMode,
            NextFederationMode nextFederationMode,
            NextSynchronizationMode nextSynchronizationMode,
            Boolean enablingNextFedSyncModes) {
        super();
        this.serviceInstanceIdentifier = serviceInstanceIdentifier;
        this.region = region;
        this.currentFederationMode = currentFederationMode;
        this.currentSynchronizationMode = currentSynchronizationMode;
        this.nextFederationMode = nextFederationMode;
        this.nextSynchronizationMode = nextSynchronizationMode;
        this.enablingNextFedSyncModes = enablingNextFedSyncModes;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * This value specifies the unique identifier assigned to an instance of an Oracle Public
         * Cloud service app.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: immutable - required: false - returned: default - type: string - uniqueness:
         * server
         */
        @com.fasterxml.jackson.annotation.JsonProperty("serviceInstanceIdentifier")
        private String serviceInstanceIdentifier;

        /**
         * This value specifies the unique identifier assigned to an instance of an Oracle Public
         * Cloud service app.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: immutable - required: false - returned: default - type: string - uniqueness:
         * server
         *
         * @param serviceInstanceIdentifier the value to set
         * @return this builder
         */
        public Builder serviceInstanceIdentifier(String serviceInstanceIdentifier) {
            this.serviceInstanceIdentifier = serviceInstanceIdentifier;
            this.__explicitlySet__.add("serviceInstanceIdentifier");
            return this;
        }
        /**
         * This value identifies the OPC region in which the service is running.
         *
         * <p>*Added In:** 19.1.4
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readOnly - required: false - returned: request - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("region")
        private String region;

        /**
         * This value identifies the OPC region in which the service is running.
         *
         * <p>*Added In:** 19.1.4
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readOnly - required: false - returned: request - type: string - uniqueness:
         * none
         *
         * @param region the value to set
         * @return this builder
         */
        public Builder region(String region) {
            this.region = region;
            this.__explicitlySet__.add("region");
            return this;
        }
        /**
         * Current Federation Mode
         *
         * <p>*Added In:** 18.2.6
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readOnly - required: false - returned: request - type: string
         */
        @com.fasterxml.jackson.annotation.JsonProperty("currentFederationMode")
        private CurrentFederationMode currentFederationMode;

        /**
         * Current Federation Mode
         *
         * <p>*Added In:** 18.2.6
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readOnly - required: false - returned: request - type: string
         *
         * @param currentFederationMode the value to set
         * @return this builder
         */
        public Builder currentFederationMode(CurrentFederationMode currentFederationMode) {
            this.currentFederationMode = currentFederationMode;
            this.__explicitlySet__.add("currentFederationMode");
            return this;
        }
        /**
         * Current Synchronization Mode
         *
         * <p>*Added In:** 18.2.6
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readOnly - required: false - returned: request - type: string
         */
        @com.fasterxml.jackson.annotation.JsonProperty("currentSynchronizationMode")
        private CurrentSynchronizationMode currentSynchronizationMode;

        /**
         * Current Synchronization Mode
         *
         * <p>*Added In:** 18.2.6
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readOnly - required: false - returned: request - type: string
         *
         * @param currentSynchronizationMode the value to set
         * @return this builder
         */
        public Builder currentSynchronizationMode(
                CurrentSynchronizationMode currentSynchronizationMode) {
            this.currentSynchronizationMode = currentSynchronizationMode;
            this.__explicitlySet__.add("currentSynchronizationMode");
            return this;
        }
        /**
         * Next Federation Mode
         *
         * <p>*Added In:** 18.2.6
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readOnly - required: false - returned: request - type: string
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nextFederationMode")
        private NextFederationMode nextFederationMode;

        /**
         * Next Federation Mode
         *
         * <p>*Added In:** 18.2.6
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readOnly - required: false - returned: request - type: string
         *
         * @param nextFederationMode the value to set
         * @return this builder
         */
        public Builder nextFederationMode(NextFederationMode nextFederationMode) {
            this.nextFederationMode = nextFederationMode;
            this.__explicitlySet__.add("nextFederationMode");
            return this;
        }
        /**
         * Next Synchronization Mode
         *
         * <p>*Added In:** 18.2.6
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readOnly - required: false - returned: request - type: string
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nextSynchronizationMode")
        private NextSynchronizationMode nextSynchronizationMode;

        /**
         * Next Synchronization Mode
         *
         * <p>*Added In:** 18.2.6
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readOnly - required: false - returned: request - type: string
         *
         * @param nextSynchronizationMode the value to set
         * @return this builder
         */
        public Builder nextSynchronizationMode(NextSynchronizationMode nextSynchronizationMode) {
            this.nextSynchronizationMode = nextSynchronizationMode;
            this.__explicitlySet__.add("nextSynchronizationMode");
            return this;
        }
        /**
         * If true, indicates that enablement is in progress started but not completed
         *
         * <p>*Added In:** 18.2.6
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readOnly - required: false - returned: request - type: boolean
         */
        @com.fasterxml.jackson.annotation.JsonProperty("enablingNextFedSyncModes")
        private Boolean enablingNextFedSyncModes;

        /**
         * If true, indicates that enablement is in progress started but not completed
         *
         * <p>*Added In:** 18.2.6
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readOnly - required: false - returned: request - type: boolean
         *
         * @param enablingNextFedSyncModes the value to set
         * @return this builder
         */
        public Builder enablingNextFedSyncModes(Boolean enablingNextFedSyncModes) {
            this.enablingNextFedSyncModes = enablingNextFedSyncModes;
            this.__explicitlySet__.add("enablingNextFedSyncModes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AppExtensionOpcServiceApp build() {
            AppExtensionOpcServiceApp model =
                    new AppExtensionOpcServiceApp(
                            this.serviceInstanceIdentifier,
                            this.region,
                            this.currentFederationMode,
                            this.currentSynchronizationMode,
                            this.nextFederationMode,
                            this.nextSynchronizationMode,
                            this.enablingNextFedSyncModes);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AppExtensionOpcServiceApp model) {
            if (model.wasPropertyExplicitlySet("serviceInstanceIdentifier")) {
                this.serviceInstanceIdentifier(model.getServiceInstanceIdentifier());
            }
            if (model.wasPropertyExplicitlySet("region")) {
                this.region(model.getRegion());
            }
            if (model.wasPropertyExplicitlySet("currentFederationMode")) {
                this.currentFederationMode(model.getCurrentFederationMode());
            }
            if (model.wasPropertyExplicitlySet("currentSynchronizationMode")) {
                this.currentSynchronizationMode(model.getCurrentSynchronizationMode());
            }
            if (model.wasPropertyExplicitlySet("nextFederationMode")) {
                this.nextFederationMode(model.getNextFederationMode());
            }
            if (model.wasPropertyExplicitlySet("nextSynchronizationMode")) {
                this.nextSynchronizationMode(model.getNextSynchronizationMode());
            }
            if (model.wasPropertyExplicitlySet("enablingNextFedSyncModes")) {
                this.enablingNextFedSyncModes(model.getEnablingNextFedSyncModes());
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
     * This value specifies the unique identifier assigned to an instance of an Oracle Public Cloud
     * service app.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: immutable - required: false - returned: default - type: string - uniqueness:
     * server
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceInstanceIdentifier")
    private final String serviceInstanceIdentifier;

    /**
     * This value specifies the unique identifier assigned to an instance of an Oracle Public Cloud
     * service app.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: immutable - required: false - returned: default - type: string - uniqueness:
     * server
     *
     * @return the value
     */
    public String getServiceInstanceIdentifier() {
        return serviceInstanceIdentifier;
    }

    /**
     * This value identifies the OPC region in which the service is running.
     *
     * <p>*Added In:** 19.1.4
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readOnly - required: false - returned: request - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("region")
    private final String region;

    /**
     * This value identifies the OPC region in which the service is running.
     *
     * <p>*Added In:** 19.1.4
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readOnly - required: false - returned: request - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getRegion() {
        return region;
    }

    /**
     * Current Federation Mode
     *
     * <p>*Added In:** 18.2.6
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readOnly - required: false - returned: request - type: string
     */
    public enum CurrentFederationMode implements com.oracle.bmc.http.internal.BmcEnum {
        None("None"),
        AppAsServiceProvider("AppAsServiceProvider"),
        AppAsIdentityProvider("AppAsIdentityProvider"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(CurrentFederationMode.class);

        private final String value;
        private static java.util.Map<String, CurrentFederationMode> map;

        static {
            map = new java.util.HashMap<>();
            for (CurrentFederationMode v : CurrentFederationMode.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        CurrentFederationMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static CurrentFederationMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'CurrentFederationMode', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Current Federation Mode
     *
     * <p>*Added In:** 18.2.6
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readOnly - required: false - returned: request - type: string
     */
    @com.fasterxml.jackson.annotation.JsonProperty("currentFederationMode")
    private final CurrentFederationMode currentFederationMode;

    /**
     * Current Federation Mode
     *
     * <p>*Added In:** 18.2.6
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readOnly - required: false - returned: request - type: string
     *
     * @return the value
     */
    public CurrentFederationMode getCurrentFederationMode() {
        return currentFederationMode;
    }

    /**
     * Current Synchronization Mode
     *
     * <p>*Added In:** 18.2.6
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readOnly - required: false - returned: request - type: string
     */
    public enum CurrentSynchronizationMode implements com.oracle.bmc.http.internal.BmcEnum {
        None("None"),
        AppAsTarget("AppAsTarget"),
        AppAsSource("AppAsSource"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(CurrentSynchronizationMode.class);

        private final String value;
        private static java.util.Map<String, CurrentSynchronizationMode> map;

        static {
            map = new java.util.HashMap<>();
            for (CurrentSynchronizationMode v : CurrentSynchronizationMode.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        CurrentSynchronizationMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static CurrentSynchronizationMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'CurrentSynchronizationMode', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Current Synchronization Mode
     *
     * <p>*Added In:** 18.2.6
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readOnly - required: false - returned: request - type: string
     */
    @com.fasterxml.jackson.annotation.JsonProperty("currentSynchronizationMode")
    private final CurrentSynchronizationMode currentSynchronizationMode;

    /**
     * Current Synchronization Mode
     *
     * <p>*Added In:** 18.2.6
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readOnly - required: false - returned: request - type: string
     *
     * @return the value
     */
    public CurrentSynchronizationMode getCurrentSynchronizationMode() {
        return currentSynchronizationMode;
    }

    /**
     * Next Federation Mode
     *
     * <p>*Added In:** 18.2.6
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readOnly - required: false - returned: request - type: string
     */
    public enum NextFederationMode implements com.oracle.bmc.http.internal.BmcEnum {
        None("None"),
        AppAsServiceProvider("AppAsServiceProvider"),
        AppAsIdentityProvider("AppAsIdentityProvider"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(NextFederationMode.class);

        private final String value;
        private static java.util.Map<String, NextFederationMode> map;

        static {
            map = new java.util.HashMap<>();
            for (NextFederationMode v : NextFederationMode.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        NextFederationMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static NextFederationMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'NextFederationMode', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Next Federation Mode
     *
     * <p>*Added In:** 18.2.6
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readOnly - required: false - returned: request - type: string
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nextFederationMode")
    private final NextFederationMode nextFederationMode;

    /**
     * Next Federation Mode
     *
     * <p>*Added In:** 18.2.6
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readOnly - required: false - returned: request - type: string
     *
     * @return the value
     */
    public NextFederationMode getNextFederationMode() {
        return nextFederationMode;
    }

    /**
     * Next Synchronization Mode
     *
     * <p>*Added In:** 18.2.6
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readOnly - required: false - returned: request - type: string
     */
    public enum NextSynchronizationMode implements com.oracle.bmc.http.internal.BmcEnum {
        None("None"),
        AppAsTarget("AppAsTarget"),
        AppAsSource("AppAsSource"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(NextSynchronizationMode.class);

        private final String value;
        private static java.util.Map<String, NextSynchronizationMode> map;

        static {
            map = new java.util.HashMap<>();
            for (NextSynchronizationMode v : NextSynchronizationMode.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        NextSynchronizationMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static NextSynchronizationMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'NextSynchronizationMode', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Next Synchronization Mode
     *
     * <p>*Added In:** 18.2.6
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readOnly - required: false - returned: request - type: string
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nextSynchronizationMode")
    private final NextSynchronizationMode nextSynchronizationMode;

    /**
     * Next Synchronization Mode
     *
     * <p>*Added In:** 18.2.6
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readOnly - required: false - returned: request - type: string
     *
     * @return the value
     */
    public NextSynchronizationMode getNextSynchronizationMode() {
        return nextSynchronizationMode;
    }

    /**
     * If true, indicates that enablement is in progress started but not completed
     *
     * <p>*Added In:** 18.2.6
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readOnly
     * - required: false - returned: request - type: boolean
     */
    @com.fasterxml.jackson.annotation.JsonProperty("enablingNextFedSyncModes")
    private final Boolean enablingNextFedSyncModes;

    /**
     * If true, indicates that enablement is in progress started but not completed
     *
     * <p>*Added In:** 18.2.6
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readOnly
     * - required: false - returned: request - type: boolean
     *
     * @return the value
     */
    public Boolean getEnablingNextFedSyncModes() {
        return enablingNextFedSyncModes;
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
        sb.append("AppExtensionOpcServiceApp(");
        sb.append("super=").append(super.toString());
        sb.append("serviceInstanceIdentifier=")
                .append(String.valueOf(this.serviceInstanceIdentifier));
        sb.append(", region=").append(String.valueOf(this.region));
        sb.append(", currentFederationMode=").append(String.valueOf(this.currentFederationMode));
        sb.append(", currentSynchronizationMode=")
                .append(String.valueOf(this.currentSynchronizationMode));
        sb.append(", nextFederationMode=").append(String.valueOf(this.nextFederationMode));
        sb.append(", nextSynchronizationMode=")
                .append(String.valueOf(this.nextSynchronizationMode));
        sb.append(", enablingNextFedSyncModes=")
                .append(String.valueOf(this.enablingNextFedSyncModes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AppExtensionOpcServiceApp)) {
            return false;
        }

        AppExtensionOpcServiceApp other = (AppExtensionOpcServiceApp) o;
        return java.util.Objects.equals(
                        this.serviceInstanceIdentifier, other.serviceInstanceIdentifier)
                && java.util.Objects.equals(this.region, other.region)
                && java.util.Objects.equals(this.currentFederationMode, other.currentFederationMode)
                && java.util.Objects.equals(
                        this.currentSynchronizationMode, other.currentSynchronizationMode)
                && java.util.Objects.equals(this.nextFederationMode, other.nextFederationMode)
                && java.util.Objects.equals(
                        this.nextSynchronizationMode, other.nextSynchronizationMode)
                && java.util.Objects.equals(
                        this.enablingNextFedSyncModes, other.enablingNextFedSyncModes)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.serviceInstanceIdentifier == null
                                ? 43
                                : this.serviceInstanceIdentifier.hashCode());
        result = (result * PRIME) + (this.region == null ? 43 : this.region.hashCode());
        result =
                (result * PRIME)
                        + (this.currentFederationMode == null
                                ? 43
                                : this.currentFederationMode.hashCode());
        result =
                (result * PRIME)
                        + (this.currentSynchronizationMode == null
                                ? 43
                                : this.currentSynchronizationMode.hashCode());
        result =
                (result * PRIME)
                        + (this.nextFederationMode == null
                                ? 43
                                : this.nextFederationMode.hashCode());
        result =
                (result * PRIME)
                        + (this.nextSynchronizationMode == null
                                ? 43
                                : this.nextSynchronizationMode.hashCode());
        result =
                (result * PRIME)
                        + (this.enablingNextFedSyncModes == null
                                ? 43
                                : this.enablingNextFedSyncModes.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
