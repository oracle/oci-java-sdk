/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

/**
 * Listing Resource Version
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AppCatalogListingResourceVersion.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class AppCatalogListingResourceVersion {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("listingId")
        private String listingId;

        public Builder listingId(String listingId) {
            this.listingId = listingId;
            this.__explicitlySet__.add("listingId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timePublished")
        private java.util.Date timePublished;

        public Builder timePublished(java.util.Date timePublished) {
            this.timePublished = timePublished;
            this.__explicitlySet__.add("timePublished");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("listingResourceId")
        private String listingResourceId;

        public Builder listingResourceId(String listingResourceId) {
            this.listingResourceId = listingResourceId;
            this.__explicitlySet__.add("listingResourceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("listingResourceVersion")
        private String listingResourceVersion;

        public Builder listingResourceVersion(String listingResourceVersion) {
            this.listingResourceVersion = listingResourceVersion;
            this.__explicitlySet__.add("listingResourceVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("availableRegions")
        private java.util.List<String> availableRegions;

        public Builder availableRegions(java.util.List<String> availableRegions) {
            this.availableRegions = availableRegions;
            this.__explicitlySet__.add("availableRegions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compatibleShapes")
        private java.util.List<String> compatibleShapes;

        public Builder compatibleShapes(java.util.List<String> compatibleShapes) {
            this.compatibleShapes = compatibleShapes;
            this.__explicitlySet__.add("compatibleShapes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("accessiblePorts")
        private java.util.List<Integer> accessiblePorts;

        public Builder accessiblePorts(java.util.List<Integer> accessiblePorts) {
            this.accessiblePorts = accessiblePorts;
            this.__explicitlySet__.add("accessiblePorts");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("allowedActions")
        private java.util.List<AllowedActions> allowedActions;

        public Builder allowedActions(java.util.List<AllowedActions> allowedActions) {
            this.allowedActions = allowedActions;
            this.__explicitlySet__.add("allowedActions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AppCatalogListingResourceVersion build() {
            AppCatalogListingResourceVersion __instance__ =
                    new AppCatalogListingResourceVersion(
                            listingId,
                            timePublished,
                            listingResourceId,
                            listingResourceVersion,
                            availableRegions,
                            compatibleShapes,
                            accessiblePorts,
                            allowedActions);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AppCatalogListingResourceVersion o) {
            Builder copiedBuilder =
                    listingId(o.getListingId())
                            .timePublished(o.getTimePublished())
                            .listingResourceId(o.getListingResourceId())
                            .listingResourceVersion(o.getListingResourceVersion())
                            .availableRegions(o.getAvailableRegions())
                            .compatibleShapes(o.getCompatibleShapes())
                            .accessiblePorts(o.getAccessiblePorts())
                            .allowedActions(o.getAllowedActions());

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
     * The OCID of the listing this resource version belongs to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("listingId")
    String listingId;

    /**
     * Date and time the listing resource version was published, in RFC3339 format.
     * Example: `2018-03-20T12:32:53.532Z`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timePublished")
    java.util.Date timePublished;

    /**
     * OCID of the listing resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("listingResourceId")
    String listingResourceId;

    /**
     * Resource Version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("listingResourceVersion")
    String listingResourceVersion;

    /**
     * List of regions that this listing resource version is available.
     * <p>
     * For information about Regions, see
     * [Regions](https://docs.cloud.oracle.com/#General/Concepts/regions.htm).
     * <p>
     * Example: `[\"us-ashburn-1\", \"us-phoenix-1\"]`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availableRegions")
    java.util.List<String> availableRegions;

    /**
     * Array of shapes compatible with this resource.
     * <p>
     * You may enumerate all available shapes by calling {@link #listShapes(ListShapesRequest) listShapes}.
     * <p>
     * Example: `[\"VM.Standard1.1\", \"VM.Standard1.2\"]`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compatibleShapes")
    java.util.List<String> compatibleShapes;

    /**
     * List of accessible ports for instances launched with this listing resource version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("accessiblePorts")
    java.util.List<Integer> accessiblePorts;
    /**
     **/
    @lombok.extern.slf4j.Slf4j
    public enum AllowedActions {
        Snapshot("SNAPSHOT"),
        BootVolumeDetach("BOOT_VOLUME_DETACH"),
        PreserveBootVolume("PRESERVE_BOOT_VOLUME"),
        SerialConsoleAccess("SERIAL_CONSOLE_ACCESS"),
        BootRecovery("BOOT_RECOVERY"),
        BackupBootVolume("BACKUP_BOOT_VOLUME"),
        CaptureConsoleHistory("CAPTURE_CONSOLE_HISTORY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, AllowedActions> map;

        static {
            map = new java.util.HashMap<>();
            for (AllowedActions v : AllowedActions.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        AllowedActions(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AllowedActions create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'AllowedActions', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Allowed actions for the listing resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("allowedActions")
    java.util.List<AllowedActions> allowedActions;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
