# Change Log
All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](http://keepachangelog.com/).

## 1.27.1 - 2020-12-08
### Added
- Support for Integration Service custom endpoint feature
- Support for metadata field in IdentityProvider Get and List response
- Support for fine-grained data analysis and improved SQL insights
- Support for ADB Dedicated - ORDS and SSL cert rotation at AEI
- Support for Maintenance Schedule feature for Exadata Infrastructure resources for ExaCC

## 1.27.0 - 2020-12-1
### Added
- Support for calling Oracle Cloud Infrastructure services in the sa-santiago-1 region
- Support for peer and OSN resources, as well as retry tokens, in the Blockchain Platform service
- Support for getting the availability status of management agents in the Management Agent service
- Support for the on-prem-connector resource type in the Data Safe service
- Support for service channels in the MySQL Database service
- Support for getting the creation type of backups, and for filtering backups by creation type in the MySQL Database service

### Breaking Changes
- Method `public java.util.Map getDefinedTags()` has been removed from EnableDataSafeConfigurationDetails in the Data Safe service
- Method `public java.util.Map getFreeformTags()` has been removed from EnableDataSafeConfigurationDetails in the Data Safe service

## 1.26.0 - 2020-11-17
### Added
- Support for specifying memory for AMD E3 shapes during node pool creation and update in the Container Engine for Kubernetes service
- Support for upgrading a database on a VM database system in the Database service
- Support for listing autonomous database clones in the Database service
- Support for Data Guard with autonomous container databases on Exadata Cloud at Customer in the Database service
- Support for getting the last login time of a user in the Identity service
- Support to bulk editing tags on resources in the Identity service

### Breaking Changes
- The models `AgentUpload`, `Attribute`, `FieldMap`, `GenerateAgentObjectNameDetails`, `LogAnalytics`, `LogAnalyticsSummary`, `OutOfBoxEntityTypeDetails`, `Query`, `QueryWorkRequestResource`, `ServiceTenancy`, `SortOrders`, `StringListDetails` are removed from the Log Analytics service
- The enum `name` removed value `CuslterSplit` and added `ClusterSplit` in the Log Analytics service
- Datatype for property status in ListWorkRequestsRequest changed from `com.oracle.bmc.containerengine.model.WorkRequestStatus` to `String` in the Container Engine service
- Method `public com.oracle.bmc.loganalytics.model.ErrorDetails getErrorDetails()` has been removed from DeleteAssociationsResponse in the Log Analytics service

## 1.25.4 - 2020-11-10
### Added
- Support for the 21C autonomous database version in the Database service
- Support for creating a Data Guard association with a standby database from a database software image in the Database service
- Support for specifying a TDE wallet password when creating a database or database system in the Database service
- Support for enabling access control lists for autonomous databases on Exadata Cloud At Customer in the Database service
- Support for private DNS resolvers, resolver endpoints, and views in the DNS service
- Support for getting a VCN and resolver association in the Networking service
- Support for additional parameters when updating subnets and VLANs in the Networking service
- Support for analytics clusters (database accelerators) in the MySQL Database service
- Support for migrations to Java Cloud Service and Oracle Weblogic Server instances that use existing databases in the Application Migration service
- Support for specifying reserved IPs when creating load balancers in the Load Balancing service

## 1.25.3 - 2020-11-03
### Added
- Support for calling Oracle Cloud Infrastructure services in the uk-cardiff-1 region
- Support for the Organizations service
- Support for the Optimizer service
- Support for tenancy ID and name on responses in the Usage service
- Support for object versioning in object lifecycle management in the Object Storage service
- Support for specifying a syslog URL for applications in the Functions service
- Support for creation of always-free NoSQL database tables in the NoSQL Database service

## 1.25.2 - 2020-10-27
### Added
- Support for the Compute Instance Agent service
- Support for key store resources and operations in the Database service
- Support for specifying a key store when creating autonomous container databases in the Database service

### Fixed
- Fixed a potential data curruption problem for binary data upload with `RefreshableOnNotAuthenticatedProvider`. We recommend that you update to this version `1.25.2` or later. For details, see https://github.com/oracle/oci-java-sdk/issues/255

## 1.25.1 - 2020-10-20
### Added
- Support for the Operations Insights service
- Support for updating autonomous databases to enable/disable Operations Insights service integration, in the Database service
- Support for the NEEDS_ATTENTION lifecycle state on database systems in the Database service
- Support for HCX in the VMware Solutions service

## 1.25.0 - 2020-10-13
### Added
- Support for API definitions in the API Gateway service
- Support for pattern-based logical entities, namespace-bound custom properties, and faceted search in the Data Catalog service
- Support for autonomous Data Guard on autonomous infrastructure in the Database service
- Support for creating a Data Guard association on an existing standby database home in the Database service
- Support for upgrading cloud VM cluster grid infrastructure in the Database service


### Breaking Changes
- Attribute `isQuickStart` & method `isQuickStart(Boolean isQuickStart)` in models `CreateLogSavedSearchDetails`, `LogSavedSearchSummary`,`UpdateLogSavedSearchDetails` and `LogSavedSearch` is removed from the Logging Management service
- Lifecycle State `DELETED` is removed from the Logging Management service

## 1.24.0 - 2020-10-06
### Added
- Support for calling Oracle Cloud Infrastructure services in the me-dubai-1 region
- Support for rotating keys on autonomous container databases and autonomous databases in the Database service
- Support for cloud Exadata infrastructure and cloud VM clusters in the Database service
- Support for controlling the display of tax banners in the Marketplace service
- Support for application references, patch changes, generic JDBC and MySQL data asset types, and publishing tasks to OCI Dataflow in the Data Integration service
- Support for disabling the legacy Instance Metadata endpoints v1 in the Compute service
- Support for instance configurations specifying instance options in the Compute Management service

### Breaking Changes
- Enum `ModelType` in the Data Integration service has restricted values to `Shape`, `InputPort`, `ShapeField`, `InputField`, `DerivedField`, `MacroField`, `OutputPort`, `DynamicProxyField`, `OutputPort`, `DynamicInputField`, `ProxyField`, `Parameter`
- The return type of method `getWrappedType()` in `com.oracle.bmc.dataintegration.model.ConfiguredType` has been changed from `com.oracle.bmc.dataintegration.model.BaseType` to `java.lang.Object` in the Data Integration Service

## 1.23.4 - 2020-09-29
### Added
- Support for specifying custom content dispositions when downloading objects in the Object Storage service
- Support for the “bring your own IP address” feature in the Virtual Networking service
- Support for updating the tags of instance console connections in the Compute service
- Support for custom SSL certificates on gateways in the API Gateway service

## 1.23.3 - 2020-09-22
### Added
- Support for software keys in the Key Management service
- Support for customer contacts on Exadata Cloud at Customer in the Database service
- Support for updating open modes and permission levels of autonomous databases in the Database service
- Support for flexible memory on VM instances in the Compute and Compute Management services

## 1.23.2 - 2020-09-15
### Added
- Support for the Cloud Guard service
- Support for specifying desired consumption models when creating instances in the Integration service
- Support for dynamic shapes in the Load Balancing service

## 1.23.1 - 2020-09-08
### Added
- Support for Logging Service
- Support for Logging Analytics Service
- Support for Logging Search Service
- Support for Logging Ingestion Service
- Support for Management Agent Cloud Service
- Support for Management Dashboard Service
- Support for Service Connector Hub service
- Support for Policy based Request/Response transformation in the API Gateway Service
- Support for sending diagnostic interrupt to a VM instance in the Compute Service
- Support for custom Database Software Images in the Database Service
- Support for getting and listing container database patches for Autonomous Container Database resources in the Database Service
- Support for updating patch id on maintenance run for Autonomous Container Database resources in the Database Service
- Support for searching Oracle Cloud resources across tenancies in the Search Service
- Documentation update for Logging Policies in the API Gateway service

## 1.23.0 - 2020-09-01
### Added
- Support for calling Oracle Cloud Infrastructure services in the ap-chiyoda-1 region
- Support for VM database cloning in the Database service
- Support for the MAINTENANCE_IN_PROGRESS lifecycle state on database systems, VM clusters, and Cloud Exadata in the Database service
- Support for provisioning refreshable clones in the Database service
- Support for new options on listeners and backend sets for specifying SSL protocols, SSL cipher suites, and server ordering preferences in the Load Balancing service
- Support for AMD flexible shapes with configurable CPU in the Container Engine for Kubernetes service
- Support for network sources in authentication policies in the Identity service


### Breaking Changes
- In the circuit breaker library, the parameter type of the `recordHttpStatuses` method in `com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration.CircuitBreakerConfigurationBuilder` was changed from `com.google.common.collect.ImmutableSet<Integer>` to `java.util.Set<Integer>`
- In the circuit breaker library, the return type for the `getRecordHttpStatuses()` method in `com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration` was changed from `com.google.common.collect.ImmutableSet<Integer>` to `java.util.Set<Integer>`
- In the circuit breaker library, the parameter type of the `recordExceptions` method in `com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration.CircuitBreakerConfigurationBuilder` was changed from `com.google.common.collect.ImmutableList<Class<? extends RuntimeException>>` to `java.util.List<Class<? extends RuntimeException>>`
- In the circuit breaker library, the return type for the `getRecordExceptions()` method in `com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration` was changed from `com.google.common.collect.ImmutableList<Class<? extends RuntimeException>>` to `java.util.List<Class<? extends RuntimeException>>`

## 1.22.1 - 2020-08-18
### Added
- Support for custom boot volume size and other node pool updates in the Container Engine for Kubernetes service
- Support for Data Guard on Exadata Cloud at Customer VM clusters in the Database service
- Support for stopping VM instances after scheduled maintenance or hypervisor reboots in the Compute service
- Support for creating and managing private endpoints in the Data Flow service

## 1.22.0 - 2020-08-11
### Added
- Support for autonomous json databases in the Database service
- Support for cleaning up uncommitted multipart uploads in the Object Storage service
- Support for additional list API filters in the Data Catalog service


### Breaking Changes
- Some unusable region enums were removed from the Support Management service
- Parameter `opcRetryToken` was removed from the Support Management service

## 1.21.0 - 2020-08-04
### Added
- Support for calling Oracle Cloud Infrastructure services in the uk-gov-cardiff-1 region
- Support for creating and managing private endpoints in the Data Flow service
- Support for changing instance shapes and restarting nodes in the Big Data service
- Support for additional versions (for example CSQL) in the Big Data service
- Support for creating stacks from compartments in the Resource Manager service

### Breaking Changes
- Renamed the property of `lifeCycleDetails` to `lifecycleDetails` from the model of `BlockchainPlatformSummary` and `BlockchainPlatformByHostname` in the Blockchain service

## 1.20.0 - 2020-07-28
### Added
- Support for calling Oracle Cloud Infrastructure services in the us-sanjose-1 region
- Support for updating the fault domain and launch options of VM instances in the Compute service
- Support for image capability schemas and schema versions in the Compute service
- Support for 'Patch Now' maintenance runs for autonomous Exadata infrastructure and autonomous container database resources in the Database service
- Support for automatic performance and cost tuning on volumes in the Block Storage service


### Breaking changes
- Removed the accessToken field from the GitlabAccessTokenConfigurationSourceProvider model in the Resource Manager service

## 1.19.4 - 2020-07-21
### Added
- Support for license types on instances in the Content and Experience service

## 1.19.3 - 2020-07-14
### Added
- Support for the Blockchain service
- Support for failing over an autonomous database that has Data Guard enabled in the Database service
- Support for switching over an autonomous database that has Data Guard enabled in the Database service
- Support for git configuration sources in the Resource Manager service
- Support for optionally specifying a VCN id on list operations of DHCP options, subnets, security lists, route tables, internet gateways, and local peering gateways in the Networking service

## 1.19.2 - 2020-07-07
### Added
- Support for registering and deregistering autonomous dedicated databases with Data Safe in the Database service
- Support for switching between non-private-endpoints and private endpoints on autonomous databases in the Database service
- Support for returning group names when listing identity provider groups in the Identity service
- Support for server-side object re-encryption in the Object Storage service
- Support for private endpoint (ingress) and public endpoint whitelisting in the Analytics Cloud service

## 1.19.1 - 2020-06-30
### Added
- Support for the Usage service
- Support for the VMware Provisioning service
- Support for applying one-off patches to databases in the Database service
- Support for layer-2 virtualization features on vlans in the Networking service
- Support for all AttachVolumeDetails and ParavirtualizedAttachVolumeDetails properties on instance configurations in the Compute Management service
- Support for setting HTTP header size and allowing invalid characters in HTTP request headers in the Load Balancing service

## 1.19.0 - 2020-06-23
### Added
- Support for the Data Integration service
- Support for updating database home IDs on databases in the Database service
- Support for backing up autonomous databases on Cloud at Customer in the Database service
- Support for managing autonomous VM clusters on Cloud at Customer in the Database service
- Support for accessing data assets via private endpoints in the Data Catalog service
- Support for dependency archive zip files to be specified for use by applications in the Data Flow service


### Breaking Changes
- Enum `LifeCycleState` in the Data Catalog service has restricted values to `Creating`, `Active`, `Inactive`, `Updating`, `Deleting`, `Deleted`, `Failed`, `Moving`
- Enum `TermWorkflowStatus` in the Data Catalog service has restricted values to `New`, `Approved`, `UnderReview`, `Escalated`
- Enum `JobScheduleType` in the Data Catalog service has restricted values to `Scheduled`, `Immediate`
- Enum `JobType` in the Data Catalog service has restricted values to `Harvest`, `Profiling`, `Sampling`, `Preview`, `Import`, `Export`, `Internal`, `Purge`, `Immediate`, `Scheduled`, `Immediate_Execution`, `ScheduledExecution`, `ScheduledExecutionInstance`
- Enum `HarvestStatus` in the Data Catalog service has restricted values to `Complete`, `Error`, `InProgress`, `Deferred`
- Enum `JobExecutionState` in the Data Catalog service has restricted values to `Created`, `InProgress`, `Inactive`, `Failed`, `Succeeded`, `Canceled`
- Enum `ConnectionResult` in the Data Catalog service has restricted values to `Succeeded`, `Failed`

## 1.18.1 - 2020-06-16
### Added
- Support for creating a new database from an existing database based on a given timestamp in the Database service
- Support for enabling archive log backups of databases in the Database service
- Support for returning the database version on autonomous container databases in the Database service
- Support for the new DNS format of the Data Transfer service
- Support for scheduled autoscaling, which allows for scaling actions triggered at particular times based on CRON expressions, in the Compute Autoscaling service
- Support for filtering of list APIs for groups, identity providers, identity provider groups, compartments, dynamic groups, network sources, policies, and users by name or lifecycle state in the Identity Service

## 1.18.0 - 2020-06-09
### Added
- Support for returning the database version of backups in the Database service
- Support for patching on Exadata Cloud at Customer resources in the Database service
- Support for new lifecycle substates on instances in the Digital Assistant service
- Support for file servers in the Integration service
- Support for deleting non-empty tag namespaces and bulk deleting tags in the Identity service
- Support for bulk move and bulk delete of resources by compartment in the Identity service


### Breaking Changes
- Data type for paramater `dataStorageSizeInTBs` changed from `Integer` to `Double` in the Database service
- Enum `LifecycleState` has removed the state `Offline` and added `Disconnected` in the Database service

## 1.17.5 - 2020-06-02
### Added
- Support for optionally supplying a signature when deleting an agreement in the Marketplace service
- Support for launching paid listings in non-US regions in the Marketplace service
- Support for returning the image id of packages in the Marketplace service
- Support for calling Oracle Cloud Infrastructure services in the ap-chuncheon-1 region

## 1.17.4 - 2020-05-19
### Added
- Support for returning the private IP of a private endpoint database in the Database service
- Support for native JWT validation in the API Gateway service

## 1.17.3 - 2020-05-13
### Added
- Support for drift detection in the Resource Manager service

## 1.17.1 - 2020-05-05
### Added
- Support for updating the license type of database systems in the Database service
- Support for updating the version of 19c autonomous databases in the Database service
- Support for backup and restore functionality in the Key Management service
- Support for reports in the Marketplace service
- Support for calling Oracle Cloud Infrastructure services in the ap-hyderabad-1 region

## 1.17.0 - 2020-04-28
### Added
- Support for the MySQL Database service
- Support for updating the database home of a database in the Database service
- Support for government regions in the Marketplace service
- Support for starting and stopping instances in the Integration service
- Support for installing Windows updates in the OS Management service

### Breaking Changes
- Removed the models of `ErrataId`, `UpdatablePackageSummary`, `ManagedInstanceUpdateDetails` and the parameter `etag` from `ListWorkRequestErrorsResponse` and `ListWorkRequestLogsResponse` in the OsManagement service

## 1.16.0 - 2020-04-21
### Added
- Support for the Data Safe service
- Support for the Incident Management service
- Support for showing which database versions support always-free in the Database service
- Support in instance configurations for flex shapes, dedicated VM hosts, encryption in transit, and KMS keys in the Compute Autoscaling service
- Support for server-side object encryption using a customer-provided encryption key in the Object Storage service
- Support for specifying maintenance preferences while launching and updating Exadata Database systems in the Database service
- Support for flexible-shaped VM instances in the Compute service
- Support for scheduled cross-region backups in the Block Volume service
- Support for object versioning in the Object Storage service

### Breaking Changes
- Deleted models of `Archiver`, `CreateArchiverDetails` and `UpdateArchiverDetails` and operations of `CreateArchiver`, `GetArchiver`, `StartArchiver`, `StopArchiver` and `UpdateArchiver` in the streaming service

## 1.15.5 - 2020-04-14
### Added
- Support for access types on instances in the Content and Experience service
- Support for identity contexts in the Search service
- Support for Client Side Encryption: https://docs.cloud.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm

## 1.15.4 - 2020-04-07
### Added
- Support for changing compartments of runs and applications in the Data Flow service
- Support for getting usage information in the Key Management Vault service
- Support for custom Key Management service endpoints and private endpoints on stream pools in the Streaming service

## 1.15.3 - 2020-03-31
### Added
- Support for the Secrets Management service 
- Support for the Big Data service
- Support for updating class name, file URI, language, and spark version of applications in the Data Flow service
- Support for cross-region replication in the Object Storage service
- Support for retention rules in the Object Storage service
- Support for enabling and disabling pod security policy admission controllers in the Container Engine for Kubernetes service

## 1.15.2 - 2020-03-24
### Added
- Support for Web Application Acceleration and Security configurations on instances in the Content and Experience service
- Support for shared database homes on Exadata Cloud at Customer resources in the Database service
- Support for Exadata database creation from backup in the Database service
- Support for conditions on JavaScript challenges, new action types on access rules, new policy configuration settings, exclusions on custom protection rules, and IP address lists on IP whitelists in the Web Application Acceleration and Security service
- Support for circuit breakers using the `com.oracle.bmc.circuitbreaker.JaxRsCircuitBreaker` interface
- Better debug logging for retries and signing headers

## 1.15.1 - 2020-03-17
### Added
- Support for serial console connections in the Database service
- Support for preview database versions in the Database service
- Support for node reboot migration maintenance status and maintenance windows in the Database service
- Support for using instance metadata API v2 for instance principals authentication

### Fixed
- Retries for requests that take an `InputStream` as input will now function correctly.
- Retries will correctly report upload progress to the `ProgressReporter` for the Object Storage upload manager.

### Breaking changes
- In case retries are necessary, the number of `completed` bytes reported to the `ProgressReporter` will decrease. The `completed` bytes number is not monotonically increasing anymore.
- To allow retries, the `MultipartObjectAssembler` of the Object Storage upload manager will always allow overwriting existing parts.
- The `com.oracle.bmc.database.model.AutonomousExadataInfrastructureMaintenanceWindow` class and the `com.oracle.bmc.database.model.AutonomousExadataInfrastructureMaintenanceWindow$DayOfWeek` enum were removed. They were extraneous and not in use anywhere in the API.

## 1.14.0 - 2020-03-10
### Added
- Support for Events service integration with alerts in the Budgets service


### Breaking changes
- The `com.oracle.bmc.budget.requests.ListAlertRulesRequest$SortOrder` and `com.oracle.bmc.budget.requests.ListBudgetsRequest$SortOrder` enums have been replaced by the `com.oracle.bmc.budget.model.SortOrder` enum.
- The type of `com.oracle.bmc.budget.requests.ListAlertRulesRequest.sortBy` and `com.oracle.bmc.budget.requests.ListBudgetsRequest.sortBy` has been changed from `String` to the `com.oracle.bmc.budget.model.SortBy` enum.
- The type of `com.oracle.bmc.budget.requests.ListAlertRulesRequest.lifecycleState` and `com.oracle.bmc.budget.requests.ListBudgetsRequest.lifecycleState` has been changed from `String` to the `com.oracle.bmc.budget.model.LifecycleState` enum.

## 1.13.2 - 2020-03-03
### Added
- Support for updating the shape of a Database System in the Database service
- Support for generating CPE configurations for download in the Networking service
- Support for private IPs and fault domains of cluster nodes in the Container Engine for Kubernetes service
- Support for calling Oracle Cloud Infrastructure services in the ca-montreal-1 region

## 1.13.1 - 2020-02-25
### Added
- Support for restarting autonomous databases in the Database service
- Support for private endpoints on autonomous databases in the Database service
- Support for IP-based policies in the Identity service
- Support for management of OAuth 2.0 client credentials in the Identity service
- Support for OCI Functions as a subscription protocol in the Notifications service

## 1.13.0 - 2020-02-18
### Added
- Support for the NoSQL Database service
- Support for filtering database versions by storage management type in the Database service
- Support for specifying paid listing types within pricing models in the Marketplace service
- Support for primary and non-primary instance types in the Content and Experience service

### Breaking changes
- Removed LifecycleState enum in Marketplace service (was unused)

## 1.12.6 - 2020-02-11
### Added
- Support for listing supported database versions for Autonomous Database Serverless, and selecting a version at provisioning time in the Database service
- Support for TCP proxy protocol versions on listener connection configurations in the Load Balancer service
- Support for calling the Notifications service in alternate realms
- Support for calling Oracle Cloud Infrastructure services in the eu-amsterdam-1 and me-jeddah-1 regions

## 1.12.5 - 2020-02-04
### Added
- Support for the Data Science service
- Support for calling Oracle Cloud Infrastructure services in the ap-osaka-1 and ap-melbourne-1 regions

## 1.12.4 - 2020-01-28
### Added
- Support for the Application Migration service
- Support for the Data Flow service
- Support for the Data Catalog service
- Support for cross-shape Data Guard in the Database service
- Support for offline data export in the Data Transfer service

## 1.12.3 - 2020-01-21
### Added
- Support for getting DRG redundancy status in the Networking service
- Support for cloning autonomous databases from backups in the Database service

## 1.12.2 - 2020-01-14
### Added
- Support for a description field on route rules and security rules in the Networking service
- Support for starting and stopping Digital Assistant instances in the Digital Assistant service
- Support for shared database homes on Exadata, bare metal, and virtual machine instances in the Database service
- Support for tracking a number of Database service operations through the Work Requests service

## 1.12.1 - 2020-01-08
### Added
- Support for optionally specifying the corporate proxy field when creating Exadata infrastructure in the Database service
- Support for maintenance windows, and rescheduling maintenance runs, on autonomous container databases in the Database service

## 1.12.0 - 2019-12-17
### Added
- Support for the API Gateway service
- Support for the OS Management service
- Support for the Marketplace service
- Support for "default"-type vaults in the Key Management service
- Support for bringing your own keys in the Key Management service 
- Support for cross-region backups of boot volumes in the Block Storage service
- Support for top-level TSIG keys in the DNS service
- Support for resizing virtual machine instances to different shapes in the Compute service
- Support for management configuration of cloud agents in the Compute service
- Support for launching node pools using image IDs in the Container Engine for Kubernetes service

### Breaking changes
- Removed support for v1 auth tokens in kubeconfig files in the `CreateClusterKubeconfigContentDetails` class of the Container Engine for Kubernetes service
- Removed the IDCS access token requirement on the delete deleteOceInstance operation in the Content and Experience service, which is why the `DeleteOceInstanceDetails` class was removed

## 1.11.0 - 2019-12-10
### Added
- Support for etags on results of the List Objects API in the Object Storage service
- Support for OCIDs on buckets in the Object Storage service
- Support for content-disposition and cache-control headers on objects in the Object Storage service
- Support for recovering deleted compartments in the Identity service
- Support for sharing volumes across multiple instances in the Block Storage service
- Support for connect harnesses and stream pools in the Streaming service
- Support for associating file storage mount targets with network security groups in the File Storage service 
- Support for calling Oracle Cloud Infrastructure services in the uk-gov-london-1 region

### Breaking changes
- The `com.oracle.bmc.streaming.model.ArchiverLifecycleState` enum in the Streaming service has been replaced by the `com.oracle.bmc.streaming.model.Archiver.LifecycleState` enum

## 1.10.0 - 2019-11-26
### Added
- Support for maintenance windows on autonomous databases in the Database service
- Support for getting the compute units (OCPUs) of an Exadata autonomous transaction processing - dedicated resource in the Database service

### Breaking changes
- Create database home from VM_CLUSTER_BACKUP is removed from Database Service

## 1.9.5 - 2019-11-19
### Added
- Support for four-byte autonomous system numbers (ASNs) on FastConnect resources in the Networking service
- Support for choosing fault domains when creating instance pools in the Compute service
- Support for allowing connections from only specific VCNs to autonomous data warehouse and autonomous transaction processing instances in the Database service

## 1.9.4 - 2019-11-12
### Added
- Support for access to APEX and SQL Dev features on autonomous transaction processing and autonomous data warehouse resources in the Database service
- Support for registering / deregistering autonomous transaction processing and autonomous data warehouse resources with Data Safe in the Database service
- Support for redirecting HTTP / HTTPS request URIs to different URIs in the Load Balancing service
- Support for specifying compartments on options APIs in the Container Engine for Kubernetes service
- Support for volume performance units on block volumes in the Block Storage service

## 1.9.3 - 2019-11-05
### Added
- Support for the Analytics Cloud service
- Support for the Integration Cloud service
- Support for IKE versions in IPSec connections in the Virtual Networking service
- Support for getting a stack's Terraform state in the Resource Manager service

## 1.9.2 - 2019-10-29
### Added
- Support for wallet rotation operations on Autonomous Databases in the Database service
- Support for adding and removing image shape compatibility entries in the Compute service
- Support for managing redirects in the Web Application Acceleration and Security service
- Support for migrating zones from the Dyn HTTP Redirect Service to Oracle Cloud Infrastructure in the DNS service

## 1.9.1 - 2019-10-15
### Added
- Support for the Digital Assistant service
- Support for work requests on Instance Pool operations in the Compute service

## 1.9.0 - 2019-10-08
### Added
- Support for the new schema for events in the Audit service
- Support for entitlements in the Data Transfer service
- Support for custom scheduled backup policies on volumes in the Block Storage service
- Support for specifying the network type when launching virtual machine instances in the Compute service
- Support for Monitoring service integration in the Health Checks service

### Breaking changes
- For `com.oracle.bmc.dts.model.TransferApplianceEntitlement`:
	- The `Status` enum has been removed and replaced with `LifecycleState`
	- The `tenantId` parameter has been renamed as `id`
- The `eTag` parameter has been removed from `com.oracle.bmc.healthchecks.responses.ChangeHttpMonitorCompartmentResponse`
- The Audit service version to support the new schema was increased to 20190901.  Older versions of the SDK (< 1.9.0) will continue to function to support Audit service version 20160918

## 1.8.2 - 2019-10-01
### Added
- Support for required tags in the Identity service
- Support for work requests on tagging operations in the Identity service
- Support for enumerated tag values in the Identity service
- Support for moving dynamic routing gateway resources across compartments in the Networking service
- Support for migrating zones from Dyn managed DNS to OCI in the DNS service
- Support for fast provisioning for virtual machine databases in the Database service

## 1.8.1 - 2019-09-24
### Added
- Support for selecting the Terraform version to use in the Resource Manager service
- Support for bucket re-encryption in the Object Storage service
- Support for enabling / disabling bucket-level events in the Object Storage service

## 1.8.0 - 2019-09-17
### Added
- Support for importing state files in the Resource Manager service
- Support for Exadata Cloud at Customer in the Database service
- Support for free tier resources and system tags in the Load Balancing service
- Support for free tier resources and system tags in the Compute service
- Support for free tier resources and system tags in the Block Storage service
- Support for free tier and system tags on autonomous databases in the Database service

### Breaking
- The class `com.oracle.bmc.database.model.CreateDbHomeWithDbSystemIdBase` was renamed to `com.oracle.bmc.database.model.CreateDbHomeBase` that impacts the following references:
    - `CreateDbHomeRequest#createDbHomeWithDbSystemIdDetails` parameter type
    - `CreateDbHomeWithDbSystemIdDetails` class extension
    - `CreateDbHomeWithDbSystemIdFromBackupDetails` class extension

## 1.7.0 - 2019-09-10
### Added
- Support for specifying the `autoBackupWindow` field for scheduling backups in the Database service
- Support for network security groups on autonomous Exadata infrastructure in the Database service
- Support for Kubernetes secrets encryption in customer clusters, regional subnets, and cluster authentication for instance principals in the Container Engine for Kubernetes service
- Support for the Oracle Content and Experience service

### Breaking
- The etag field has been removed from the `com.oracle.bmc.ons.responses.ChangeTopicCompartmentResponse` and `com.oracle.bmc.ons.responses.ChangeSubscriptionCompartmentResponse` classes of the Notifications service

## 1.6.3 - 2019-09-03
### Added
- Support for the Sydney (SYD) region
- Support for managing cluster networks in the Compute Autoscaling service
- Support for tracking asynchronous operations via work requests in the Database service

## 1.6.2 - 2019-08-27
### Added
- Support for the Sao Paulo (GRU) region
- Support for dedicated virtual machine hosts in the Compute service
- Support for resource groups in metrics and alarms in the Monitoring service

## 1.6.1 - 2019-08-20
### Added
- Support for the Limits service
- Support for archiving to Object Storage in the Streaming service
- Support for etags on resources in the Streaming service
- Support for Key Management service (KMS) encryption of file systems in the File Storage service
- Support for moving public IP, DHCP, local peering gateway, internet gateway, network security group, and DRG attachment resources across compartments in the Networking service
- Support for multi-origin, basic cache, certificate mapping, and OCI Monitoring service integration in the Web Application Acceleration and Security service

### Changed
- Updated the Apache Connector Provider Add-On's transitive dependency on org.apache.httpcomponents:httpclient dependency to 4.5.9 to address the httpclient security vulnerability in normalizePath (see https://issues.apache.org/jira/browse/HTTPCLIENT-1803)

## 1.6.0 - 2019-08-13
### Added
- Support for the Data Transfer service
- Support for the Zurich (ZRH) region

### Breaking changes
- Breaking changes were made in the Web Application Acceleration and Security (WAAS) service:
    - `Certificate_subjectName` class was renamed to `CertificateIssuerName`
    - `Certificate_subjectName` class was renamed to `CertificateSubjectName`
    - `WafLog#timestamp` type was changed from `String` to `java.util.Date`
    - `WorkRequestOperationTypes#PurgeWaasPolicy` enum was removed
    - `ListCertificatesRequest#lifecycleState` and `ListWaasPoliciesRequest#lifecycleState` type was changed from `String` to `com.oracle.bmc.waas.model.LifecycleStates`
    - The `etag` parameter was removed from the following classes:
        - `AcceptRecommendationsResponse`
        - `DeleteWaasPolicyResponse`
        - `UpdateAccessRulesResponse`
        - `UpdateCaptchasResponse`
        - `UpdateDeviceFingerprintChallengeResponse`
        - `UpdateGoodBotsResponse`
        - `UpdateHumanInteractionChallengeResponse`
        - `UpdateJsChallengeResponse`
        - `UpdatePolicyConfigResponse`
        - `UpdateProtectionRulesResponse`
        - `UpdateProtectionSettingsResponse`
        - `UpdateThreatFeedsResponse`
        - `UpdateWaasPolicyResponse`
        - `UpdateWafAddressRateLimitingResponse`
        - `UpdateWafConfigResponse`
        - `UpdateWhitelistsResponse`

## 1.5.17 - 2019-08-06
### Added
- Support for IPv6 load balancers in the Load Balancing service
- Support for IPv6 on VCN and FastConnect resources in the Networking service

## 1.5.16 - 2019-07-30
### Added
- Support for the Mumbai (BOM) region
- Support for the Events service
- Support for moving streams across compartments in the Streaming service
- Support for moving FastConnect resources across compartments in the Networking service
- Support for moving policies across compartments in the Web Application Acceleration and Security service
- Support for tagging FastConnect resources in the Networking service

## 1.5.15 - 2019-07-23
### Added
- Support for moving resources across compartments in the Database service
- Support for moving resources across compartments in the Health Checks service
- Support for moving alarms across compartments in the Monitoring service
- Support for creating instance configurations from running instances in the Compute service
- Support for setting up budget alerts for cost tracking tags in the Budgets service

## 1.5.14 - 2019-07-16
### Added
- Support for the Functions service
- Support for the Quotas service
- Support for moving resources across compartments in the DNS service
- Support for moving instances across compartments in the Compute service
- Support for moving keys and vaults across compartments in the Key Management service
- Support for moving topics and subscriptions across compartments in the Notifications service
- Support for moving load balancers across compartments in the Load Balancing service
- Support for specifying permitted REST methods in load balancer rule sets in the Load Balancing service
- Support for configuring cookie session persistence in backend sets in the Load Balancing service
- Support for ACL rules in rule sets in the Load Balancing service
- Support for move compartment tree in the Identity service
- Support for specifying and returning a KMS key in backup operations in the Block Storage service
- Support for transit routing in the Networking service
- Support for authenticating via Resource Principals. An example of how to use resource principals is available on [GitHub](https://github.com/oracle/oci-java-sdk/tree/master/bmc-examples/src/main/java/FunctionsEphemeralResourcePrincipalAuthenticationDetailsProviderExample.java). This authentication method is only supported within the Functions service at this time.

## 1.5.13 - 2019-07-09
### Added
- Support for network security groups in the Load Balancing service
- Support for network security groups in Core Services
- Support for network security groups on database systems in the Database service
- Support for creating autonomous transaction processing and autonomous data warehouse previews in the Database service
- Support for getting the load balancer attachments of instance pools in the Compute service
- Support for moving resources across compartments in the Resource Manager service
- Support for moving VCN resources across compartments in the Networking service

## 1.5.12 - 2019-07-02
### Added
- Support for moving images, instance configurations, and instance pools across compartments in Core Services
- Support for moving autoscaling configurations across compartments in the Compute Autoscaling service

### Fixed
- Fixed a bug where the Streaming service's endpoints in Tokyo, Seoul, and future regions were not reachable from the SDK

## 1.5.11 - 2019-06-25
### Added
- Support for moving senders across compartments in the Email service
- Support for moving NAT gateway resources across compartments in Core Services

## 1.5.10 - 2019-06-18
### Added
- Support for moving service gateway resources across compartments in Core Services
- Support for moving block storage resources across compartments in Core Services
- Support for key deletion in the Key Management service

### Security
- Due to a security vulnerability in a dependency of older versions of the Java SDK, **it is important that you upgrade to this or a later version of the Java SDK**. Jackson-databind version 2.9.8, used by prior versions of the SDK, has known security vulnerabilities. The SDK now uses Jackson-databind version 2.9.9 which fixes these vulnerabilities.

## 1.5.9 - 2019-06-11
### Added
- Support for specifying custom boot volume sizes on instance configurations in the Compute Autoscaling service
- Support for 'Autonomous Transaction Processing - Dedicated' features, as well as maintenance run and backup operations on autonomous databases, autonomous container databases, and autonomous Exadata infrastructure in the Database service
- Support for retries in the Java SDK. An example of how to do this is available [here](https://github.com/oracle/oci-java-sdk/blob/master/bmc-examples/src/main/java/RetryExample.java)

### Fixed
- Non-buffered responses are now closed to fix connection leaks

## 1.5.8 - 2019-06-04
### Added
- Support for autoscaling autonomous databases and autonomous data warehouses in the Database service
- Support for specifying fault domains as part of instance configurations in the Compute Autoscaling service
- Support for deleting tag definitions and tag namespaces in the Identity service

### Fixed
- Support for regions in realms other than oraclecloud.com in the Load Balancing service

## 1.5.7 - 2019-05-28
### Added
- Support for the Work Requests service, and tracking of a number of Core Services operations through work requests
- Support for emulated volume attachments in Core Services
- Support for changing the compartment of resources in the File Storage service
- Support for tags in list operations in the File Storage service
- Support for returning UI password creation dates in the Identity service

## 1.5.6 - 2019-05-21
### Added
- Support for returning tags when listing instance configurations, instance pools, or autoscaling configurations in the Compute Autoscaling service
- Support for getting the namespace of another tenancy than the caller's tenancy in the Object Storage service
- Support for BGP dynamic routing and providing pre-shared secrets (PSKs) when establishing tunnels in the Networking service

## 1.5.5 - 2019-05-14
### Added
- Support for the Seoul (ICN) region
- Support for logging context fields on data-plane APIs of the Key Management Service
- Support for reverse pagination on list operations of the Email service
- Support for configuring backup retention windows on database backups in the Database service

## 1.5.4 - 2019-05-07
### Added
- Support for the Tokyo (NRT) region

## 1.5.2 - 2019-04-16
### Added
- Support for tagging dynamic groups in the Identity service
- Support for updating network ACLs and license types for autonomous databases and autonomous data warehouses in the Database service
- Support for editing static routes and IPSec remote IDs in the Virtual Networking service
 
## 1.5.1 - 2019-04-09
### Added
- Support for etag and if-match headers (for optimistic concurrency control) in the Email service
- RequestSigningFilter class that users can use for signing raw requests

## 1.5.0 - 2019-04-02
### Added
- Support for provider service key names on virtual circuits in the FastConnect service
- Support for customer reference names on cross connects and cross connect groups in the FastConnect service

### Changed
- Use of the SDK with Java 7 is no longer supported
- `com.oracle.bmc.Region` and `com.oracle.bmc.Realm` enumerations have been converted to classes to allow using the SDK with new unreleased regions and realms. An example of how to do this is available [here](https://github.com/oracle/oci-java-sdk/blob/master/bmc-examples/src/main/java/NewRegionAndRealmSupportWithoutSDKUpdate.java)

### Security
- Due to a security vulnerability in a dependency of older versions of the Java SDK, **it is important that you upgrade to this or a later version of the Java SDK**. Jackson-databind version 2.9.6, used by prior versions of the SDK, has known security vulnerabilities. The SDK now uses Jackson-databind version 2.9.8 which fixes these vulnerabilities.

## 1.4.4 - 2019-03-26
### Added
- Support for glob patterns and exclusions for object lifecycle management in the Object Storage service
- Documentation enhancements and corrections for traffic management in the DNS service

## 1.4.3 - 2019-03-19
### Added
- Support for specifying metadata on node pools in the Container Engine for Kubernetes service
- Support for provisioning a new autonomous database or autonomous data warehouse as a clone of another in the Database service

### Changed
- Most third-party dependencies are now shaded into the single shaded fat jar. Contrary to previous releases, this also includes Jersey; however, the shaded fat jar specifically excludes SLF4J along with BouncyCastle dependencies to allow customers to choose cryptography libraries based on their requirements (e.g., FIPS compliance).

## 1.4.2 - 2019-03-12
### Added
- Support for the Budgets service
- Support for managing multifactor authentication in the Identity service
- Support for managing default tags in the Identity service
- Support for account recovery in the Identity service
- Support for authentication policies in the Identity service
- Support for specifying the workload type when creating autonomous databases in the Database service
- Support for I/O resource management for Exadata database systems in the Database service
- Support for customer-specified timezones on database systems in the Database service

## 1.4.1 - 2018-02-28
### Added
- Support for the Monitoring service
- Support for the Notification service
- Support for the Resource Manager service
- Support for the Compute Autoscaling service
- Support for changing the compartment of a tag namespace in the Identity service
- Support for specifying fault domains in the Database service
- Support for managing instance monitoring in the Compute service
- Support for attaching/detaching load balancers to instance pools in the Compute service

## 1.4.0 - 2018-02-21
### Added
- Support for government-realm regions
- Support for the Streaming service
- Support for tags in the Key Management service
- Support for regional subnets in the Virtual Networking service

### Fixed
- Removed unused Announcements service `NotificationFollowupDetails` model and `getFollowups` operation

## 1.3.7 - 2018-02-07
### Added
- Support for the Web Application Acceleration and Security (WAAS) service
- Support for the Health Checks service
- Support for connection strings on Database resources in the Database service
- Support for traffic management in the DNS service
- Support for tagging in the Email service

## 1.3.6 - 2018-01-31
### Added
- Support for the Announcements service

## 1.3.5 - 2018-01-24
### Added
- Support for renaming databases during restore-from-backup operations in the Database service
- Support for calling Oracle Cloud Infrastructure services in the ca-toronto-1 region

### Changed
- Upgraded to Jersey version 2.27 and JAX-RS version 2.1

## 1.3.4 - 2019-01-10
### Added
- Support for device attributes on volume attachments in the Compute service
- Support for custom header rulesets in the Load Balancing service
- Add support to use RESTEasy with Java SDK. Examples can be found at [ResteasyClientWithObjectStorageExample](https://github.com/oracle/oci-java-sdk/blob/master/bmc-examples/src/main/java/ResteasyClientWithObjectStorageExample.java) and [InstancePrincipalsAuthenticationDetailsProviderWithResteasyClientExample](https://github.com/oracle/oci-java-sdk/blob/master/bmc-examples/src/main/java/InstancePrincipalsAuthenticationDetailsProviderWithResteasyClientExample.java)

### Fixed
- Reading entities from HTTP response without a Content-Type header no longer throws a NullPointerException

## 1.3.3 - 2018-12-13
### Added
- Support for Data Guard for VM shapes in the Database service
- Support for sparse disk groups for Exadata shapes in the Database service
- Support for a new field, isLatestForMajorVersion, when listing DB versions in the Database service
- Support for in-transit encryption for paravirtualized boot volume and data volume attachments in the Block Storage service
- Support for tagging DNS Zones in the DNS service
- Support for resetting credentials for SCIM clients associated with an Identity provider and updating user capabilities in the Identity service

### Fixed
- If the response body is an InputStream and the Content-Length header is available, the OCI Java SDK now throws an IOException if the data provided by the InputStream has a different size

## 1.3.2 - 2018-11-29
### Added
- Support for getting bucket statistics in the Object Storage service

### Fixed
- Storage service for copying volume backups across regions is now enabled
- Objects can now be retrieved from Object Storage even if their content type is invalid

## 1.3.1 - 2018-11-15
### Added
- Support for VCN transit routing in the Networking service

### Changed
- Bouncy Castle jar is no longer bundled within the shaded distribution `oci-java-sdk-shaded-full` and now must be included in the CLASSPATH.

## 1.3.0 - 2018-11-01
### Added
- Support for modifying the route table, DHCP options, and security lists associated with a subnet in the Networking service.
- Support for tagging of File Systems, Mount Targets, and Snapshots in the File Storage service.
- Support for nested compartments in the Identity service
- The region can be passed in via `SimpleAuthenticationDetailsProvider` and from config file using `ConfigFileAuthenticationDetailsProvider`

### Changed
- Passphrases are now passed as `char[]` instead of as `String`
- Optional headers that, when present, have to be signed are now included in the signature
- Attempts to parse the body only for responses that have Content-Type set to application/json; otherwise, it bails out and raises a generic `BmcException`

### Deprecated
- Methods accepting passphrases as `String` are deprecated; use `char[]` instead

### Notes
- The version is bumped to 1.3.0 due to breaking changes in previous release.

## 1.2.49 - 2018-10-18
### Added
- Support for cost tracking tags in the Identity service
- Support for generating and downloading wallets in the Database service
- Support for creating a standalone backup from an on-premises database in the Database service
- Support for db version and additional connection strings in the Autonomous Transaction Processing and Autonomous Data Warehouse resources of the Database service
- Support for copying volume backups across regions in the Block Storage service
- Support for deleting compartments in the Identity service
- Support for reboot migration for virtual machines in the Compute service
- Support for Instance Pools and Instance Configurations in the Compute service
- `lengthPerUploadPart` provides a simpler way to control the size of parts when using Upload Manager

### Breaking change
- The `dbDataSizeInMBs` field in the `com.oracle.bmc.database.model.Backup` and `com.oracle.bmc.database.model.BackupSummary` classes was renamed to `databaseSizeInGBs`, and its type was changed from `Integer` to `Double`
    - Before
    ```java
    private Integer dbDataSizeInMBs;
    ```
    - After
    ```java
    private Double databaseSizeInGBs;
    ```
- The data type of `databaseEdition` in the `com.oracle.bmc.database.model.Backup` and `com.oracle.bmc.database.model.Backup` classes was changed from `String` to `com.oracle.bmc.database.model.Backup.DatabaseEdition`
    - Before
    ```java
    private String databaseEdition;
    ```
    - After
    ```java
    private DatabaseEdition databaseEdition;
    ```

### Deprecated
- `UploadConfiguration.maxPartsForMultipartUpload` and `UploadConfiguration.minimumLengthPerUploadPart` in Upload Manager are now deprecated; use `UploadConfiguration.lengthPerUploadPart` instead


## 1.2.48 - 2018-10-04
### Added
- Support for trusted partner images through application listings and subscriptions in the Compute service
- Support for object lifecycle policies in the Object Storage service
- Support for copying objects across regions in the Object Storage service
- Support for network address translation (NAT) gateways in the Networking service

## 1.2.47 - 2018-09-27
### Added
- Support for `paravirtualized` launch mode when importing images in the Compute service
- Support for Key Management service
- Support for encrypting the contents of an Object Storage bucket using a Key Management service key
- Support for specifying a Key Management service key when launching a compute instance in the Compute service
- Support for specifying a Key Management service key when backing up or restoring a block storage volume in the Block Volume service

## 1.2.46 - 2018-09-06
### Added
- Support for updating metadata fields on an instance in the Compute service

## 1.2.45 - 2018-08-23
### Added
- Support for fault domains in the Identity service
- Support for Autonomous Data Warehouse and Autonomous Transaction Processing in the Database service
- Support for resizing an offline volume in the Block Storage service

## 1.2.44 - 2018-08-09
### Added
- Support for fault domains in the Compute service
- Support for configuring a connection pool and an HTTP(S) proxy with the apache connector add-on.  More information is available [here](http://github.com/oracle/oci-java-sdk/blob/master/bmc-addons/bmc-apache-connector-provider/README.md)

## 1.2.43 - 2018-07-26
### Added
- Support for the Search service. An example of how to call this service is available [here](https://github.com/oracle/oci-java-sdk/blob/master/bmc-examples/src/main/java/ResourceSearchExample.java)
- Support for specifying a backup policy when creating a boot volume in the Block Storage service
- Support for using the Java SDK in a FIPS compliant environment. Details available [here](https://docs.cloud.oracle.com/iaas/Content/API/SDKDocs/javasdkgettingstarted.htm#download)

## 1.2.42 - 2018-07-12
### Added
- Support for tagging Load Balancers in the Load Balancing service
- Support for export options in the File Storage service
- Support for retrieving compartment name and user name as part of events in the Audit service

## 1.2.41 - 2018-06-28
### Added
- Support for service gateway management in the Networking service
- Support for backup and clone of boot volumes in the Block Storage service

## 1.2.40 - 2018-06-14
### Added
- Support for the Container Engine service. A sample showing how to use this service from the SDK is available [here](https://github.com/oracle/oci-java-sdk/blob/master/bmc-examples/src/main/java/ContainerEngineClusterExample.java)

## 1.2.39 - 2018-05-31
### Added
- Support for the "soft shutdown" instance action in the Compute service
- Support for Auth Token management in the Identity service

## 1.2.38 - 2018-05-17

### Fixed
- Allow deserializing multiple query params
- Updated `GetInstancePublicIpExample` to now account for public IPs that may be associated with secondary private IP addresses

### Added
- Support for launching a database system from a backup in the Database service
- Support for backup or clone of multiple volumes at once using volume groups in the Block Storage service
- Support for the ability to optionally specify a compartment filter when listing exports in the File Storage service
- Support for tagging virtual cloud network resources in the Networking service
- Support for specifying the `PARAVIRTUALIZED` remote volume type when creating a virtual image or launching a new instance in the Compute service

## 1.2.37 - 2018-05-03

### Fixed
- `RestClientFactory` now uses the `JerseyClientBuilder` to create clients [issue#56](https://github.com/oracle/oci-java-sdk/issues/56)
- Shaded artifact now includes pom.xml [issue#57](https://github.com/oracle/oci-java-sdk/issues/57)

### Added
- Support for returning names for events in the Audit service
- Support for multiple hostnames per listener in the Load Balancing service
- Support waiting on multiple target states in `Waiter`

## 1.2.35 - 2018-04-19

### Fixed
- Upgraded Jackson to version 2.9.5 to address vulnerability [issue#55](https://github.com/oracle/oci-java-sdk/issues/55)
- PutObjectRequest does not callback invocationCallback object [issue#58](https://github.com/oracle/oci-java-sdk/issues/58)

### Added
- Support for tagging DbSystem and Database resources in the Database Service
- Support for filtering by `dbSystemId` in `listDbVersions` operation in Database Service

## 1.2.34 - 2018-04-05

### Fixed
- Provide better exception message when the required path parameter is empty

### Added
- Added example [here](https://github.com/oracle/oci-java-sdk/blob/master/bmc-examples/src/main/java/LaunchDbSystemExample.java) for how to launch a DB system
- Added example [here](https://github.com/oracle/oci-java-sdk/blob/master/bmc-examples/src/main/java/TaggingExample.java) for managing tags and tag namespaces, as well as how to apply freeform and defined tags to a resource

## 1.2.33 - 2018-03-27

### Added
- Added support for remote VCN peering across regions.  See [here](https://github.com/oracle/oci-java-sdk/blob/master/bmc-examples/src/main/java/RemotePeeringConnectionExample.java) for a sample
- Added support for calling Oracle Cloud Infrastructure services in the uk-london-1 (LHR) region
- Added a version of the Java SDK library that bundles several of its dependencies in shaded form

## 1.2.29 - 2018-03-08

### Added
- Added support for the Email Service. An example on how to call this service can be found [here](https://github.com/oracle/oci-java-sdk/blob/master/bmc-examples/src/main/java/EmailServiceExample.java)
- Added support for SMTP credentials in the Identity Service. An example of managing SMTP credentials is available in the email service example [here](https://github.com/oracle/oci-java-sdk/blob/master/bmc-examples/src/main/java/EmailServiceExample.java)
- Added support for paravirtualized volume attachments in Core Services. An example can be found [here](https://github.com/oracle/oci-java-sdk/blob/master/bmc-examples/src/main/java/VolumeAttachmentExample.java)
- Added support for variable size boot volumes in Core Services

## Changed
- Allowing additional client configurators, and starting builder pattern for clients
- Added an explicit pagination example [here](https://github.com/oracle/oci-java-sdk/blob/master/bmc-examples/src/main/java/PaginationExample.java)
- Updated [ListAuditEventsExample](https://github.com/oracle/oci-java-sdk/blob/master/bmc-examples/src/main/java/ListAuditEventsExample.java) to show other pagination techniques

## 1.2.28 - 2018-02-22

### Added
- Added support for the File Storage Service. An example on how to call this service can be found [here](https://github.com/oracle/oci-java-sdk/blob/master/bmc-examples/src/main/java/FileStorageServiceExample.java)
- Added support for tagging Bucket resources in the Object Storage Service
- Added support for specifying a restore period for archived objects in the `restoreObjects` operation of the Object Storage service
- Added `paginators` to provide an `Iterable` interface over list operations offered by the SDK

## 1.2.27 - 2018-02-08

### Fixed
- Bug fix for not serializing dates in request bodies correctly to RFC-3339

### Added
- Support for DNS Service. An example of calling this service is available [here](https://github.com/oracle/oci-java-sdk/blob/master/bmc-examples/src/main/java/DnsExample.java)
- Support for Reserved Public IPs in Virtual Networking Service
- Support for path route sets in Load Balancing Service
- Support for automated and policy-based backups, read-only volume attachments, and incremental backups in Block Storage Service
- Support for filtering by backupId in ListDbSystems operation in Database Service

## 1.2.23 - 2018-01-29

### Fixed
- Javadoc for the Object Storage Service is being generated again

## 1.2.22 - 2018-01-25

### Added
- Support for VNC console connections in Compute Service
- Support for using the `ObjectReadWithoutList` public access type when creating and updating buckets
- Support for dynamic groups in Identity Service
- Support for instance principals authentication when calling Oracle Cloud Infrastructure services, an example can be found on [GitHub](https://github.com/oracle/oci-java-sdk/blob/master/bmc-examples/src/main/java/InstancePrincipalsAuthenticationDetailsProviderExample.java)
- Support for configuring idle timeout for listeners in Load Balancer Service
- Better documentation on every model class on how the change in version [1.2.16 - 2017-10-12](#1216---2017-10-12) to only serialize and transmit fields that were explicitly set to null affects the `equals(Object)` and `hashCode()` methods

## 1.2.21 - 2018-01-11

### Added
- Support for tagging:
  - Support for creating, updating, retrieving and listing tags and tag namespaces (these operations can be found in Identity Service)
  - Support for adding freeform and defined tags to resources in Core Services (Networking, Compute, and Block Volume) and Identity Service
- Support for bringing your own custom image for emulation mode virtual machines in Compute Service

## 1.2.20 - 2017-12-11

### Added
- Support for retrieving custom operation metadata, such as the OCID of a resource, from responsePayload attribute on the AuditEvent model of the Audit Service
- Support for public peering for FastConnect
- Support for specifying an authorized entity name in a Letter of Authority for FastConnect
- Support for showing a list of bandwidth shapes for FastConnect provider

### Deprecated
- The `listVirtualCircuitBandwidthShapes` operation in `VirtualNetwork` has been deprecated. Use the `listFastConnectProviderVirtualCircuitBandwidthShapes` operation instead
- When using `CreateVirtualCircuitDetails`, supplying a `providerName` is deprecated and `providerServiceId` should be used instead

## 1.2.18 - 2017-11-27

### Changed
- Passphrases are now passed as char[] instead of as String
- Requests are now buffered in memory by default, except by the ObjectStorageClient and ObjectStorageAsyncClient. This allows for better error messages on PUT and POST requests. If you do not want to buffer requests in memory, pass an instance of `com.oracle.bmc.http.DefaultConfigurator.NonBuffering` to the constructor of the client.

### Added
- Support for VCN to VCN peering within region
- Support option for second NIC on X7 bare metal instances
- Support for user-managed boot volumes
- Support for creating database from backup in Database service
- Support for sort and filter in ListLoadBalancers method in Load Balancer Service

### Deprecated
- Methods accepting passphrases as String are deprecated; use char[] instead

## 1.2.17 - 2017-11-02

### Added
- Support for updating audit retention policy in Audit service
- Support for archive storage tier, object rename and namespace metadata in Object Storage service
- Support for fast clones of volumes in Block Storage service
- Support for backup and restore in Database service
- Support for sorting and filtering in list APIs in Core Services

## 1.2.16 - 2017-10-12

### Changed
- Removed javax.validation.constraints annotations from model classes. The annotations were not used, and may not necessarily be the same as the constraints enforced by the services.
- The clients only serialize and transmit fields that were explicitly set. If you want to transmit a field that is `null`, please set it to `null` explicitly.

### Added
- Support for database as a service (DBaaS)
- Support for VNIC routes and source/destination check
- Support for specifying block volume size in GB
- Support for updating console history metadata and specifying a display name when capturing console history
- Support for FRA Region (eu-frankfurt-1)
- Exceptions expose client-side request id in cases of timeout or client-side failure

### Deprecated
- Passing the block volume size in MB is deprecated

## 1.2.15 - 2017-09-11

### Changed
- Maven packages renamed from `oracle-bmc-*` to `oci-*` (group id renamed from `com.oracle.bmc.sdk` to `com.oracle.oci.sdk`)
- Default configuration file location changed from `~/.oraclebmc/config` to `~/.oci/config`; old location deprecated (see "Deprecated" below)

### Added
- Support for instance console connections
- Support for Load Balancer health status API
- Support for compartment renaming
- Support for CustomerSecretKeys management

### Deprecated
- The previous default configuration file location, `~/.oraclebmc/config`, has been deprecated: please use `~/.oci/config` instead. The old location still works, if file at new location does not exist.

## 1.2.13 - 2017-08-10
### Fixed
- Duplicable stream support (https://github.com/oracle/bmcs-java-sdk/issues/11)
- Fixed NullPointerException on invalid PEM key file

## 1.2.12 - 2017-07-20
### Fixed
- Reduced overhead in signing and serialization
- Removed possibility of using different serializer for signing and transmission

### Added
- Support for compute image import/export
- Support for multiple VNICs
- Support for secondary IPs

## 1.2.10 - 2017-06-09
### Added
- Support for object storage pre-authenticated requests and public buckets.
- Support for load balancer session persistence operations.
- Support for VCN local load balancer operations.
- Support for nested instance metadata operations.

## 1.2.8 - 2017-05-18
### Added
- Extended support for FastConnect
- Support for Private VCN
- Support for IAD Region (us-ashburn-1)

## 1.2.7 - 2017-04-27
### Changed
- A new value called UnknownEnumValue has been added to all enums that are used in responses returned from services. If a service returns a value that cannot be recognized by the version of the SDK, then the enum will be set to this value. Previously this would throw an exception.

### Added
- Support for FastConnect
- Support for Load Balancer Service

## 1.2.5 - 2017-04-06
### Changed
- Added opc-client-request-id truncation logic in MultipartObjectAssembler to prevent failures

### Added
- Support for DHCP Search Domain Option
- Support for Compute API 'getWindowsInstanceInitialCredentials'

## 1.2.4 - 2017-03-28
### Fixed
- Allow UUID in path elements
- Better validate path parameters before making requests (https://github.com/oracle/bmcs-java-sdk/issues/5)

### Changed
- Simplified classes that perform signing a little
- Move auth caching to an annotation

### Added
- New low level APIs for multi-part upload in Object Storage
- New high level abstractions for uploading (UploadManager, MultipartObjectAssembler) in Object Storage

## 1.2.3 - 2017-03-16
### Fixed
- Allow service responses to deserialize to base classes when unknown discriminators returned (vs. throwing exceptions)

### Changed
- Added a new layer for authentication details to provide for other forms of keyId based auth

### Added
- New DNS label feature
- New request signer classes to use directly with other HTTP clients
- New client constructors to allow more control over how requests are signed

## 1.2.2 - 2017-02-23
### Fixed
- Bugs in config file parsing

### Changed
- Updated APIs for VCN for stateless security lists
- Updated APIs for Compute for ipxe script support

### Added
- Support for Audit service
- BOM module for SDK
- More examples

## 1.2.0 - 2016-12-16
### Fixed
- Minor bug fixes from Fortify results
- 'Accept' content header based on expected response
- Bug in exponential backoff overflow

### Changed
- Build configuration (pom.xml files) greatly simplified
- Updated APIs for Object Storage
- Updated documentation
- Customizable request signer

## 1.1.0 - 2016-11-18
### Fixed
- Prevent NPE when no content-type header returned
- Waiter for DrgAttachment handles 404s for Detached state now
- Encoding all path and query parameters

### Changed
- Improved exception messaging when parsing private keys
- Annotations for internal classes exposed for documentation only
- Minor update to core/virtual network APIs and docs
- Doc updates

### Added
- 'content-*' headers can be set when calling PutObject in Object Storage Service
- Warning messages if auth key OCIDs do not match expected format
- Simplifications to load config from default location ("~/.oraclebmc/config")

## 1.0.1 - 2016-11-15
### Fixed
- Removed usage of the Grizzly Jersey connector, which was causing problems with PUT/POST requests

## 1.0.0 - 2016-10-20
### Added
- Initial Release
- Support added for Core Services, Identity Service, Object Storage Service
