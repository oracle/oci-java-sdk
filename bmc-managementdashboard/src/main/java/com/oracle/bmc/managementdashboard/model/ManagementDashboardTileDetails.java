/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.managementdashboard.model;

/**
 * Properties of the dashboard tile representing a saved search.
 * Tiles are laid out in a twelve column grid system with (0,0) at upper left corner.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200901")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ManagementDashboardTileDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ManagementDashboardTileDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("savedSearchId")
        private String savedSearchId;

        public Builder savedSearchId(String savedSearchId) {
            this.savedSearchId = savedSearchId;
            this.__explicitlySet__.add("savedSearchId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("row")
        private Integer row;

        public Builder row(Integer row) {
            this.row = row;
            this.__explicitlySet__.add("row");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("column")
        private Integer column;

        public Builder column(Integer column) {
            this.column = column;
            this.__explicitlySet__.add("column");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("height")
        private Integer height;

        public Builder height(Integer height) {
            this.height = height;
            this.__explicitlySet__.add("height");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("width")
        private Integer width;

        public Builder width(Integer width) {
            this.width = width;
            this.__explicitlySet__.add("width");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nls")
        private Object nls;

        public Builder nls(Object nls) {
            this.nls = nls;
            this.__explicitlySet__.add("nls");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("uiConfig")
        private Object uiConfig;

        public Builder uiConfig(Object uiConfig) {
            this.uiConfig = uiConfig;
            this.__explicitlySet__.add("uiConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataConfig")
        private java.util.List<Object> dataConfig;

        public Builder dataConfig(java.util.List<Object> dataConfig) {
            this.dataConfig = dataConfig;
            this.__explicitlySet__.add("dataConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("state")
        private State state;

        public Builder state(State state) {
            this.state = state;
            this.__explicitlySet__.add("state");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("drilldownConfig")
        private Object drilldownConfig;

        public Builder drilldownConfig(Object drilldownConfig) {
            this.drilldownConfig = drilldownConfig;
            this.__explicitlySet__.add("drilldownConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parametersMap")
        private Object parametersMap;

        public Builder parametersMap(Object parametersMap) {
            this.parametersMap = parametersMap;
            this.__explicitlySet__.add("parametersMap");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ManagementDashboardTileDetails build() {
            ManagementDashboardTileDetails __instance__ =
                    new ManagementDashboardTileDetails(
                            displayName,
                            savedSearchId,
                            row,
                            column,
                            height,
                            width,
                            nls,
                            uiConfig,
                            dataConfig,
                            state,
                            drilldownConfig,
                            parametersMap);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManagementDashboardTileDetails o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .savedSearchId(o.getSavedSearchId())
                            .row(o.getRow())
                            .column(o.getColumn())
                            .height(o.getHeight())
                            .width(o.getWidth())
                            .nls(o.getNls())
                            .uiConfig(o.getUiConfig())
                            .dataConfig(o.getDataConfig())
                            .state(o.getState())
                            .drilldownConfig(o.getDrilldownConfig())
                            .parametersMap(o.getParametersMap());

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
     * Display name of the saved search.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * ID of the saved search.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("savedSearchId")
    String savedSearchId;

    /**
     * Tile's row number.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("row")
    Integer row;

    /**
     * Tile's column number.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("column")
    Integer column;

    /**
     * The number of rows the tile occupies.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("height")
    Integer height;

    /**
     * The number of columns the tile occupies.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("width")
    Integer width;

    /**
     * JSON that contains internationalization options.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nls")
    Object nls;

    /**
     * JSON that contains user interface options.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("uiConfig")
    Object uiConfig;

    /**
     * Array of JSON that contain data source options.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataConfig")
    java.util.List<Object> dataConfig;
    /**
     * Current state of the saved search.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum State {
        Deleted("DELETED"),
        Unauthorized("UNAUTHORIZED"),
        Default("DEFAULT"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, State> map;

        static {
            map = new java.util.HashMap<>();
            for (State v : State.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        State(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static State create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'State', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Current state of the saved search.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("state")
    State state;

    /**
     * Drill-down configuration to define the destination of a drill-down action.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("drilldownConfig")
    Object drilldownConfig;

    /**
     * Specifies the saved search parameters values
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parametersMap")
    Object parametersMap;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
