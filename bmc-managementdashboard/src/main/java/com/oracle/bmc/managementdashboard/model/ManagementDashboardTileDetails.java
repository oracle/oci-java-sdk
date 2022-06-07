/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ManagementDashboardTileDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ManagementDashboardTileDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "savedSearchId",
        "row",
        "column",
        "height",
        "width",
        "nls",
        "uiConfig",
        "dataConfig",
        "state",
        "drilldownConfig",
        "parametersMap"
    })
    public ManagementDashboardTileDetails(
            String displayName,
            String savedSearchId,
            Integer row,
            Integer column,
            Integer height,
            Integer width,
            Object nls,
            Object uiConfig,
            java.util.List<Object> dataConfig,
            State state,
            Object drilldownConfig,
            Object parametersMap) {
        super();
        this.displayName = displayName;
        this.savedSearchId = savedSearchId;
        this.row = row;
        this.column = column;
        this.height = height;
        this.width = width;
        this.nls = nls;
        this.uiConfig = uiConfig;
        this.dataConfig = dataConfig;
        this.state = state;
        this.drilldownConfig = drilldownConfig;
        this.parametersMap = parametersMap;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Display name of the saved search.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    public String getDisplayName() {
        return displayName;
    }

    /**
     * ID of the saved search.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("savedSearchId")
    private final String savedSearchId;

    public String getSavedSearchId() {
        return savedSearchId;
    }

    /**
     * Tile's row number.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("row")
    private final Integer row;

    public Integer getRow() {
        return row;
    }

    /**
     * Tile's column number.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("column")
    private final Integer column;

    public Integer getColumn() {
        return column;
    }

    /**
     * The number of rows the tile occupies.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("height")
    private final Integer height;

    public Integer getHeight() {
        return height;
    }

    /**
     * The number of columns the tile occupies.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("width")
    private final Integer width;

    public Integer getWidth() {
        return width;
    }

    /**
     * JSON that contains internationalization options.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nls")
    private final Object nls;

    public Object getNls() {
        return nls;
    }

    /**
     * JSON that contains user interface options.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("uiConfig")
    private final Object uiConfig;

    public Object getUiConfig() {
        return uiConfig;
    }

    /**
     * Array of JSON that contain data source options.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataConfig")
    private final java.util.List<Object> dataConfig;

    public java.util.List<Object> getDataConfig() {
        return dataConfig;
    }

    /**
     * Current state of the saved search.
     **/
    public enum State {
        Deleted("DELETED"),
        Unauthorized("UNAUTHORIZED"),
        Default("DEFAULT"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(State.class);

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
    private final State state;

    public State getState() {
        return state;
    }

    /**
     * Drill-down configuration to define the destination of a drill-down action.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("drilldownConfig")
    private final Object drilldownConfig;

    public Object getDrilldownConfig() {
        return drilldownConfig;
    }

    /**
     * Specifies the saved search parameters values
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parametersMap")
    private final Object parametersMap;

    public Object getParametersMap() {
        return parametersMap;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ManagementDashboardTileDetails(");
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", savedSearchId=").append(String.valueOf(this.savedSearchId));
        sb.append(", row=").append(String.valueOf(this.row));
        sb.append(", column=").append(String.valueOf(this.column));
        sb.append(", height=").append(String.valueOf(this.height));
        sb.append(", width=").append(String.valueOf(this.width));
        sb.append(", nls=").append(String.valueOf(this.nls));
        sb.append(", uiConfig=").append(String.valueOf(this.uiConfig));
        sb.append(", dataConfig=").append(String.valueOf(this.dataConfig));
        sb.append(", state=").append(String.valueOf(this.state));
        sb.append(", drilldownConfig=").append(String.valueOf(this.drilldownConfig));
        sb.append(", parametersMap=").append(String.valueOf(this.parametersMap));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ManagementDashboardTileDetails)) {
            return false;
        }

        ManagementDashboardTileDetails other = (ManagementDashboardTileDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.savedSearchId, other.savedSearchId)
                && java.util.Objects.equals(this.row, other.row)
                && java.util.Objects.equals(this.column, other.column)
                && java.util.Objects.equals(this.height, other.height)
                && java.util.Objects.equals(this.width, other.width)
                && java.util.Objects.equals(this.nls, other.nls)
                && java.util.Objects.equals(this.uiConfig, other.uiConfig)
                && java.util.Objects.equals(this.dataConfig, other.dataConfig)
                && java.util.Objects.equals(this.state, other.state)
                && java.util.Objects.equals(this.drilldownConfig, other.drilldownConfig)
                && java.util.Objects.equals(this.parametersMap, other.parametersMap)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.savedSearchId == null ? 43 : this.savedSearchId.hashCode());
        result = (result * PRIME) + (this.row == null ? 43 : this.row.hashCode());
        result = (result * PRIME) + (this.column == null ? 43 : this.column.hashCode());
        result = (result * PRIME) + (this.height == null ? 43 : this.height.hashCode());
        result = (result * PRIME) + (this.width == null ? 43 : this.width.hashCode());
        result = (result * PRIME) + (this.nls == null ? 43 : this.nls.hashCode());
        result = (result * PRIME) + (this.uiConfig == null ? 43 : this.uiConfig.hashCode());
        result = (result * PRIME) + (this.dataConfig == null ? 43 : this.dataConfig.hashCode());
        result = (result * PRIME) + (this.state == null ? 43 : this.state.hashCode());
        result =
                (result * PRIME)
                        + (this.drilldownConfig == null ? 43 : this.drilldownConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.parametersMap == null ? 43 : this.parametersMap.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
