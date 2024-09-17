# Change Log
All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](http://keepachangelog.com/).

## 3.49.0 - 2024-09-17
### Added 
- Support for calling Oracle Cloud Infrastructure services in the eu-crissier-1 region 
- Support for dedicated AI cluster unit shapes in the Generative AI service 
- Support for ticket numbers when creating access requests in the Managed Access service 
- Support for 23ai database, cloud VM clusters and VM cluster patching in the Exadata Fleet Update service 
- Support for text to speech feature in the AI Speech service 
- Support for notifications and transfer of capacity requests in the OCI Control Center service   

### Changed
- A new value called `UnknownEnumValue` has been added to the enums of the parent class when a subclass is in the responses returned from services. If a service returns a value that cannot be recognized by the version of the SDK, then the enum will be set to this value. Previously this would throw an exception.

### Breaking Changes 
- The field `occCustomerGroupId` was made mandatory for the `ListOccAvailabilityCatalogsInternalRequest` call in the OCI Control Center service

## 3.48.0 - 2024-08-27
### Added 
- Support for Delegate Access Control service 
- Support for upgrade and downgrade of shapes of high performance mount targets in the File Storage service 
- Support for private endpoints in the Object Storage service 
- Support for create, update, list and delete operations on scheduling policies and scheduling windows in the Database service 
- Support for specifying domains while creating data guard associations in the Database service 
- Support for provision of developer autonomous databases in the Database service 
- Support for upgrade of developer autonomous databases to paid autonomous databases in the Database service 
- Support for scheduling plans, actions, execution windows and execution actions for maintenance scheduling in the Database service 
- Support for cross-region replication of virtual vaults in the Key Management service 
- Support for listing all active service summaries in the Announcements service 
- Support for VMware major and minor version upgrades in VMware Solution service 
- Support for updating protected database subscriptions in the Autonomous Recovery service 
- Support for health insurance id as an allowed document type in the Document Understanding service 
- Support for advanced database management features for autonomous databases in the Database Management service 
- Support for propagating request ids to load balancer servers in the Load balancer service 
- Support for automatic update orders in Fusion Application as a Service    

### Breaking Changes 
- Method `public java.lang.String getDocumentId()` has been removed from the model `com.oracle.bmc.aidocument.model.DetectedDocumentType` in the Document Understanding service  
- Method `public java.lang.String getTenancyId()` has been removed from the model `com.oracle.bmc.aidocument.model.DocumentClassificationFeature` in the Document Understanding service  
- Method `public java.lang.String getTenancyId()` has been removed from the model `com.oracle.bmc.aidocument.model.DocumentKeyValueExtractionFeature` in the Document Understanding service  
- Field `InsuranceClaim` has been removed from the model `com.oracle.bmc.aidocument.model.DocumentType` in the Document Understanding service

## 3.47.0 - 2024-08-20
### Added 
- Support for Fleet Application Management service 
- Support for creating maintenance runs using autonomous database software images in the Database service 
- Support for Object Storage buckets, Oracle databases, Oracle databases on exascale Infrastructure, autonomous container databases, and autonomous container databases on Cloud at Customer in the Disaster Recovery service 
- Support for multiple sharing modes in the OCI Cache service 
- Support for extended data retention periods for instances in the Integration Cloud service 
- Support for SQL watch and lifecycle management in the Database management service 
- Support for identity domains and feature sets in the Analytics Cloud service 
- Support for automatically extending the storage space for MySQL DB systems in pre-defined increments in the MySQL Database service    

### Breaking Changes 
- Method `public com.oracle.bmc.disasterrecovery.model.DrPlanExecutionType getDrPlanExecutionType()` has been removed from `com.oracle.bmc.disasterrecovery.requests.ListDrPlanExecutionsRequest` in the Disaster Recovery service

## 3.46.1 - 2024-08-13
### Added 
- Support for calling Oracle Cloud Infrastructure services in the `me-abudhabi-4` region 
- Support for viewing subscription limits in the Limits service 
- Support for TCP idle timeout on network load balancer create and update operations in the Network Load Balancing service 
- Support for creating integration instances of type Healthcare in the Integration Cloud service

## 3.46.0 - 2024-08-06
### Added
- Support for calling Oracle Cloud Infrastructure services in the `me-riyadh-1` region
- Support for vertically scaling a Database system in the PostgreSQL service
- Support for flex shapes in the PostgreSQL service
- Support for new fork repository feature in the Source Code Management service
- Support for Developer Charts in the Source Code Management service
- Support for pull requests and merge in Source Code Management service
- Support for limiting custom and versioned custom software source content to the latest package versions in the OS Management service
- Support for Open Data Hub (ODH) patching in a staged manner in the Big Data service
- Support for Autoscale Memory Utilization in the Big Data service
- Support for Resource Principal configuration feature in the Big Data service
- Support for a new optional parameter compartment ID in the Java Management service
- Support for Agent Installer in the Java Management service
- Support for Java migration analysis request of deployed applications in the Java Management service
- Support for JmsPlugin in the Java Management service
- Support for improved cryptographic analysis result listing in the Java Management service
- Support for improved fleet agent configuration setting in the Java Management service
- Support for improved Java migration analysis result listing in the Java Management service
- Support for improved library usage summary in the Java Management service
- Support for improved performance tuning analysis result listing in the Java Management service
- Support for improved work request listing in the Java Management service

### Breaking Changes
- The property `credentials` was made required in the model `CreateDbSystemDetails` in the PostgreSQL service

## 3.45.0 - 2024-07-30
### Added
- Support for cluster placement groups on get operations in the Database service
- Support for baseline metric for imported resources and metric extensions in the Stack Monitoring service
- Support for implicit JIT and group membership provisioning during OpenID connect flow in the Identity Domains service
- Support for realtime speech and customizations in the AI Speech service
- Support for self-service instance maintenance API in the Compute service
- Support for GoldenGate suspend phase in the Database Migration service
- Support for creating custom alert policies in the Data Safe service
- Support for tunnel inspection in the Network firewall service
- Support for diagnostics collection preferences and custom GI images in the Exadata Fleet Update service
  
### Breaking Changes
- Method `public java.util.List getServicePrincipals()` has been removed from the model `com.oracle.bmc.identitydomains.model.IdentityPropagationTrust` in the Identity Domains service

## 3.44.4 - 2024-07-23
### Added
- Support for subscription id attribute in Cloud Exadata Infrastructure and Cloud VM Clusters in the Database service
- Support for SQL and FTP monitors on create and update operations in the Application Performance Monitoring service
- Support for MySQL Heatwave database systems in the Operations Insights service
- Support for creating and updating schedules for user assessments and security assessments in the Data Safe service
- Support for creating and updating sensitive data models of the tables for discovery in the Data Safe service
- Support for additional optional parameters on autonomous database create and update operations in the Database service

## 3.44.3 - 2024-07-16
### Added
- Support for calling Oracle Cloud Infrastructure services in the `me-abudhabi-2` region

## 3.44.1 - 2024-07-02
### Added
- Support for calling Oracle Cloud Infrastructure services in the `ap-singapore-2` region
- Support for additional parameters in list and delete operations in the File Storage service
- Support for host capacity planning to analyze disabled and deleted resources in the Operations Insights service
- Support for title and description updates in the Capacity Management service
- Support for listing parameters for migrations in the Database Migration service
- Support for Oracle exadata database service on exascale Infrastructure (ExaDB-XS) in the Database service

## 3.44.0 - 2024-06-25
### Added
- Support for MySQL to MySQL homogeneous migrations in the Database Migration service
- Support for manual cross-region backups in the MySQL Heatwave service
  
### Breaking Changes
- The models `AdvisorSettings`, `Agent`, `AgentCollection`, `AgentImageCollection`, `AgentImageSummary`, `AgentSummary`, `AwsS3DataTransferMediumDetails`, `AwsS3Details`, `ChangeAgentCompartmentDetails`, `ConnectDescriptor`, `CreateAdvisorSettings`, `CreateAwsS3Details`, `CreateConnectDescriptor`, `CreateDataPumpSettings`, `CreateDataTransferMediumDetails`, `CreateDatabaseLinkDetails`, `CreateDumpTransferDetails`, `CreateGoldenGateDetails`, `CreateGoldenGateHub`, `CreateGoldenGateServiceDetails`, `CreateGoldenGateServiceDetails`, `CreatePrivateEndpoint`, `CreateSshDetails`, `CreateVaultDetails`, `DataPumpJobMode`, `DataPumpSettings`, `DataTransferMediumDetails`, `DataTransferMediumDetailsV2`, `DatabaseConnectionTypes`, `DatabaseCredentials`, `DatabaseLinkDetails`, `DatabaseManualConnectionSubTypes`, `DatabaseObject`, `DbLinkDataTransferMediumDetails`, `DumpTransferDetails`, `GoldenGateDetails`, `GoldenGateHub`, `GoldenGateServiceDetails`, `GoldenGateSettings`, `MigrationObjectSummary`, `NfsDataTransferMediumDetails`, `ObjectStorageDataTransferMediumDetails`, `PrivateEndpointDetails`, `SshDetails`, `UpdateAdvisorSettings`, `UpdateAgentDetails`, `UpdateAwsS3Details`, `UpdateConnectDescriptor`, `UpdateDataPumpSettings`, `UpdateDataTransferMediumDetails`, `UpdateDatabaseLinkDetails`, `UpdateDumpTransferDetails`, `UpdateGoldenGateDetails`, `UpdateGoldenGateHub`, `UpdateGoldenGateServiceDetails`, `UpdateGoldenGateSettings`, `UpdatePrivateEndpoint`, `UpdateSshDetails`, `UpdateVaultDetails`, `VaultDetails`, `ChangeAgentCompartmentRequest`, `DeleteAgentRequest`, `GetAgentRequest`, `ListAgentImagesRequest`, `ListAgentsRequest`, `UpdateAgentRequest`, `ChangeAgentCompartmentResponse`, `DeleteAgentResponse`, `GetAgentResponse`, `ListAgentImagesResponse`, `ListAgentsResponse` and `UpdateAgentResponse` were removed in the Database Migration service
- The operations `changeAgentCompartment`, `deleteAgent`, `getAgent`, `listAgentImages`, `listAgents`, and `updateAgent` were removed in the Database Migration service
- The waiters `forAgent` were removed in the Database Migration service
- The type of parameter `targetStates` was changed from an array of `LifecycleStates` to an array of `Connection.LifecycleState` in the waiters `forConnection` in the Database Migration service
- The properties `agentId`, `sourceContainerDatabaseConnectionId`, `excludeObjects`, `includeObjects` and `vaultDetails` were removed from the model `CloneMigrationDetails` in the Database Migration service
- The properties `adminCredentials`, `connectDescriptor`, `certificateTdn`, `credentialsSecretId`, `databaseId`, `databaseType`, `isDedicated`, `manualDatabaseSubType`, `privateEndpoint`, `replicationCredentials`, `sshDetails` and `vaultDetails` were removed in the model `Connection` in the Database Migration service
- The properties `databaseId`, `databaseType`, `isDedicated`, and `manualDatabaseSubType` were removed in the model `ConnectionSummary` in the Database Migration service
- The properties `adminCredentials`, `certificateTdn`, `connectDescriptor`, `databaseId`, `databaseType`, `manualDatabaseSubType`, `privateEndpoint`, `replicationCredential`, `sshDetails`, `tlsKeystore`, `tlsWallet` and `vaultDetails` were removed from the model CreateConnectionDetails in the Database Migration service
- The properties `advisorSettings`, `agentId`, `csvText`, `dataTransferMediumDetails`, `dataTransferMediumDetailsV2`, `datapumpSettings`, `dumpTransferDetails`, `excludeObjects`, `goldenGateDetails`, `goldenGateServiceDetails`, `includeObjects`, `sourceContainerDatabaseConnectionId` and vaultDetails were removed in the model CreateMigrationDetails in the Database Migration service
- The properties `mapParallelism`, `maxApplyParallelism`, and `minApplyParallelism` were removed in the models `Replicat`, `UpdateReplicat`, and `CreateReplicat` in the Database Migration service
- The properties `advisorSettings`, `agentId`, `credentialsSecretId`, `dataTransferMediumDetails`, `dataTransferMediumDetailsV2`, `datapumpSettings`, `dumpTransferDetails`, `excludeObjects`, `goldenGateDetails`, `goldenGateServiceDetails`, `includeObjects`, `sourceContainerDatabaseConnectionId`, and `vaultDetails` were removed in the model `Migration` in the Database Migration service
- The properties `csvText` and `items` were removed in the model `MigrationObjectCollection` in the Database Migration service
- The properties `agentId`, `sourceContainerDatabaseConnectionId` and `vaultDetails` were removed in the model MigrationSummary in the Database Migration service
- The properties `adminCredentials`, `certificateTdn`, `connectDescriptor`, `databaseId`, `privateEndpoint`, `replicationCredential`, `sshDetails`, `tlsKeystore`, `tlsWallet` and `vaultDetails` were removed from the model UpdateConnectionDetails in the Database Migration service
- The properties `advisorSettings`, `agentId`, `dataTransferMediumDetails`, `dataTransferMediumDetailsV2`, `datapumpSettings`, `dumpTransferDetails`, `excludeObjects`, `goldenGateDetails`, `goldenGateServiceDetails`, `includeObjects`, `sourceContainerDatabaseConnectionId` and `vaultDetails` were removed in the model `UpdateMigrationDetails` in the Database Migration service
- The enum value `UnknownEnumValue` was removed in the enum `LifecycleStates` in the model `LifecycleStates` in the Database Migration service
- The enum values `OdmsInitializeGgs` and `OdmsValidateGgService` were removed in the enum `OdmsJobPhases` in the model `OdmsJobPhases` in the Database Migration service
- The type of property `lifecycleState` was changed from `LifecycleStates` to `Connection.LifecycleState` in the models `Connection` and `ConnectionSummary` in the Database Migration service

## 3.43.2 - 2024-06-18
### Added
- Support for public connection urls and public endpoints for autonomous databases in the Database service
- Support for insurance claim document type in the AI Document service
- Support for Microsoft IIS discovery and monitoring in the Stack Monitoring service

## 3.43.1 - 2024-06-11
### Added
- Support for 23ai based databases in Globally Distributed Database service
- Support for testing span enrichment groups in Application Performance Monitoring service
- Support for subscription suspension and termination orders in Fusion Apps as a Service
- Support for time first occurred and time last occurred for resource sightings in Cloud Guard service
- Support for alarm summary, notification title, and slack duration on create and update operations in Monitoring service
- Support for message creation timestamp in Queue service

## 3.43.0 - 2024-06-04
### Added
- Support for creating cross-region autonomous data guards in the Database service
- Support for listing autonomous database peers in the Database service
- Support for dedicated AI clusters in the Generative AI service
- Support for Llama chat and Lora Fine-Tuning method in the Generative AI service
- Support for adding and removing locks for connections, deployments, and deployment backups in the GoldenGate service
- Support for additional connection types for deployments and connections in the GoldenGate service

### Breaking Changes
- Accessibility of method `public CohereMessage(com.oracle.bmc.generativeaiinference.model.CohereMessage$Role, java.lang.String)` has been decreased from public to protected in the model `om.oracle.bmc.generativeaiinference.model.CohereMessage` in the Generative AI service
- Method `public com.oracle.bmc.generativeaiinference.model.CohereMessage$Builder builder()` has been removed from the model `com.oracle.bmc.generativeaiinference.model.CohereMessage` in the Generative AI service
- Method `public java.lang.String getMessage()` has been removed from the model `com.oracle.bmc.generativeaiinference.model.CohereMessage` in the Generative AI service
- Method `public com.oracle.bmc.generativeaiinference.model.CohereMessage$Role getRole()` has been removed from the model `com.oracle.bmc.generativeaiinference.model.CohereMessage` in the Generative AI service
- Method `public com.oracle.bmc.generativeaiinference.model.CohereMessage$Builder toBuilder()` has been removed from the model `com.oracle.bmc.generativeaiinference.model.CohereMessage` in the Generative AI service
- Field `Dalle3` has been removed from the model `com.oracle.bmc.generativeaiinference.model.LlmInferenceResponse$RuntimeType` in the Generative AI service
- Field `Openai` has been removed from the model `com.oracle.bmc.generativeaiinference.model.LlmInferenceResponse$RuntimeType` in the Generative AI service
- Accessibility of method `public Message(java.lang.String, java.util.List)` has been decreased from public to protected in the model `com.oracle.bmc.generativeaiinference.model.Message` in the Generative AI service
- Method `public com.oracle.bmc.generativeaiinference.model.Message$Builder builder()` has been removed from the model `com.oracle.bmc.generativeaiinference.model.Message` in the Generative AI service
- Method `public java.lang.String getRole()` has been removed from the model `com.oracle.bmc.generativeaiinference.model.Message` in the Generative AI service
- Method `public com.oracle.bmc.generativeaiinference.model.Message$Builder toBuilder()` has been removed from the model `com.oracle.bmc.generativeaiinference.model.Message` in the Generative AI service

## 3.42.0 - 2024-05-28
### Added
- Support for Demand Signal service
- Support for external database connectors in the Database service
- Support for monitoring standby databases in the Database Management service
- Support for resource overviews in the Capacity Management service
- Support for optional parameters in the download API in the Java Management Service Downloads service
  
### Breaking Changes
- Return type of method `public com.oracle.bmc.capacitymanagement.model.OccAvailabilitySummary$ResourceType getResourceType()` has been changed to `java.lang.String` in the model `com.oracle.bmc.capacitymanagement.model.OccAvailabilitySummary` in the Capacity Management service
- Return type of method `public com.oracle.bmc.capacitymanagement.model.OccAvailabilitySummary$WorkloadType getWorkloadType()` has been changed to `java.lang.String` in the model `com.oracle.bmc.capacitymanagement.model.OccAvailabilitySummary` in the Capacity Management service
- Class `com.oracle.bmc.capacitymanagement.model.OccAvailabilitySummary$ResourceType` has been removed in the Capacity Management service
- Class `com.oracle.bmc.capacitymanagement.model.OccAvailabilitySummary$WorkloadType` has been removed in the Capacity Management service
- Added final modifier to class `com.oracle.bmc.capacitymanagement.model.OccCapacityRequestBaseDetails` in the Capacity Management service
- Return type of method `public com.oracle.bmc.capacitymanagement.model.OccAvailabilitySummary$WorkloadType getWorkloadType()` has been changed to `java.lang.String` in the model `com.oracle.bmc.capacitymanagement.model.OccCapacityRequestBaseDetails` in the Capacity Management service
- Class `com.oracle.bmc.capacitymanagement.model.OccCapacityRequestBaseDetails$ResourceType` has been removed in the Capacity Management service
- Class `com.oracle.bmc.capacitymanagement.model.OccCapacityRequestComputeDetails` has been removed in the Capacity Management service
- Return type of method `public com.oracle.bmc.capacitymanagement.model.OccAvailabilitySummary$ResourceType getResourceType()` has been changed to `java.lang.String` in `com.oracle.bmc.capacitymanagement.requests.ListOccAvailabilitiesRequest` in the Capacity Management service
- Return type of method `public com.oracle.bmc.capacitymanagement.model.OccAvailabilitySummary$WorkloadType getWorkloadType()` has been changed to `java.lang.String` in `com.oracle.bmc.capacitymanagement.requests.ListOccAvailabilitiesRequest` in the Capacity Management service

## 3.41.3 - 2024-05-21
### Added
- Support for the Resource Scheduler service
- Support for Bring Your Own Container (BYOC), custom networking and graceful termination of pipelines in the Data Science service
- Support for backup and replacement of master, utility, and edge nodes in the Big Data service
- Support for nested resource principal in the Data Science service

## 3.41.2 - 2024-05-14
### Added
- Support for the Marketplace Private Offer service
- Support for resizing local file systems in the Database service
- Support for PPv2 (Proxy Protocol version 2) in the Load Balancer service
- Support for custom return path for sent emails in the Email Delivery service
- Support for session resumption in the Load Balancer service

## 3.41.1 - 2024-05-07
### Added
- Support for resizing of local file systems in the Database service
- Support for adding user defined pause group in disaster recovery plan in the Disaster Recovery service
- Support for OS patching configs in the Big Data service
- Support for IP inventory and notification feature in the Networking service
- Support for accidental delete protection for load balancers, load balancer listeners, and load balancer backends in the Load Balancer service
- Support for backend max connections for load balancers in the Load Balancer service
- Support for listener max connections for load balancers in the Load Balancer service

## 3.41.0 - 2024-04-30
### Added
- Support for enabling unified auditing for DBHome in the Database service
- Support for listing minor Grid Infrastructure (GI) versions available for custom GI software image creation in the Database service
- Support for network security groups in the Recovery Cloud service
- Support for lineage metadata import in the Data Catalog service
- Support for workspace properties in workspace create and update operations in the Data Integration service
- Support for monitoring ExaCC databases in the Database Management service
- Support for validations on target and policy before the masking process in the Data Safe service
  
### Breaking Changes
- Return type of method `public java.lang.String getAccepted()` has been changed to `com.oracle.bmc.databasemanagement.model.SqlPlanBaseline$Accepted` in the model `com.oracle.bmc.databasemanagement.model.SqlPlanBaseline` in the Database Management service
- Return type of method `public java.lang.String getAdaptive()` has been changed to `com.oracle.bmc.databasemanagement.model.SqlPlanBaseline$Adaptive` in the model `com.oracle.bmc.databasemanagement.model.SqlPlanBaseline` in the Database Management service
- Return type of method `public java.lang.String getAutoPurge()` has been changed to `com.oracle.bmc.databasemanagement.model.SqlPlanBaseline$AutoPurge` in the model `com.oracle.bmc.databasemanagement.model.SqlPlanBaseline` in the Database Management service
- Return type of method `public java.lang.String getEnabled()` has been changed to `com.oracle.bmc.databasemanagement.model.SqlPlanBaseline$Enabled` in the model `com.oracle.bmc.databasemanagement.model.SqlPlanBaseline` in the Database Management service
- Return type of method `public java.lang.String getFixed()` has been changed to `com.oracle.bmc.databasemanagement.model.SqlPlanBaseline$Fixed` in the model `com.oracle.bmc.databasemanagement.model.SqlPlanBaseline` in the Database Management service
- Return type of method `public java.lang.String getReproduced()` has been changed to `com.oracle.bmc.databasemanagement.model.SqlPlanBaseline$Reproduced` in the model `com.oracle.bmc.databasemanagement.model.SqlPlanBaseline` in the Database Management service
- Return type of method `public java.lang.String getAccepted()` has been changed to `com.oracle.bmc.databasemanagement.model.SqlPlanBaseline$Accepted` in the model `com.oracle.bmc.databasemanagement.model.SqlPlanBaselineSummary` in the Database Management service
- Return type of method `public java.lang.String getAdaptive()` has been changed to `com.oracle.bmc.databasemanagement.model.SqlPlanBaselineSummary$Adaptive` in the model `com.oracle.bmc.databasemanagement.model.SqlPlanBaselineSummary` in the Database Management service
- Return type of method `public java.lang.String getAutoPurge()` has been changed to `com.oracle.bmc.databasemanagement.model.SqlPlanBaselineSummary$AutoPurge` in the model `com.oracle.bmc.databasemanagement.model.SqlPlanBaselineSummary` in the Database Management service
- Return type of method `public java.lang.String getEnabled()` has been changed to `com.oracle.bmc.databasemanagement.model.SqlPlanBaselineSummary$Enabled` in the model `com.oracle.bmc.databasemanagement.model.SqlPlanBaselineSummary` in the Database Management service
- Return type of method `public java.lang.String getFixed()` has been changed to `com.oracle.bmc.databasemanagement.model.SqlPlanBaselineSummary$Fixed` in the model `com.oracle.bmc.databasemanagement.model.SqlPlanBaselineSummary` in the Database Management service
- Return type of method `public java.lang.String getReproduced()` has been changed to `com.oracle.bmc.databasemanagement.model.SqlPlanBaselineSummary$Reproduced` in the model `com.oracle.bmc.databasemanagement.model.SqlPlanBaselineSummary` in the Database Management service
- Return type of method `public java.lang.String getAllSqlStatementsFetched()` has been changed to `com.oracle.bmc.databasemanagement.model.SqlTuningSet$AllSqlStatementsFetched` in the model `com.oracle.bmc.databasemanagement.model.SqlTuningSet` in the Database Management service

## 3.40.0 - 2024-04-23
### Added
- Support for the Cluster Placement Groups service
- Support for new optional parameter for managing approval template in the Managed Access service
- Support for cluster placement groups in the Compute service
- Support for replacing boot volume for virtual machines in the Compute service
- Support for assigning a cluster placement group to boot and block volumes in the Block Storage service
- Support for container workload integration in the Cloud Guard service
- Support for instances in OCI and 3rd party clouds in the OS Management service

### Breaking Changes
- The Application Migration service was decommissioned and removed
- Support for default retries on the operations of the Managed Access service
- Return type of method `public java.lang.String getArchitecture()` has been changed to `com.oracle.bmc.osmanagementhub.model.SoftwarePackageArchitecture` in the model `com.oracle.bmc.osmanagementhub.model.SoftwarePackage` in the OS Management service
- Return type of method `public java.lang.String getArchitecture()` has been changed to `com.oracle.bmc.osmanagementhub.model.SoftwarePackageArchitecture` in the model `com.oracle.bmc.osmanagementhub.model.SoftwarePackageSummary` in the OS Management service
- Method `public com.oracle.bmc.osmanagementhub.model.ManagedInstanceLocation getInstanceLocation()` has been removed from `com.oracle.bmc.osmanagementhub.requests.GetManagedInstanceAnalyticContentRequest` in the OS Management service
- Method `public java.util.List getAdvisoryType()` has been removed from `com.oracle.bmc.osmanagementhub.requests.ListManagedInstanceErrataRequest` in the OS Management service
- Method `public com.oracle.bmc.osmanagementhub.model.ManagedInstanceLocation getInstanceLocation()` has been removed from `com.oracle.bmc.osmanagementhub.requests.SummarizeManagedInstanceAnalyticsRequest` in the OS Management service
- Class `com.oracle.bmc.osmanagementhub.requests.GetManagedInstanceContentRequest$AdvisoryType` has been removed in the OS Management service
- Class `com.oracle.bmc.osmanagementhub.requests.ListManagedInstanceErrataRequest$AdvisoryType` has been removed in the OS Management service

## 3.39.2 - 2024-04-16
### Added
- Support for calling Oracle Cloud Infrastructure services in the me-abudhabi-3 region
- Support for new Image resource for an Autonomous Database in the Database service
- Support for creating Autonomous Container Database using Autonomous Database Software Image in the Database service
- Support for new dedicated AI cluster unit shape in the Generative AI service
- Support for Chat API for LLM models in the Generative AI service
- Support for network security groups (NSGs) in the Redis service
- Support for custom public egress on model deployments in the Data Science service
- Support for a new data transfer parameter for AWS S3 bucket in the Database Migration service
- Support for Oracle Process Automation instance start and stop operations in the Process Automation service
- Support for healthcare Natural Language Processing (NLP) in the AI Language service
- Support for identification and de-identification of Private Health Information (PHI) service in the AI Language service
- Support for multilingual content for using machine learning models in the AI Language service
- Support for usage statements in cost management in the Usage service

## 3.39.1 - 2024-04-09
### Added
- Support for calling Oracle Cloud Infrastructure services in the ap-dcc-gazipur-1 region
- Support for the DNS-based backend health check in the Network Load Balancer service
- Support for Fail Open in the Network Load Balancer service
- Support for adding and updating Instant failover in the Network Load Balancer service
- Support for adding and updating source type and resource category for resource types in the Stack Monitoring service
- Support for searching resources based on resource category,  source type, multiple compartments, multiple lifecycle states in the Stack Monitoring service
- Support for filtering listed resources based on lifecycle status in the Stack Monitoring service
- Support for creating tasks with new config parameters in the Stack Monitoring service
- Support for Composite Resource Principal integration in the Data Flow service

## 3.39.0 - 2024-04-02
### Fixed
- Fixed a thread leak in `IdleConnectionMonitor`
 
### Added
- Support for assigned private IP and single stack IPV6 feature for Network Load Balancer Service
- Support for Configuration API in Email Delivery Service
- Support for the status field in creating data source resource for Cloud Guard Service
- Support for TLSv1.3 in Load Balancer Service
- Support for sending mails via HTTPS for Email Delivery Service
  
### Breaking Changes
- Return type of method `public com.oracle.bmc.email.model.SenderSummary$LifecycleState getLifecycleState()` has been changed to `com.oracle.bmc.email.model.Sender$LifecycleState` in the model `com.oracle.bmc.email.model.SenderSummary` in the Email Delivery Service
- Return type of method `public com.oracle.bmc.email.model.Suppression$Reason getReason()` has been changed to `com.oracle.bmc.email.model.SuppressionReason` in the model `com.oracle.bmc.email.model.Suppression` in the Email Delivery Service
- Return type of method `public com.oracle.bmc.email.model.SuppressionSummary$Reason getReason()` has been changed to `com.oracle.bmc.email.model.SuppressionReason` in the model `com.oracle.bmc.email.model.SuppressionSummary` in the Email Delivery Service
- Class `com.oracle.bmc.email.model.SenderSummary$LifecycleState` has been removed in the Email Delivery Service
- Class `com.oracle.bmc.email.model.Suppression$Reason` has been removed in the Email Delivery Service
- Class `com.oracle.bmc.email.model.SuppressionSummary$Reason` has been removed in the Email Delivery Service

## 3.38.0 - 2024-03-26
### Added
- Support for creating and updating a refreshable clone with auto-refresh for an Autonomous Database in the Database service
- Support for symmetric hashing in the Network Load Balancer service
- Support for creating and deploying helm command specifications in the DevOps Service
- Support for uninstalling helm chart when deleting an Oracle Kubernetes Stage through the DevOps Service
- Support for collecting metrics and filter plugin with Unified Monitoring Agent (UMA) in the Logging service
- Support for reading logs from head position after agent restart in the Logging service
- Support for monitoring MySQL HeatWave clusters in Database Management Service
- Support for multiple severities in an alarm in the Monitoring service
  
### Breaking Changes
- Support for default retries on the operations of the Network Load Balancer service
- The properties `displayName` and `description` have been made required in the model `CreateUnifiedAgentConfigurationDetails` in the Logging service
- The property `recordInput` has been made required in the model `OperationalMetricsSource` in the Logging service

## 3.37.2 - 2024-03-19
### Added
- Support for standalone Oracle HTTP server discovery and monitoring in the Stack Monitoring service
- Support for attribute management for traces in the Application Performance Monitoring service
- Support for async jobs and document translations in the AI language service

## 3.37.1 - 2024-03-12
### Added
- Support for new development license type on dedicated infrastructure in the Database service
- Support for placement parameters on Autonomous Container Database create operation in the Database service
- Support for autoscaling on model deployment in the Data Science service

## 3.37.0 - 2024-03-05
### Added
- Support for Linux capabilities configuration for the containers in the Container Instances service
- Support for service platforms in the Oracle Store Platform Gateway service
- Support for whisper models and delete job operation in the Speech service
- Support for new SQL insight content types in news reports in the Operations Insights service
- Support for launching virtual machines with multiple volumes in the Compute service
  
### Breaking Changes
- The property `CapacityPlanningResources` has been made optional in the model `NewsContentTypes` in the Operations Insights service

## 3.36.0 - 2024-02-27
### Added
- Support for specifying dialog version when creating skills entities in the Digital Assistant service
- Support for bulk creation of skill entities in the Digital Assistant service
- Support for training skill query entities in the Digital Assistant service
- Support for cascading delete of skill custom entities in the Digital Assistant service
- Support for creating autonomous dataguard associations in the Database service
- Support for auto generation of secrets in the Secret Management service
- Support for cluster placement groups in Cloud Exadata Infrastructure in the Database service
- Support for retrieving previous logs of the container in the Container Instances service
- Support for queue sources in the Connector Hub service
- Support for automatic key rotation in the Key Management Service
- Support for downloading operator activity reports and assignment healthchecks in the Operator Access Control service
- Support for operator requesting access in the future time in the Operator Access Control service
- Support for forwarding hypervisor logs in the Operator Access Control service
- Support for asynchronous data asset export in the Data Catalog service
- Support for launch with multiple volumes for virtual machines in the Compute Service
- Support for tagging in Database Management service
  
### Breaking Changes
- Method `public java.lang.Integer getMaxCpuCoreCount()` has been removed from the models `com.oracle.bmc.database.model.AutonomousDatabase`, `com.oracle.bmc.database.model.AutonomousDatabaseSummary`, `com.oracle.bmc.database.model.CreateAutonomousDatabaseBase` and `com.oracle.bmc.database.model.UpdateAutonomousDatabaseDetails` in the Database service
- Field `PeerAutonomousDatabaseLifeCycleState` has been removed from the model `com.oracle.bmc.database.model.AutonomousDatabaseDataguardAssociation` in the Database service
- Class `com.oracle.bmc.database.model.DatabaseConnectionCredentailsByName` has been removed from the Database service

## 3.35.0 - 2024-02-20
### Added
- Support for calling Oracle Cloud Infrastructure services in the me-dcc-doha-1 region
- Support for Secure Desktops service
- Support for enabling and disabling Simultaneous Multithreading (SMT) for virtual machines in the Compute service
- Support for Bring Your Own Container Jobs (BYOC v2) in the Data Science service
- Support for expanded language translation in the AI Language service
- Support for additional flags for ignoring transliteration and text length to be considered for determining dominant language in the AI Language service
  
### Breaking Changes
- Class `com.oracle.bmc.ailanguage.model.PreTrainedPhiModelDetails` has been removed in the AI Language service

## 3.34.1 - 2024-02-13
### Added
- Support for adding automatic backups during cross region operations and disaster recovery in the Autonomous Database service
- Support for overlapping CIDR in network path analyzer in the Virtual Network Monitoring service
- Support for additional attributes in entity and topology in the Log Analytics service
- Support for historic collection and log type while creating object collection rules in the Log Analytics service
- Support for position aware parsers in the Log Analytics service
- Support for filtering log sources, detection rules and scheduled tasks based on target service in the Log Analytics service
- Support for additional recall and release attributes in the Log Analytics service
- Support for opc-meta-properties header while uploading log events in the Log Analytics service

## 3.34.0 - 2024-02-06
### Added
- Support for the Globally Distributed Database service
- Support for secret auto-rotation in the Secret Management service
- Support for dedicated key management in the Key Management service
- Support for resource locking operations in the Digital Media service
- Support for data sources, including prometheus emitter, in the Management Agent service
- Support for Bring Your Own Certificates (BYOC) in the MySQL HeatWave Database service
  
### Breaking Changes
- Method `public com.oracle.bmc.mediaservices.responses.GetMediaWorkflowJobFactResponse getMediaWorkflowJobFact(com.oracle.bmc.mediaservices.requests.GetMediaWorkflowJobFactRequest)` has been removed from `com.oracle.bmc.mediaservices.MediaServices` in the Digital Media service
- Method `public com.oracle.bmc.mediaservices.responses.ListMediaWorkflowJobFactsResponse listMediaWorkflowJobFacts(com.oracle.bmc.mediaservices.requests.ListMediaWorkflowJobFactsRequest)` has been removed from `com.oracle.bmc.mediaservices.MediaServices` in the Digital Media service
- Method `public java.lang.Iterable listMediaWorkflowJobFactsRecordIterator(com.oracle.bmc.mediaservices.requests.ListMediaWorkflowJobFactsRequest)` has been removed from `com.oracle.bmc.mediaservices.MediaServicesPaginators` in the Digital Media service
- Method `public java.lang.Iterable listMediaWorkflowJobFactsResponseIterator(com.oracle.bmc.mediaservices.requests.ListMediaWorkflowJobFactsRequest)` has been removed from `com.oracle.bmc.mediaservices.MediaServicesPaginators` in the Digital Media service
- Class `com.oracle.bmc.mediaservices.model.MediaWorkflowJobFact` has been removed from the Digital Media service
- Class `com.oracle.bmc.mediaservices.model.MediaWorkflowJobFactCollection` has been removed from the Digital Media service
- Class `com.oracle.bmc.mediaservices.model.MediaWorkflowJobFactSortBy` has been removed from the Digital Media service
- Class `com.oracle.bmc.mediaservices.model.MediaWorkflowJobFactSummary` has been removed from the Digital Media service
- Class `com.oracle.bmc.mediaservices.requests.GetMediaWorkflowJobFactRequest` has been removed from the Digital Media service
- Class `com.oracle.bmc.mediaservices.requests.ListMediaWorkflowJobFactsRequest` has been removed from the Digital Media service
- Class `com.oracle.bmc.mediaservices.requests.ListMediaWorkflowJobFactsRequest$Type` has been removed from the Digital Media service
- Method `public java.lang.String getOpcWorkRequestId()` has been removed from the response model `com.oracle.bmc.mediaservices.responses.ChangeMediaWorkflowCompartmentResponse`, `com.oracle.bmc.mediaservices.responses.ChangeMediaWorkflowConfigurationCompartmentResponse`, `com.oracle.bmc.mediaservices.responses.ChangeMediaWorkflowJobCompartmentResponse`, `com.oracle.bmc.mediaservices.responses.ChangeStreamDistributionChannelCompartmentResponse`, `com.oracle.bmc.mediaservices.responses.DeleteMediaWorkflowConfigurationResponse`, `com.oracle.bmc.mediaservices.responses.DeleteMediaWorkflowJobResponse` and `com.oracle.bmc.mediaservices.responses.UpdateStreamPackagingConfigResponse` in the Digital Media service
- Class `com.oracle.bmc.mediaservices.responses.GetMediaWorkflowJobFactResponse` has been removed from the Digital Media service
- Class `com.oracle.bmc.mediaservices.responses.ListMediaWorkflowJobFactsResponse` has been removed from the Digital Media service
- Class `com.oracle.bmc.managementagent.model.Datatypes` has been removed from the Management Agent service
- Class `com.oracle.bmc.managementagent.model.EditModes` has been removed from the Management Agent service
- Return type of method `public com.oracle.bmc.managementagent.model.OperationTypes getType()` has been changed to `java.util.List` in `com.oracle.bmc.managementagent.requests.ListWorkRequestsRequest` in the Management Agent service

## 3.33.0 - 2024-01-30
### Added
- Support for OCI Control Center service
- Support for giro value set for address rules in the Oracle Store Platform service
- Support for giro in tax information for subscriptions in the Oracle Store Platform service
- Support for REST connectivity with Oath2 in the Data Integration service
- Support for resolver rules limit increase in the DNS service
- Support for named credentials in the Database Management service
  
### Breaking Changes
- Default retry disabled on the operations of the DNS service

## 3.32.1 - 2024-01-23
### Added
- Support for the Generative AI service
- Support for additional currencies and countries for paid listings in the Marketplace service
- Support for process sets in the Stack Monitoring service

## 3.32.0 - 2024-01-16
### Added
- Support for resource id filter on the service work requests in the Container Instances service
- Support for polyglot vulnerability audit in the Application Dependency Management service
- Support for create, read, and update operations on peer databases in the Data Safe service
- Support for dimension specific alarm suppressions in the Monitoring service
- Support for calculating audit volume in the Data Safe service
- Support for viewing schema accesses in data safe user assessments in the Data Safe service
- Support for security feature usage in the Data Safe service
- Support for viewing the top security findings in data safe security assessments in the Data Safe service
- Support for additional filters in list findings operation in the Data Safe service
- Support for updating risk level of the specified finding in the Data Safe service
  
### Breaking Changes
- Method `public java.lang.String getOpcWorkRequestId()` has been removed from the response model `com.oracle.bmc.adm.responses.CreateVulnerabilityAuditResponse` in the Application Dependency Management service

## 3.31.1 - 2024-01-09
### Added
- Support for calling Oracle Cloud Infrastructure services in the sa-valparaiso-1 region
- Support for creation of up to 60 containers per container instance in the Container Instances service
- Support for Oracle GoldenGate discovery and monitoring in the Stack Monitoring service
- Support for GoldenGate stream analytics in the GoldenGate service
- Support for backup work requests in MySQL Heatwave service
- Support for create, update, delete and list operations on premise vantage points in the Application Performance Monitoring service
- Support for create, update, delete and list operations on workers in the Application Performance Monitoring service
- Support for host capacity planning for compute instances and host unallocated metrics in the Operations Insights service
 
### Fixed
- Operations that upload streams (e.g. `PutObject`) now retry according to global or client-level retry configurations (see [#566](https://github.com/oracle/oci-java-sdk/issues/566))
- Retry logic when fetching resource principal session tokens

## 3.31.0 - 2023-12-12
### Added
- Support for changing compartments of configurations in the PostgreSQL service
- Support for granular policies including compartments, resource types, and recommendations in the Optimizer service
- Support for token exchanges in the Identity Domains service
- Support for Apache HTTP server discovery and monitoring in the Stack Monitoring service
- Support for resource locking in the Data Catalog service
- Support for concurrency throttling in the Data Integration service
- Support for reboot migrations for VMs on dedicated hosts in the Compute service
- Support for connection routing method settings and subnet update in the GoldenGate service
- Support for data discovery of commonly used sensitive types in the Data Safe service
- Support for incremental extract and updates to the workflows in the Data Integration service 
  
### Breaking Changes
- Support for default retries on the operations of the Optimizer service
- Added idle connection monitor thread to evict idle and expired Apache connections. This also restores connection reuse for the Apache connector and fixes a performance issue.  For more details, see `ApacheConnector-README`
- Retries disabled when the circuit breaker is in Open state. To enable retries on exceptions caused due to circuit breaker, set `oci.javasdk.default.retry.on.open.circuit.breaker` to `true`. Check `RetryOnOpenCircuitBreakerExample` for more details
- Method `public com.oracle.bmc.psql.model.Configuration getConfiguration()` has been removed from `com.oracle.bmc.psql.responses.ChangeConfigurationCompartmentResponse` in the PostgreSQL service
- Method `public java.lang.String getEtag()` has been removed from `com.oracle.bmc.psql.responses.ChangeConfigurationCompartmentResponse` in the PostgreSQL service

## 3.30.0 - 2023-12-04
### Added
- Support for calling Oracle Cloud Infrastructure services in the eu-dcc-zurich-1 and the sa-bogota-1 region
- Support for managing certificates of target Servers in the Golden Gate service
- Support for AWR Hub Snapshot ingest endpoints in the Operations Insights service
- Support for reducing false positives in the Application Dependency Management service
- Support for ARM shapes in the Data Science service
- Support for new optional parameters in the upload discovery data API in the Usage service
- Support for multiple clusters in a Software-Defined Data Centers (SDDCs) in the VMWare Solution service
- Support for No/Zero days backup in Autonomous Container Database in the Database service
- Support for provisioning a VM Cluster with a choice of Exadata image version in the Database service
- Support for updating ocpu/ecpu count, local storage, ACD count and Exadata storage on Cloud Autonomous VM Cluster and Autonomous VM Cluster in the Database service
- Support for serial console history in the Database service
- Support for Oracle Linux 8 version database system in the Database service
 
 
### Breaking Changes
- Method `public com.oracle.bmc.ocvp.responses.ListSupportedSkusResponse listSupportedSkus(com.oracle.bmc.ocvp.requests.ListSupportedSkusRequest)` has been removed from com.oracle.bmc.ocvp.Sddc in the VMWare Solution service
- Method `public java.lang.Iterable listSupportedSkusRecordIterator(com.oracle.bmc.ocvp.requests.ListSupportedSkusRequest)` has been removed from com.oracle.bmc.ocvp.SddcPaginators in the VMWare Solution service
- Method `public java.lang.Iterable listSupportedSkusResponseIterator(com.oracle.bmc.ocvp.requests.ListSupportedSkusRequest)` has been removed from com.oracle.bmc.ocvp.SddcPaginators in the VMWare Solution service
- Method `public com.oracle.bmc.ocvp.model.Sku getCurrentSku()` has been removed from com.oracle.bmc.ocvp.model.CreateEsxiHostDetails in the VMWare Solution service
- Method `public java.lang.String getFailedEsxiHostId()` has been removed from com.oracle.bmc.ocvp.model.CreateEsxiHostDetails in the VMWare Solution service
- Method `public com.oracle.bmc.ocvp.model.Sku getNextSku()` has been removed from com.oracle.bmc.ocvp.model.CreateEsxiHostDetails in the VMWare Solution service
- Method `public java.lang.String getNonUpgradedEsxiHostId()` has been removed from com.oracle.bmc.ocvp.model.CreateEsxiHostDetails in the VMWare Solution service
- Method `public java.lang.String getSddcId()` has been removed from com.oracle.bmc.ocvp.model.CreateEsxiHostDetails in the VMWare Solution service
- Method `public java.lang.String getCapacityReservationId()` has been removed from com.oracle.bmc.ocvp.model.CreateSddcDetails in the VMWare Solution service
- Method `public java.lang.String getComputeAvailabilityDomain()` has been removed from com.oracle.bmc.ocvp.model.CreateSddcDetails in the VMWare Solution service
- Method `public java.util.List getDatastores()` has been removed from com.oracle.bmc.ocvp.model.CreateSddcDetails in the VMWare Solution service
- Method `public java.lang.Integer getEsxiHostsCount()` has been removed from com.oracle.bmc.ocvp.model.CreateSddcDetails in the VMWare Solution service in the VMWare Solution service
- Method `public java.lang.String getHcxVlanId()` has been removed from com.oracle.bmc.ocvp.model.CreateSddcDetail in the VMWare Solution service
- Method `public java.lang.Float getInitialHostOcpuCount()` has been removed from com.oracle.bmc.ocvp.model.CreateSddcDetails in the VMWare Solution service
- Method `public java.lang.String getInitialHostShapeName()` has been removed from com.oracle.bmc.ocvp.model.CreateSddcDetails in the VMWare Solution service
- Method `public com.oracle.bmc.ocvp.model.Sku getInitialSku()` has been removed from com.oracle.bmc.ocvp.model.CreateSddcDetails in the VMWare Solution service
- Method `public java.lang.String getInstanceDisplayNamePrefix()` has been removed from com.oracle.bmc.ocvp.model.CreateSddcDetails in the VMWare Solution service
- Method `public java.lang.Boolean getIsHcxEnabled()` has been removed from com.oracle.bmc.ocvp.model.CreateSddcDetails in the VMWare Solution service
- Method `public java.lang.Boolean getIsHcxEnterpriseEnabled()` has been removed from com.oracle.bmc.ocvp.model.CreateSddcDetails in the VMWare Solution service
- Method `public java.lang.Boolean getIsShieldedInstanceEnabled()` has been removed from com.oracle.bmc.ocvp.model.CreateSddcDetails in the VMWare Solution service
- Method `public java.lang.String getNsxEdgeUplink1VlanId()` has been removed from com.oracle.bmc.ocvp.model.CreateSddcDetails in the VMWare Solution service
- Method `public java.lang.String getNsxEdgeUplink2VlanId()` has been removed from com.oracle.bmc.ocvp.model.CreateSddcDetails in the VMWare Solution service
- Method `public java.lang.String getNsxEdgeVTepVlanId()` has been removed from com.oracle.bmc.ocvp.model.CreateSddcDetails in the VMWare Solution service
- Method `public java.lang.String getNsxVTepVlanId()` has been removed from com.oracle.bmc.ocvp.model.CreateSddcDetails in the VMWare Solution service
- Method `public java.lang.String getProvisioningSubnetId()` has been removed from com.oracle.bmc.ocvp.model.CreateSddcDetails in the VMWare Solution service
- Method `public java.lang.String getProvisioningVlanId()` has been removed from com.oracle.bmc.ocvp.model.CreateSddcDetails in the VMWare Solution service
- Method `public java.lang.String getReplicationVlanId()` has been removed from com.oracle.bmc.ocvp.model.CreateSddcDetails in the VMWare Solution service
- Method `public java.lang.String getVmotionVlanId()` has been removed from com.oracle.bmc.ocvp.model.CreateSddcDetails in the VMWare Solution service
- Method `public java.lang.String getVsanVlanId()` has been removed from com.oracle.bmc.ocvp.model.CreateSddcDetails in the VMWare Solution service
- Method `public java.lang.String getVsphereVlanId()` has been removed from com.oracle.bmc.ocvp.model.CreateSddcDetails in the VMWare Solution service
- Method `public java.lang.String getWorkloadNetworkCidr()` has been removed from com.oracle.bmc.ocvp.model.CreateSddcDetails in the VMWare Solution service
- Method `public com.oracle.bmc.ocvp.model.Sku getCurrentSku()` has been removed from com.oracle.bmc.ocvp.model.EsxiHost in the VMWare Solution service
- Method `public com.oracle.bmc.ocvp.model.Sku getNextSku()` has been removed from com.oracle.bmc.ocvp.model.EsxiHost in the VMWare Solution service
- Method `public com.oracle.bmc.ocvp.model.Sku getCurrentSku()` has been removed from com.oracle.bmc.ocvp.model.EsxiHostSummary in the VMWare Solution service
- Method `public com.oracle.bmc.ocvp.model.Sku getNextSku()` has been removed from com.oracle.bmc.ocvp.model.EsxiHostSummary in the VMWare Solution service
- Method `public java.lang.String getCapacityReservationId()` has been removed from com.oracle.bmc.ocvp.model.Sddc in the VMWare Solution service
- Method `public java.lang.String getComputeAvailabilityDomain()` has been removed from com.oracle.bmc.ocvp.model.Sddc in the VMWare Solution service
- Method `public java.util.List getDatastores()` has been removed from com.oracle.bmc.ocvp.model.Sddc in the VMWare Solution service
- Method `public java.lang.Integer getEsxiHostsCount()` has been removed from com.oracle.bmc.ocvp.model.Sddc in the VMWare Solution service
- Method `public java.lang.String getHcxInitialPassword()` has been removed from com.oracle.bmc.ocvp.model.Sddc in the VMWare Solution service
- Method `public java.lang.String getHcxOnPremKey()` has been removed from com.oracle.bmc.ocvp.model.Sddc in the VMWare Solution service
- Method `public java.lang.String getHcxVlanId()` has been removed from com.oracle.bmc.ocvp.model.Sddc in the VMWare Solution service
- Method `public java.lang.Float getInitialHostOcpuCount()` has been removed from com.oracle.bmc.ocvp.model.Sddc in the VMWare Solution service
- Method `public java.lang.String getInitialHostShapeName()` has been removed from com.oracle.bmc.ocvp.model.Sddc in the VMWare Solution service
- Method `public com.oracle.bmc.ocvp.model.Sku getInitialSku()` has been removed from com.oracle.bmc.ocvp.model.Sdd in the VMWare Solution service
- Method `public java.lang.String getInstanceDisplayNamePrefix()` has been removed from com.oracle.bmc.ocvp.model.Sddc in the VMWare Solution service
- Method `public java.lang.Boolean getIsHcxEnabled()` has been removed from com.oracle.bmc.ocvp.model.Sddc in the VMWare Solution service
- Method `public java.lang.Boolean getIsHcxEnterpriseEnabled()` has been removed from com.oracle.bmc.ocvp.model.Sddc in the VMWare Solution service
- Method `public java.lang.Boolean getIsShieldedInstanceEnabled()` has been removed from com.oracle.bmc.ocvp.model.Sddc in the VMWare Solution service
- Method `public java.lang.String getNsxEdgeUplink1VlanId()` has been removed from com.oracle.bmc.ocvp.model.Sddc in the VMWare Solution service
- Method `public java.lang.String getNsxEdgeUplink2VlanId()` has been removed from com.oracle.bmc.ocvp.model.Sddc in the VMWare Solution service
- Method `public java.lang.String getNsxEdgeVTepVlanId()` has been removed from com.oracle.bmc.ocvp.model.Sddc in the VMWare Solution service
- Method `public java.lang.String getNsxManagerInitialPassword()` has been removed from com.oracle.bmc.ocvp.model.Sddc in the VMWare Solution service
- Method `public java.lang.String getNsxOverlaySegmentName()` has been removed from com.oracle.bmc.ocvp.model.Sddc in the VMWare Solution service
- Method `public java.lang.String getNsxVTepVlanId()` has been removed from com.oracle.bmc.ocvp.model.Sddc in the VMWare Solution service
- Method `public java.lang.String getProvisioningSubnetId()` has been removed from com.oracle.bmc.ocvp.model.Sddc in the VMWare Solution service
- Method `public java.lang.String getProvisioningVlanId()` has been removed from com.oracle.bmc.ocvp.model.Sddc in the VMWare Solution service
- Method `public java.lang.String getReplicationVlanId()` has been removed from com.oracle.bmc.ocvp.model.Sddc in the VMWare Solution service
- Method `public java.util.List getUpgradeLicenses()` has been removed from com.oracle.bmc.ocvp.model.Sddc in the VMWare Solution service
- Method `public java.lang.String getVcenterInitialPassword()` has been removed from com.oracle.bmc.ocvp.model.Sddc in the VMWare Solution service
- Method `public java.lang.String getVmotionVlanId()` has been removed from com.oracle.bmc.ocvp.model.Sddc in the VMWare Solution service
- Method `public java.lang.String getVsanVlanId()` has been removed from com.oracle.bmc.ocvp.model.Sddc in the VMWare Solution service
- Method `public java.lang.String getVsphereUpgradeGuide()` has been removed from com.oracle.bmc.ocvp.model.Sddc in the VMWare Solution service
- Method `public java.util.List getVsphereUpgradeObjects()` has been removed from com.oracle.bmc.ocvp.model.Sddc in the VMWare Solution service
- Method `public java.lang.String getVsphereVlanId()` has been removed from com.oracle.bmc.ocvp.model.Sddc in the VMWare Solution service
- Method `public java.lang.String getWorkloadNetworkCidr()` has been removed from com.oracle.bmc.ocvp.model.Sddc in the VMWare Solution service
- Method `public java.lang.String getComputeAvailabilityDomain()` has been removed from com.oracle.bmc.ocvp.model.SddcSummary in the VMWare Solution service
- Method `public java.lang.Integer getEsxiHostsCount()` has been removed from com.oracle.bmc.ocvp.model.SddcSummary in the VMWare Solution service
- Method `public java.lang.Float getInitialHostOcpuCount()` has been removed from com.oracle.bmc.ocvp.model.SddcSummary in the VMWare Solution service
- Method `public java.lang.String getInitialHostShapeName()` has been removed from com.oracle.bmc.ocvp.model.SddcSummary in the VMWare Solution service
- Method `public java.lang.Boolean getIsHcxEnabled()` has been removed from com.oracle.bmc.ocvp.model.SddcSummary in the VMWare Solution service
- Method `public java.lang.Boolean getIsShieldedInstanceEnabled()` has been removed from com.oracle.bmc.ocvp.model.SddcSummary in the VMWare Solution service
- Method `public java.lang.Boolean getIsSupportMonthlySku()` has been removed from com.oracle.bmc.ocvp.model.SupportedHostShapeSummary in the VMWare Solution service
- Method `public java.util.List getSupportedSddcTypes()` has been removed from com.oracle.bmc.ocvp.model.SupportedHostShapeSummary in the VMWare Solution service
- Method `public com.oracle.bmc.ocvp.model.Sku getNextSku()` has been removed from com.oracle.bmc.ocvp.model.UpdateEsxiHostDetails in the VMWare Solution service
- Method `public java.lang.String getHcxVlanId()` has been removed from com.oracle.bmc.ocvp.model.UpdateSddcDetails in the VMWare Solution service
- Method `public java.lang.String getNsxEdgeUplink1VlanId()` has been removed from com.oracle.bmc.ocvp.model.UpdateSddcDetails in the VMWare Solution service
- Method `public java.lang.String getNsxEdgeUplink2VlanId()` has been removed from com.oracle.bmc.ocvp.model.UpdateSddcDetails in the VMWare Solution service
- Method `public java.lang.String getNsxEdgeVTepVlanId()` has been removed from com.oracle.bmc.ocvp.model.UpdateSddcDetails in the VMWare Solution service
- Method `public java.lang.String getNsxVTepVlanId()` has been removed from com.oracle.bmc.ocvp.model.UpdateSddcDetails in the VMWare Solution service
- Method `public java.lang.String getProvisioningVlanId()` has been removed from com.oracle.bmc.ocvp.model.UpdateSddcDetails in the VMWare Solution service
- Method `public java.lang.String getReplicationVlanId()` has been removed from com.oracle.bmc.ocvp.model.UpdateSddcDetails in the VMWare Solution service
- Method `public java.lang.String getVmotionVlanId()` has been removed from com.oracle.bmc.ocvp.model.UpdateSddcDetails in the VMWare Solution service
- Method `public java.lang.String getVsanVlanId()` has been removed from com.oracle.bmc.ocvp.model.UpdateSddcDetails in the VMWare Solution service
- Method `public java.lang.String getVsphereVlanId()` has been removed from com.oracle.bmc.ocvp.model.UpdateSddcDetails in the VMWare Solution service
- Method `public com.oracle.bmc.ocvp.model.SddcTypes getSddcType()` has been removed from com.oracle.bmc.ocvp.requests.ListSupportedHostShapesRequest in the VMWare Solution service
- Class `com.oracle.bmc.ocvp.requests.ListSupportedSkusRequest` has been removed in the VMWare Solution service
- Class `com.oracle.bmc.ocvp.responses.ListSupportedSkusResponse` has been removed in the VMWare Solution service
- Class `com.oracle.bmc.ocvp.model.DatastoreSummary` has been removed in the VMWare Solution service
- Class `com.oracle.bmc.ocvp.model.SddcTypes` has been removed in the VMWare Solution service
- Class `com.oracle.bmc.ocvp.model.Sku` has been removed in the VMWare Solution service
- Class `com.oracle.bmc.ocvp.model.SupportedSkuSummary` has been removed in the VMWare Solution service
- Class `com.oracle.bmc.ocvp.model.SupportedSkuSummaryCollection` has been removed in the VMWare Solution service

## 3.29.0 - 2023-11-14
### Added
- Support for the PostgreSQL service
- Support for new operations in the Identity Domains service
- Support for enabling, disabling, and renewing SSL/TLS in the Big Data service
- Support for diarization in the AI Speech service
- Support for Capacity Topology API in the Compute service
 
### Breaking Changes
- Return type of method `public java.lang.String getStatus()` has been changed to `com.oracle.bmc.identitydomains.model.MyRequest$Status` in `com.oracle.bmc.identitydomains.model.MyRequest` in the Identity Domains service

## 3.28.1 - 2023-11-07
### Added
- Support for Java Management Service Downloads
- Support for creating autonomous dataguard associations in the Database service
- Support for SaaS administrative user configurations for autonomous database in the Database service
- Support for macOS in the the Java Management service
- Support for distribution and management of deployment rule sets in the Java Management service
- Support for new download location of Oracle Java runtime binaries in the Java Management service
- Support for exporting data across regions in the Java Management service

## 3.28.0 - 2023-10-31
### Added
- Support for calling Oracle Cloud Infrastructure services in the us-saltlake-2 region
- Support for disaster recovery of load balancers, network load balancers and file systems in the Disaster Recovery service
- Support for performing disaster recovery drills in the Disaster Recovery service
- Support for enterprise SKUs and extensibility in the Stack Monitoring service
- Support for metric extensions in the Stack Monitoring service
- Support for baseline and anomaly detection in the Stack Monitoring service
- Support for integration with Database Management service in the MySQL HeatWave service
- Support for MySQL database management in the Database Management service
- Support for database firewalls in the Data Safe service  
 
### Breaking Changes
- Method `public java.lang.String getCompartmentId()` has been removed from the model `com.oracle.bmc.datasafe.model.ProfileAggregation` in the Data Safe service
- Method `public java.lang.String getUserAssessmentId()` has been removed from the model `com.oracle.bmc.datasafe.model.ProfileAggregation` in the Data Safe service
- `ProcessingException` is now caught and `BmcException` is thrown instead in order to fix timeout retries
- Modules `bmc-graalvm-addon` and `bmc-graalvm-jersey3-addon` have been removed from the `bmc-addons` module. Please refer README.md for more information.

## 3.27.0 - 2023-10-24
### Added
- Support for optional parameters for autonomous container database create and update operations in the Database service
- Support for maintenance runs for autonomous container database resources in the Database service
- Support for runtime unsupported connections for Oracle Database and MySQL database types in the Database Tools service
- Support for PostgreSQL, Generic JDBC connections with runtime unsupported in the Database Tools service
- Support for resource locking in the Database Tools service
- Support for proxy sessions for Oracle database connections in the Database Tools service
- Support for global active tables in the NoSQL Database service
- Support for application dependency management (ADM) remediation features in the Application Dependency Management service
- Support for additional connections types for Amazon Kinesis, Amazon Redshift, Elasticsearch, Generic, Google BigQuery, Google Cloud Storage and Redis Database resources in the Golden Gate service
- Support for optional parameters for the list alarms status operation in the Monitoring Service
 
### Breaking Changes
- Support for retries by default on operations of the Database Tools service
- Support for retries by default on operations of the Monitoring service
- Method `public java.lang.String getOpcRetryToken()` has been removed from models `com.oracle.bmc.databasetools.requests.ChangeDatabaseToolsConnectionCompartmentRequest` and `com.oracle.bmc.databasetools.requests.ChangeDatabaseToolsPrivateEndpointCompartmentRequest` in the Database Tools service

## 3.26.0 - 2023-10-17
### Added
- Support for the Caching Service
- Support for the Marketplace Publisher service
- Support for higher limits for network firewalls in the Network Firewall service
- Support for exporting access request reports in the Lockbox service
- Support for storage mounts for jobs and notebooks in the Data Science service
- Support for unified agent operational metrics for the service configurations in the Logging Management service

### Breaking Changes
- Method `public java.util.Map getApplicationLists()` has been removed from model `com.oracle.bmc.networkfirewall.model.CreateNetworkFirewallPolicyDetails` in the Network Firewall service
- Method `public java.util.Map getDecryptionProfiles()` has been removed from model `com.oracle.bmc.networkfirewall.model.CreateNetworkFirewallPolicyDetails` in the Network Firewall service
- Method `public java.util.List getDecryptionRules()` has been removed from model `com.oracle.bmc.networkfirewall.model.CreateNetworkFirewallPolicyDetails` in the Network Firewall service
- Method `public java.util.Map getIpAddressLists()` has been removed from model `com.oracle.bmc.networkfirewall.model.CreateNetworkFirewallPolicyDetails` in the Network Firewall service
- Method `public java.util.Map getMappedSecrets()` has been removed from model `com.oracle.bmc.networkfirewall.model.CreateNetworkFirewallPolicyDetails` in the Network Firewall service
- Method `public java.util.List getSecurityRules()` has been removed from model `com.oracle.bmc.networkfirewall.model.CreateNetworkFirewallPolicyDetails` in the Network Firewall service
- Method `public java.util.Map getUrlLists()` has been removed from model `com.oracle.bmc.networkfirewall.model.CreateNetworkFirewallPolicyDetails` in the Network Firewall service
- Method `public java.util.List getDestinations()` has been removed from model `com.oracle.bmc.networkfirewall.model.DecryptionRuleMatchCriteria` in the Network Firewall service
- Method `public java.util.List getSources()` has been removed   from model `com.oracle.bmc.networkfirewall.model.DecryptionRuleMatchCriteria` in the Network Firewall service
- Method `public java.util.Map getApplicationLists()` has been removed from model `com.oracle.bmc.networkfirewall.model.NetworkFirewallPolicy` in the Network Firewall service
- Method `public java.util.Map getDecryptionProfiles()` has been removed from model `com.oracle.bmc.networkfirewall.model.NetworkFirewallPolicy` in the Network Firewall service
- Method `public java.util.List getDecryptionRules()` has been removed from model `com.oracle.bmc.networkfirewall.model.NetworkFirewallPolicy` in the Network Firewall service
- Method `public java.util.Map getIpAddressLists()` has been removed from model `com.oracle.bmc.networkfirewall.model.NetworkFirewallPolicy` in the Network Firewall service
- Method `public java.lang.Boolean getIsFirewallAttached()` has been removed from model `com.oracle.bmc.networkfirewall.model.NetworkFirewallPolicy` in the Network Firewall service
- Method `public java.util.Map getMappedSecrets()` has been removed from model `com.oracle.bmc.networkfirewall.model.NetworkFirewallPolicy` in the Network Firewall service
- Method `public java.util.List getSecurityRules()` has been removed from model `com.oracle.bmc.networkfirewall.model.NetworkFirewallPolicy` in the Network Firewall service
- Method `public java.util.Map getUrlLists()` has been removed from model `com.oracle.bmc.networkfirewall.model.NetworkFirewallPolicy` in the Network Firewall service
- Method `public java.util.List getApplications()` has been removed from model `com.oracle.bmc.networkfirewall.model.SecurityRuleMatchCriteria` in the Network Firewall service
- Method `public java.util.List getDestinations()` has been removed from model `com.oracle.bmc.networkfirewall.model.SecurityRuleMatchCriteria` in the Network Firewall service
- Method `public java.util.List getSources()` has been removed from model `com.oracle.bmc.networkfirewall.model.SecurityRuleMatchCriteria` in the Network Firewall service
- Method `public java.util.List getUrls()` has been removed from model `com.oracle.bmc.networkfirewall.model.SecurityRuleMatchCriteria` in the Network Firewall service
- Method `public java.util.Map getApplicationLists()` has been removed from model `com.oracle.bmc.networkfirewall.model.UpdateNetworkFirewallPolicyDetails` in the Network Firewall service
- Method `public java.util.Map getDecryptionProfiles()` has been removed from model `com.oracle.bmc.networkfirewall.model.UpdateNetworkFirewallPolicyDetails` in the Network Firewall service
- Method `public java.util.List getDecryptionRules()` has been removed from model `com.oracle.bmc.networkfirewall.model.UpdateNetworkFirewallPolicyDetails` in the Network Firewall service
- Method `public java.util.Map getIpAddressLists()` has been removed from model `com.oracle.bmc.networkfirewall.model.UpdateNetworkFirewallPolicyDetails` in the Network Firewall service
- Method `public java.util.Map getMappedSecrets()` has been removed from model `com.oracle.bmc.networkfirewall.model.UpdateNetworkFirewallPolicyDetails` in the Network Firewall service
- Method `public java.util.List getSecurityRules()` has been removed from model `com.oracle.bmc.networkfirewall.model.UpdateNetworkFirewallPolicyDetails` in the Network Firewall service
- Method `public java.util.Map getUrlLists()` has been removed from model `com.oracle.bmc.networkfirewall.model.UpdateNetworkFirewallPolicyDetails` in the Network Firewall service
- Class `com.oracle.bmc.networkfirewall.model.DecryptionProfile$Type` has been removed in the Network Firewall service
- Class `com.oracle.bmc.networkfirewall.model.DecryptionRule$Action` has been removed in the Network Firewall service
- Class `com.oracle.bmc.networkfirewall.model.MappedSecret$Type `  has been removed in the Network Firewall service
- Class `com.oracle.bmc.networkfirewall.model.SecurityRule$Action` has been removed in the Network Firewall service
- Class `com.oracle.bmc.networkfirewall.model.SecurityRule$Inspection` has been removed in the Network Firewall service
- Class `com.oracle.bmc.networkfirewall.model.TcpApplication` has been removed in the Network Firewall service
- Class `com.oracle.bmc.networkfirewall.model.UdpApplication` has been removed in the Network Firewall service
- Return type of method `public com.oracle.bmc.networkfirewall.model.DecryptionRule$Action getAction()` has been changed to `com.oracle.bmc.networkfirewall.model.DecryptionActionType` in the model `com.oracle.bmc.networkfirewall.model.DecryptionRule` in the Network Firewall service
- Return type of method `public com.oracle.bmc.networkfirewall.model.MappedSecret$Type getType()` has been changed to `com.oracle.bmc.networkfirewall.model.InspectionType` in the model `com.oracle.bmc.networkfirewall.model.MappedSecre` in the Network Firewall service
- Return type of method `public com.oracle.bmc.networkfirewall.model.SecurityRule$Action getAction()` has been changed to `com.oracle.bmc.networkfirewall.model.TrafficActionType` in the model `com.oracle.bmc.networkfirewall.model.SecurityRule`
- Return type of method `public com.oracle.bmc.networkfirewall.model.SecurityRule$Inspection getInspection()` has been changed to `com.oracle.bmc.networkfirewall.model.TrafficInspectionType` in the model `com.oracle.bmc.networkfirewall.model.SecurityRule`
- Method `public java.lang.String getDisplayName()` has been removed in the model `com.oracle.bmc.logging.model.Parameter` in the Logging Management service
- Method `public java.lang.String getRqsType()` has been removed in the model `com.oracle.bmc.logging.model.Parameter` in the Logging Management service
- Method `public java.lang.String getServiceStage()` has been removed in the model `com.oracle.bmc.logging.requests.ListServicesRequest` in the Logging Management service
- Removed field `EnumString` in `com.oracle.bmc.logging.model.Parameter$Type` in the Logging Management service
- Removed field `RqsFilter` in `com.oracle.bmc.logging.model.Parameter$Type` in the Logging Management service

## 3.25.4 - 2023-10-10
### Added
- Support for creating flow log type capture filters in Virtual Cloud Network service
- Support for export and import of metadata in Data Integration service
- Support for displaying resource usage information on autonomous vm cluster get operations in Database service
- Support for displaying resource usage information for the list of autonomous container databases on autonomous vm cluster get operations in Database service
- Support for pluggable database with enhanced features in Database service
- Support for exporting container and kubernetes app listings in Marketplace service
- Support for work request statuses for export container and kubernetes app listings in Marketplace service

## 3.25.3 - 2023-10-03
### Added
- Support for elastic resource pools in the Database service
- Support for private endpoints in the Data Science service
- Support for File System Service (FSS) as transfer medium for data export and import in the Database Migration service
- Support for new optional parameters on replica create, update and list operations in the MySQL Heatwave service

## 3.25.2 - 2023-09-26
### Added
- Support for listing compute performances and storage performances in Database service
- Support for private endpoints for external key managers in Key Management service
- Support for additional parameters in vaults and keys for external key managers in Key Management service
- Support for domains while creating integration instances in Oracle Integration Cloud service

## 3.25.1 - 2023-09-12
### Added
- Support for SQL tuning sets in Database Management service
- Support for announcement chaining in Announcements service
- Support for automatic promotion of hosts in Stack Monitoring service
- Support for face detection in AI Vision service
- Support for change parameters on list character sets operation in Database Management service
- Support for displaying software sources attached to a managed instance group in OS Management service

## 3.25.0 - 2023-09-05
### Added
- Support for queue channels in the Queue Service
- Support for entity lineage retrieval and asynchronous glossary export in the Data Catalog service
- Support for filtering and sorting while listing work requests in the Container Instances service
- Support for the ability to create support requests for various support ticket types (TECH, LIMIT, ACCOUNT) in the Customer Incident Management Service
- Endpoint changed from https://incidentmanagement.{region}.{domainAndTopLevelDomain} to https://incidentmanagement.{region}.oci.{domainAndTopLevelDomain} (e.g. https://incidentmanagement.us-phoenix-1.oraclecloud.com to https://incidentmanagement.us-phoenix-1.oci.oraclecloud.com) in the Customer Incident Management Service
 
### Breaking Changes
- Class `com.oracle.bmc.cims.User` has been removed in the Customer Incident Management Service
- Class `com.oracle.bmc.cims.UserClient` has been removed in the Customer Incident Management Service
- Class `com.oracle.bmc.cims.model.AvailabilityDomain` has been removed in the Customer Incident Management Service
- Method `public com.oracle.bmc.cims.model.AvailabilityDomain getAvailabilityDomain()` has been removed in the model `com.oracle.bmc.cims.model.CreateResourceDetails` in the Customer Incident Management Service
- Return type of method `public com.oracle.bmc.cims.model.Region getRegion()` has been changed to `java.lang.String` in the model `com.oracle.bmc.cims.model.CreateResourceDetails` in the Customer Incident Management Service
- Method `public java.lang.String getCountry()` has been removed in the model `com.oracle.bmc.cims.model.CreateUserDetails` in the Customer Incident Management Service
- Class `com.oracle.bmc.cims.model.Region` has been removed in the Customer Incident Management Service
- Method `public com.oracle.bmc.cims.model.AvailabilityDomain getAvailabilityDomain()` has been removed in the model `com.oracle.bmc.cims.model.Resource` in the Customer Incident Management Service
- Return type of method `public com.oracle.bmc.cims.model.Region getRegion()` has been changed to `java.lang.String` in the model `com.oracle.bmc.cims.model.Resource` in the Customer Incident Management Service
- Class `com.oracle.bmc.cims.requests.CreateUserRequest` has been removed in the Customer Incident Management Service
- Method `public java.lang.String getProblemType()` has been removed in `com.oracle.bmc.cims.requests.GetIncidentRequest` in the Customer Incident Management Service
- Method `public java.lang.String getSource()` has been removed in `com.oracle.bmc.cims.requests.GetStatusRequest` in the Customer Incident Management Service
- Return type of method `public java.lang.String getProblemType()` has been changed to `com.oracle.bmc.cims.model.ProblemType` in `com.oracle.bmc.cims.requests.ValidateUserRequest` in the Customer Incident Management Service
- Class `com.oracle.bmc.cims.responses.CreateUserResponse` has been removed in the Customer Incident Management Service

## 3.24.0 - 2023-08-29
### Added 
- Support for creating and updating network monitors in the Application Performance Monitoring Synthetics service
- Support for integration of GoldenGate service for replication in the Database Migration Service
- Support for displaying resource usage information on autonomous container database and cloud autonomous vm cluster get operations in the Database service
- Support for FastConnect Media Access Control Security (MACSec) fail open option in the Network Monitoring service
- Support for generic bare metal types and configuration maps in compute instance platform configuration in the Compute service
- Support for encrypted FastConnect in the Network Monitoring service
- Support for new parameters on customer premises equipment and virtual circuit create operations in the Network Monitoring service
- Support for virtual circuit associated tunnels in the Network Monitoring service
- Support for additional parameters on dynamic routing gateway create and update operations in the Network Monitoring service
- Support for assigning an IPv6 address to a compute instance during instance launch or secondary VNIC attach in the Compute service      
 
### Breaking Changes  
- Method `public com.oracle.bmc.mysql.responses.AddAnalyticsClusterResponse addAnalyticsCluster(com.oracle.bmc.mysql.requests.AddAnalyticsClusterRequest)` has been removed from `com.oracle.bmc.mysql.DbSystem` in the MySQL Database service
- Method `public com.oracle.bmc.mysql.responses.DeleteAnalyticsClusterResponse deleteAnalyticsCluster(com.oracle.bmc.mysql.requests.DeleteAnalyticsClusterRequest)` has been removed from `com.oracle.bmc.mysql.DbSystem` in the MySQL Database service
- Method `public com.oracle.bmc.mysql.responses.GenerateAnalyticsClusterMemoryEstimateResponse generateAnalyticsClusterMemoryEstimate(com.oracle.bmc.mysql.requests.GenerateAnalyticsClusterMemoryEstimateRequest)` has been removed from `com.oracle.bmc.mysql.DbSystem` in the MySQL Database service
- Method `public com.oracle.bmc.mysql.responses.GetAnalyticsClusterResponse getAnalyticsCluster(com.oracle.bmc.mysql.requests.GetAnalyticsClusterRequest)` has been removed from `com.oracle.bmc.mysql.DbSystem` in the MySQL Database service
- Method `public com.oracle.bmc.mysql.responses.GetAnalyticsClusterMemoryEstimateResponse getAnalyticsClusterMemoryEstimate(com.oracle.bmc.mysql.requests.GetAnalyticsClusterMemoryEstimateRequest)` has been removed from `com.oracle.bmc.mysql.DbSystem` in the MySQL Database service
- Method `public com.oracle.bmc.mysql.responses.RestartAnalyticsClusterResponse restartAnalyticsCluster(com.oracle.bmc.mysql.requests.RestartAnalyticsClusterRequest)` has been removed from `com.oracle.bmc.mysql.DbSystem` in the MySQL Database service
- Method `public com.oracle.bmc.mysql.responses.StartAnalyticsClusterResponse startAnalyticsCluster(com.oracle.bmc.mysql.requests.StartAnalyticsClusterRequest)` has been removed from `com.oracle.bmc.mysql.DbSystem` in the MySQL Database service
- Method `public com.oracle.bmc.mysql.responses.StopAnalyticsClusterResponse stopAnalyticsCluster(com.oracle.bmc.mysql.requests.StopAnalyticsClusterRequest)` has been removed from `com.oracle.bmc.mysql.DbSystem` in the MySQL Database service
- Method `public com.oracle.bmc.mysql.responses.UpdateAnalyticsClusterResponse updateAnalyticsCluster(com.oracle.bmc.mysql.requests.UpdateAnalyticsClusterRequest)` has been removed from `com.oracle.bmc.mysql.DbSystem` in the MySQL Database service
- Method `public com.oracle.bmc.waiter.Waiter forAnalyticsCluster(com.oracle.bmc.mysql.requests.GetAnalyticsClusterRequest, com.oracle.bmc.mysql.model.AnalyticsCluster$LifecycleState[])` has been removed from `com.oracle.bmc.mysql.DbSystemWaiters` in the MySQL Database service
- Method `public com.oracle.bmc.waiter.Waiter forAnalyticsCluster(com.oracle.bmc.mysql.requests.GetAnalyticsClusterRequest, com.oracle.bmc.mysql.model.AnalyticsCluster$LifecycleState, com.oracle.bmc.waiter.TerminationStrategy, com.oracle.bmc.waiter.DelayStrategy)` has been removed from `com.oracle.bmc.mysql.DbSystemWaiters` in the MySQL Database service
- Method `public com.oracle.bmc.waiter.Waiter forAnalyticsCluster(com.oracle.bmc.mysql.requests.GetAnalyticsClusterRequest, com.oracle.bmc.waiter.TerminationStrategy, com.oracle.bmc.waiter.DelayStrategy, com.oracle.bmc.mysql.model.AnalyticsCluster$LifecycleState[])` has been removed from `com.oracle.bmc.mysql.DbSystemWaiters` in the MySQL Database service
- Class `com.oracle.bmc.mysql.model.AddAnalyticsClusterDetails` has been removed from the MySQL Database service
- Class `com.oracle.bmc.mysql.model.AnalyticsCluster` has been removed from the MySQL Database service
- Class `com.oracle.bmc.mysql.model.AnalyticsClusterMemoryEstimate` has been removed from the MySQL Database service
- Class `com.oracle.bmc.mysql.model.AnalyticsClusterMemoryEstimateStatus` has been removed from the MySQL Database service
- Class `com.oracle.bmc.mysql.model.AnalyticsClusterNode` has been removed from the MySQL Database service
- Class `com.oracle.bmc.mysql.model.AnalyticsClusterSchemaMemoryEstimate` has been removed from the MySQL Database service
- Class `com.oracle.bmc.mysql.model.AnalyticsClusterSummary` has been removed from the MySQL Database service
- Class `com.oracle.bmc.mysql.model.AnalyticsClusterTableMemoryEstimate` has been removed from the MySQL Database service
- Method `public com.oracle.bmc.mysql.model.AnalyticsClusterSummary getAnalyticsCluster()` has been removed from the model `com.oracle.bmc.mysql.model.DbSystem` in the MySQL Database service
- Method `public java.lang.Boolean getIsAnalyticsClusterAttached()` has been removed from the model `com.oracle.bmc.mysql.model.DbSystem` in the MySQL Database service
- Method `public com.oracle.bmc.mysql.model.AnalyticsClusterSummary getAnalyticsCluster()` has been removed from the model `com.oracle.bmc.mysql.model.DbSystemSummary` in the MySQL Database service
- Method `public java.lang.Boolean getIsAnalyticsClusterAttached()` has been removed from the model `com.oracle.bmc.mysql.model.DbSystemSummary` in the MySQL Database service
- Field `Analyticscluster` has been removed from the model `com.oracle.bmc.mysql.model.ShapeSummary$IsSupportedFor` in the MySQL Database service
- Class `com.oracle.bmc.mysql.model.UpdateAnalyticsClusterDetails` has been removed from the MySQL Database service
- Field `AddAnalyticsCluster` has been removed from the model `com.oracle.bmc.mysql.model.WorkRequestOperationType` in the MySQL Database service
- Field `DeleteAnalyticsCluster` has been removed from the model `com.oracle.bmc.mysql.model.WorkRequestOperationType` in the MySQL Database service
- Field `GenerateAnalyticsClusterMemoryEstimate` has been removed from the model `com.oracle.bmc.mysql.model.WorkRequestOperationType` in the MySQL Database service
- Field `RestartAnalyticsCluster` has been removed from the model `com.oracle.bmc.mysql.model.WorkRequestOperationType` in the MySQL Database service
- Field `StartAnalyticsCluster` has been removed from the model `com.oracle.bmc.mysql.model.WorkRequestOperationType` in the MySQL Database service
- Field `StopAnalyticsCluster` has been removed from the model `com.oracle.bmc.mysql.model.WorkRequestOperationType` in the MySQL Database service
- Field `UpdateAnalyticsCluster` has been removed from the model `com.oracle.bmc.mysql.model.WorkRequestOperationType` in the MySQL Database service
- Class `com.oracle.bmc.mysql.requests.AddAnalyticsClusterRequest` has been removed from the MySQL Database service
- Class `com.oracle.bmc.mysql.requests.DeleteAnalyticsClusterRequest` has been removed from the MySQL Database service
- Class `com.oracle.bmc.mysql.requests.GenerateAnalyticsClusterMemoryEstimateRequest` has been removed from the MySQL Database service
- Class `com.oracle.bmc.mysql.requests.GetAnalyticsClusterMemoryEstimateRequest` has been removed from the MySQL Database service
- Class `com.oracle.bmc.mysql.requests.GetAnalyticsClusterRequest` has been removed from the MySQL Database service
- Method `public java.lang.Boolean getIsAnalyticsClusterAttached()` has been removed from `com.oracle.bmc.mysql.requests.ListDbSystemsRequest` in the MySQL Database service
- Field `Analyticscluster` has been removed from `com.oracle.bmc.mysql.requests.ListShapesRequest$IsSupportedFor` in the MySQL Database service
- Class `com.oracle.bmc.mysql.requests.RestartAnalyticsClusterRequest` has been removed from the MySQL Database service
- Class `com.oracle.bmc.mysql.requests.StartAnalyticsClusterRequest` has been removed from the MySQL Database service
- Class `com.oracle.bmc.mysql.requests.StopAnalyticsClusterRequest` has been removed from the MySQL Database service
- Class `com.oracle.bmc.mysql.requests.UpdateAnalyticsClusterRequest` has been removed from the MySQL Database service
- Class `com.oracle.bmc.mysql.responses.AddAnalyticsClusterResponse` has been removed from the MySQL Database service
- Class `com.oracle.bmc.mysql.responses.DeleteAnalyticsClusterResponse` has been removed from the MySQL Database service
- Class `com.oracle.bmc.mysql.responses.GenerateAnalyticsClusterMemoryEstimateResponse` has been removed from the MySQL Database service
- Class `com.oracle.bmc.mysql.responses.GetAnalyticsClusterMemoryEstimateResponse` has been removed from the MySQL Database service
- Class `com.oracle.bmc.mysql.responses.GetAnalyticsClusterResponse` has been removed from the MySQL Database service
- Class `com.oracle.bmc.mysql.responses.RestartAnalyticsClusterResponse` has been removed from the MySQL Database service
- Class `com.oracle.bmc.mysql.responses.StartAnalyticsClusterResponse` has been removed from the MySQL Database service
- Class `com.oracle.bmc.mysql.responses.StopAnalyticsClusterResponse` has been removed from the MySQL Database service
- Class `com.oracle.bmc.mysql.responses.UpdateAnalyticsClusterResponse` has been removed from the MySQL Database service

## 3.23.2 - 2023-08-22
### Added
- Support for Compute Cloud at Customer service
- Support for warehouse data objects in the Operations Insights service
- Support for standard queries on operations Insights data objects in the Operations Insights service
- Support for database in memory on autonomous database create operations in the Database service

## 3.23.1 - 2023-08-15
### Added
- Support for credential stores, including Single Sign-On support, for deployments in the GoldenGate service
- Support for container security contexts in the Container Instances service
- Support for placement constraints and cluster configurations on cluster networks in the Compute service

## 3.23.0 - 2023-08-08
### Added
- Support for backup retention on autonomous database create operations in the Database service
- Support for exclude tables for replication in the Database Migration service
- Support for adding and updating auto failover maximum data loss limits for local autonomous data guards in the Database service
- Support for limiting networking diagram ingestion in the Networking Monitoring service
- Support for new operations for deployment upgrades in the GoldenGate service
- Support for getting model type information and base model versions while creating language custom models in the AI Language service
- Support for support field in class metric in the AI Language service
- Support for Compute Cloud at Customer resource type in the Operator Access Control service
- Support for managing account management info, account recovery settings, app roles, apps, app status changers, grants, identity propagation trusts and settings, request-able groups, requests, security questions, OAuth tokens, and user attribute settings in the Identity Domains service

### Breaking Changes
- Support for retries by default on operations in the Operator Access Control service
- Method `public java.lang.Boolean getIsInternetAccessAllowed()` has been removed from the model ` com.oracle.bmc.vnmonitoring.model.CreateIpv6Details` in the Networking Monitoring service
- Method `public java.lang.String getIpv6CidrBlock()` has been removed from the model  `com.oracle.bmc.vnmonitoring.model.CreateVcnDetails` in the Networking Monitoring service
- Method `public java.lang.Boolean getIsInternetAccessAllowed()` has been removed from the model `com.oracle.bmc.vnmonitoring.model.Ipv6` in the Networking Monitoring service
- Method `public java.lang.String getPublicIpAddress()` has been removed from the model `com.oracle.bmc.vnmonitoring.model.Ipv6` in the Networking Monitoring service
- Method `public java.lang.String getIpv6PublicCidrBlock()` has been removed from the model `com.oracle.bmc.vnmonitoring.model.Subnet` in the  Networking Monitoring service
- Method `public java.lang.Boolean getIsInternetAccessAllowed()` has been removed from the model `com.oracle.bmc.vnmonitoring.model.UpdateIpv6Details` in the  Networking Monitoring service
- Method `public java.lang.String getIpv6CidrBlock()` has been removed from the model `com.oracle.bmc.vnmonitoring.model.Vcn` in the  Networking Monitoring service
- Method `public java.lang.String getIpv6PublicCidrBlock()` has been removed from the model `com.oracle.bmc.vnmonitoring.model.Vcn` in the  Networking Monitoring service

## 3.22.0 - 2023-08-01
### Added
- Support for the Exadata Fleet Update service
- Support for REST-based log collection, multi-conditional labels, and collection properties in the Logging Analytics service
- Support for Kubernetes cluster credential rotation in the Container Engine for Kubernetes service
- Support for zero-downtime features in the Fusion Apps as a Service service
- Support for news reports in the Operations Insights service  
 
### Breaking Changes
- The EnumMember `AccelerationMaintenance` has been removed from the model `com.oracle.bmc.loganalytics.model.TaskType` in the Logging Analytics service

## 3.21.0 - 2023-07-25
### Added
- Support for composing multiple document service custom key value models into one single model in Document Understanding Service
- Support for custom hostname in the Compute service
- Support for cloud subscription in the Organizations service
- Support for automatic backup download in the GoldenGate service
- Support for creating single use (non-recurring) budgets in the Budgets service
  
  
### Breaking Changes
- Default Retries enabled in Budgets service
- The properties `classicSubscriptionId`, `isClassicSubscription`, `regionAssignment`, `lifecycleState`, `startDate` and `endDate` were removed from the models `AssignedSubscription`, `AssignedSubscriptionSummary`, `Subscription` and `SubscriptionSummary` in the Organizations service
- The property `paymentModel` has been removed from `Subscription` and `SubscriptionSummary` models in the Organizations service
- The properties `subscriptionTier`, `isGovernmentSubscription`, `promotion`, `purchaseEntitlementId`, `skus`, `csiNumber`, `cloudAmountCurrency`, `customerCountryCode, and `programType` have been removed from `AssignedSubscription` and `Subscription` models in the Organizations service
- The property `orderIds` has been removed from `AssignedSubscription` model in the Organizations service
- The EnumMembers `UPDATING`, `DELETING` and `DELETED` were removed from the enum `SubscriptionLifecycleState` in the Organizations service

## 3.20.0 - 2023-07-18
### Added
- Support for calling Oracle Cloud Infrastructure services in the mx-monterrey-1 region
- Support for Kerberos and LDAP with NFSv3 in the File Storage service
- Support for capacity reservation checks for movable compute instances in the Disaster Recovery service
- Support for Oracle MFT monitoring in the Stack Monitoring service
- Support for OS patching in the Big Data service
- Support for master and utility nodes in the Big Data service
- Support for connectivity testing in the GoldenGate service
 
### Breaking Changes
- Return type of method `public java.math.BigDecimal getSizeInBytes()` has been changed to `java.lang.Long` in the model `com.oracle.bmc.goldengate.model.DeploymentBackup` in the GoldenGate service
- Return type of method `public java.math.BigDecimal getSizeInBytes()` has been changed to `java.lang.Long` in the model `com.oracle.bmc.goldengate.model.DeploymentBackupSummary` in the GoldenGate service
- Return type of method `public java.math.BigDecimal getSizeInBytes()` has been changed to `java.lang.Long` in the model `com.oracle.bmc.goldengate.model.TrailFileSummary` in the GoldenGate service
- Return type of method `public java.math.BigDecimal getSizeInBytes()` has been changed to `java.lang.Long` in the model `com.oracle.bmc.goldengate.model.TrailSequenceSummary` in the GoldenGate service
- Method `public java.util.List getAdditionalCapabilities()` has been removed from the model `com.oracle.bmc.containerinstances.model.Container` in the Container Instances service
- Field `UnknownEnumValue` has been removed from the model `com.oracle.bmc.containerinstances.model.ContainerCapability` in the Container Instances service
- Method `public java.util.List getAdditionalCapabilities()` has been removed from the model `com.oracle.bmc.containerinstances.model.CreateContainerDetails` in the Container Instances service

## 3.19.0 - 2023-07-11
### Added
- Support for specifying default snapshot enablement, verified response codes, client certificate details, and request authentication schemes when creating or updating synthetic monitors in the Application Performance Monitoring service
- Support for address rules, address verification, and requesting addresses in the OSP Gateway service
- Support for synchronous operations in the Document Understanding service
- Support for migration without SSH to database hosts (DMS) in the Database Migration service
- Support for processing workload mappings in the Container Engine for Kubernetes service
- Support for Salesforce, MySQL HeatWave, and Oracle EBS, Sieble, and PeopleSoft connectors in the Data Integration service
- Support for updating the envelope key of a volume backup in the Block Volume service
 
### Breaking Changes
- Model `com.oracle.bmc.ospgateway.model.BillingAddress` has been removed from the OSP Gateway service
- Return type of method `public com.oracle.bmc.ospgateway.model.BillingAddress getBillingAddress()` has been changed to `com.oracle.bmc.ospgateway.model.Address` in the model `com.oracle.bmc.ospgateway.model.Subscription` in the OSP Gateway service
- Return type of method `public com.oracle.bmc.ospgateway.model.BillingAddress getBillingAddress()` has been changed to `com.oracle.bmc.ospgateway.model.Address` in the model `com.oracle.bmc.ospgateway.model.SubscriptionSummary` in the OSP Gateway service
- Support for retries by default on operations of the OSP Gateway service

## 3.18.0 - 2023-06-27
### Added
- Support for calling Oracle Cloud Infrastructure services in the eu-frankfurt-2 region
- Support for the OS Management Hub service
- Support for changing the key store type, and rotating keys, on Exadata Cloud at Customer in the Database service
- Support for launching VM database systems using Ampere A1 shapes in the Database service
- Support for additional currencies and countries on paid listings in the Marketplace service
- Support for ECPU integration in the License Manager service
- Support for freeform and defined tags on resources in the Generic Artifacts service
- Support for SQL endpoints in the Data Flow service
- Support for setting replication delays on channels in the MySQL Database service
- Support for setting how channels handle replicated tables with no primary key in the MySQL Database service
- Support for SQL Plan Management (SPM) in Database Management service  
 
### Breaking Changes
- Support for retries by default on operations of the Generic Artifacts service

## 3.17.1 - 2023-06-20
### Added
- Support for serial console access in the Database service
- Support for an increased storage size limit of up to 384 TBs in the Database service
- Support for network security group (NSG) support for private database registrations / private endpoints in the Database Migration service
- Support for document classification on documents of more than one page in the Data Labeling service
- Support for importing datasets in the Data Labeling service
- Support for specifying a shape when creating applications in the Functions service
- Support for creating and managing pools in the Data Flow service
- Support for specifying certificate parameters when creating or updating a node in the Roving Edge Infrastructure service
- Support for certificate management in the Roving Edge Infrastructure service
- Support for upgrade bundle management in the Roving Edge Infrastructure service

## 3.17.0 - 2023-06-13
### Added
- Support for the OCI Control Center service
- Support for resource quotas and limits in the Usage service
- Support for allowing users to select the billing interval of deleted ESXi hosts while adding new ESXi hosts in the VMWare Solution service
- Support for custom key/value pairs and custom document classification in the AI Document service
- Support for namespace-prefixed domains in the Object Storage service
- Support for getting the full path to a pre-authenticated request in the Object Storage service
- Support for Java migration analysis, performance tuning recommendations, and JDK LCM customization in the Java Management service
- Support for the TCPS protocol for cloud databases in the Operations Insights service
- Support for AIX hosts that are monitored via Enterprise Manager in the Operations Insights service
 
### Breaking Changes
- Return type of method `public java.math.BigDecimal getCapacity()` has been changed to `java.lang.Double` in the `DatastoreSummary` model of the VMWare Solution service

## 3.16.1 - 2023-06-06
### Added
- Support for calling Oracle Cloud Infrastructure services in the eu-madrid-2 region
- Support for bulk include/exclude of migration objects in the Database Migration service
- Support for Kafka cluster profiles, including dedicated Kafka broker nodes, in the Big Data service
- Support for MySQL HeatWave Lakehouse in the MySQL Database service
- Support for capacity reports in the Compute service

## 3.16.0 - 2023-05-30
### Added
- Support for policy-based snapshots in the File Storage service
- Support for creating and updating a VM cluster network with disaster recovery network support in the Database service
- Support for setting a management dashboard or saved search to be shared across OCI Observability & Management services in the Management Dashboard service
 
### Breaking Changes
- Field `port` has been deprecated and made optional in the model `com.oracle.bmc.database.model.ScanDetails` in the Database service

## 3.15.0 - 2023-05-23
### Added
- Support for CRI-O parsing in the Logging service
- Support for retrieving the resource availability domain when getting Exadata infrastructure or VM clusters in the Database service
- Support for specifying database servers when creating dedicated autonomous databases in the Database service
- Support for secondary egress zones in the DNS service
 
### Breaking Changes
 - Method `public com.oracle.bmc.logging.responses.GetLogIncludedSearchResponse getLogIncludedSearch(com.oracle.bmc.logging.requests.GetLogIncludedSearchRequest)` has been removed from `com.oracle.bmc.logging.LoggingManagement` in the Logging service
 - Method `public com.oracle.bmc.logging.responses.ListLogIncludedSearchesResponse listLogIncludedSearches(com.oracle.bmc.logging.requests.ListLogIncludedSearchesRequest)` has been removed from `com.oracle.bmc.logging.LoggingManagement` in the Logging service
 - Method `public java.lang.Iterable listLogIncludedSearchesRecordIterator(com.oracle.bmc.logging.requests.ListLogIncludedSearchesRequest)` has been removed from `com.oracle.bmc.logging.LoggingManagementPaginators` in the Logging service
 - Method `public java.lang.Iterable listLogIncludedSearchesResponseIterator(com.oracle.bmc.logging.requests.ListLogIncludedSearchesRequest)` has been removed from `com.oracle.bmc.logging.LoggingManagementPaginators` in the Logging service
 - Class `com.oracle.bmc.logging.model.LogIncludedSearch` has been removed from the Logging service
 - Class `com.oracle.bmc.logging.model.LogIncludedSearchSummary` has been removed from the Logging service
 - Class `com.oracle.bmc.logging.model.LogIncludedSearchSummaryCollection` has been removed from the Logging service
 - Class `com.oracle.bmc.logging.requests.GetLogIncludedSearchRequest` has been removed from the Logging service
 - Class `com.oracle.bmc.logging.requests.ListLogIncludedSearchesRequest` has been removed from the Logging service
 - Class `com.oracle.bmc.logging.responses.GetLogIncludedSearchResponse` has been removed from the Logging service
 - Class `com.oracle.bmc.logging.responses.ListLogIncludedSearchesResponse` has been removed from the Logging service

## 3.14.0 - 2023-05-16
### Added
- Support for self-service integration in the Fusion Apps as a Service service
- The serializer is now pluggable and determined by the `HttpProvider`. For the Jersey 2 and Jersey 3 HTTP clients, Jackson continues to be used as the serializer
 
### Breaking Changes
- As part of the pluggable Serializer changes, when using the Jersey and Jersey 3 HTTP clients, the underlying Jackson `ObjectMapper` can now be obtained using `com.oracle.bmc.serialization.jackson.JacksonSerializer.getDefaultObjectMapper()`. The `com.oracle.bmc.http.client.Serialization.getObjectMapper()` method does not exist anymore.
- In the Fusion Apps as a Service service, the `AttachExistingInstanceDetails`, `CreateNewInstanceDetails`, `CreateOaxServiceInstanceDetails`, `CreateOicServiceInstanceDetails`, `CreateServiceInstanceDetails`, and `FawAdminInfoDetails` model classes were removed
- In the Fusion Apps as a Service service, the `CreateServiceAttachmentDetails` model class is now `final`, since all subclasses have been removed
- In the Fusion Apps as a Service service, the `action` property was removed in the `CreateServiceAttachmentDetails` model class

## 3.13.1 - 2023-05-09
### Added
- Support for the Access Governance service
- Support for creating, updating, listing and downloading one-off patches in the Database service
- Support for changing disaster recovery configurations of remote autonomous databases in the Database service
- Support for scheduling automatic backups in the Database service
- Support for provisioning Software-Defined Data Centers (SDDCs) using standard bare metal shapes, with Block Storage as the datastore, in the VMWare Solution service
- Support for parity with the configuration options of the Compute service in the Compute Autoscaling service

## 3.13.0 - 2023-05-02
### Added
- Support for calling Oracle Cloud Infrastructure services in the eu-jovanovac-1 region
- Support for bring-your-own-license TLS and ORDS certificates in the Database service
- Support for tags in the Stack Monitoring service
- Support for GPU shapes for model deployments in the Data Science service
- Support for returning networking details of instances in the Visual Builder service
- Support for high-memory VMs in the Compute service
- Support for integrating with the Integration Cloud service in the Process Automation service
- Support for managing on-demand node upgrades in node pools in the Container Engine for Kubernetes service
 
### Breaking Changes
- Support for retries by default on operations of the Process Automation service
- The model `com.oracle.bmc.containerengine.model.UpdateVirtualNodeDetails` has been removed from the Container Engine for Kubernetes service

## 3.12.1 - 2023-04-25
### Added
- Support for enabling mTLS authentication with Listener and for providing custom value for TLS port and Non-TLS Port during AVM Cluster Creation in Database service
- Support for usedDataStorageSizeInGbs property for autonomous database in the Database service
- Support for csiNumber organization in Tenant Manager Control Plane service
- Support for creating and updating an infrastructure with LACP support in Database service
- Support for changePrivateEndpointOutboundConnection operation in Integration Cloud service
- Support for Enable Process in Integration Cloud service
- Support for Disaster Recovery, DR enablement, switchover, and failover feature in Fusion Apps service
- Support for discovery and monitoring of External Exadata infrastructure in Database Management Service
### Fixed
- Fixed ability to completely disable the Apache Connector. Before this fix, some settings were set even when `USE_APACHE_CONNECTOR` was set to `false`. For examples, see [DisableApacheConnectorExample.java (Jersey 2)](https://github.com/oracle/oci-java-sdk/blob/master/bmc-other-examples/bmc-jersey-examples/src/main/java/DisableApacheConnectorExample.java) and [DisableApacheConnectorExample.java (Jersey 3)](https://github.com/oracle/oci-java-sdk/blob/master/bmc-other-examples/bmc-jersey3-examples/src/main/java/DisableApacheConnectorExample.java)

## 3.12.0 - 2023-04-18
### Added
- Support for private endpoints in the Digital Assistant service
- Support for canceling backups in the Database service
- Support for improved labeling of key/value pairs in the Data Labeling service
 
### Breaking Changes
- The method `public java.lang.String getOpcRetryToken()` has been removed from `com.oracle.bmc.oda.requests.ConfigureDigitalAssistantParametersRequest`, `com.oracle.bmc.oda.requests.RotateChannelKeysRequest`, `com.oracle.bmc.oda.requests.StartChannelRequest` and `com.oracle.bmc.oda.requests.StopChannelRequest` in the Digital Assistant service
- The method `public java.lang.String getDigitalAssistantId()` has been removed from `com.oracle.bmc.oda.requests.ListDigitalAssistantsRequest` in the Digital Assistant service
- The method `public java.lang.Boolean getIsLatestSkillOnly()` has been removed from `com.oracle.bmc.oda.requests.ListPackagesRequest` in the Digital Assistant service
- The method `public java.lang.String getSkillId()` has been removed from `com.oracle.bmc.oda.requests.ListSkillsRequest` in the Digital Assistant service
- The method `public java.lang.Integer getLifetimeLogicalClock()` has been removed from `com.oracle.bmc.datalabelingservicedataplane.model.Annotation`, `com.oracle.bmc.datalabelingservicedataplane.model.Dataset` and `com.oracle.bmc.datalabelingservicedataplane.model.Record` in the Data Labeling service
- Support for retries by default on operations of the Digital Assistant service

## 3.11.0 - 2023-04-11
### Added
- Support for rotation of certificates on autonomous VM clusters on Exadata Cloud at Customer in the Database service
- Support for ACD and OKV wallet naming for autonomous databases and dedicated autonomous databases on Exadata Cloud at Customer in the Database service
- Support for Exadata cloud service application virtual IPs (VIPs) in the Database service
- Support for additional manageability features for large sensitive data models and masking policies in the Data Safe service
- Support for getting user profile details and assignments for databases and fleets in the Data Safe service
- Support for enabling ADDM spotlight for databases in the Operations Insights service
- Support for Workload Identity Authentication when running on a cluster in the Container Engine for Kubernetes service  
 
### Breaking Changes
- The method public `java.util.List getAdditionalDatabaseStatus()` has been removed from from the models `AutonomousDatabase`, `AutonomousDatabaseSummary`, `AutonomousDataWarehouse`and `AutonomousDataWarehouseSummary` in the Database service
 
### Fixed
- Fixed ability to specify `httpProvider` in `KmsCryptoClientBuilder`, `KmsCryptoAsyncClientBuilder`, `KmsManagementClientBuilder`, `KmsManagementAsyncClientBuilder`, `StreamClientBuilder`, and `StreamAsyncClientBuilder` (see [#488](https://github.com/oracle/oci-java-sdk/issues/488))

## 3.10.0 - 2023-04-04
### Added
- Support for pre-emptible worker nodes in the Container Engine for Kubernetes service
- Support for larger data storage (now up to 128TB) in the MySQL Database service
- Support for HTTP health checks for HTTPS backend sets in the Load Balancer service  
 
### Breaking Changes
- The property `backendSetName` has been changed from optional to required in the model `com.oracle.bmc.loadbalancer.model.ForwardToBackendSet` in the Load Balancer service

## 3.9.1 - 2023-03-28
### Added
- Support for ACD and OKV wallet naming for autonomous databases and dedicated autonomous databases on Exadata Cloud at Customer in the Database service
- Support for validating the credentials of a connection in the DevOps service
- Support for GoldenGate Replicat performance profiles when creating a migration in the Database Migration service
- Support for connection diagnostics on registered databases in the Database Migration service
- Support for launching bare metal instances in an RDMA network in the Compute service

## 3.9.0 - 2023-03-21
### Added
- Support for backup automation integration with the Database Recovery service in the Database service
- Support for changing the disaster recovery configuration of an autonomous database in remote regions of its disaster recovery association in the Database service
- Support for creating a remote disaster recovery association clone of an autonomous database in the Database service
- Support for managed build stages to be configured to use custom shape build runners in the DevOps service
- Support for listing pre-built functions and creating functions from pre-built functions in the Functions service
- Support for connections types for database resources of type Amazon S3, HDFS, SQL Server, Java Messaging service, Mongo DB, Oracle NoSQL, and Snowflake in the GoldenGate service

### Breaking Changes
- The enum value `LAKE_HOUSE_CONNECTION` has been renamed to `LAKE_CONNECTION` in the enum `ModelType` in the models `Connection`, `ConnectionDetails`, `ConnectionSummary`, `CreateConnectionDetails`, `CreateDataAssetDetails`, `DataAssetSummary`, `UpdateConnectionDetails`, `UpdateDataAssetDetails` in the Data Integration service
- The classes `ConnectionFromLakehouse`, `ConnectionFromLakehouseDetails`, `ConnectionSummaryFromLakehouse`, `CreateConnectionFromLakehouse`, `CreateDataAssetFromLakehouse`, `DataAssetFromLakehouseDetails`, `DataAssetSummaryFromLakehouse`, `UpdateConnectionFromLakehouse`, `UpdateDataAssetFromLakehouse` have been removed from the Data Integration service
- Return type of method `public com.oracle.bmc.functions.model.FunctionSummary$LifecycleState getLifecycleState()` has been changed to `com.oracle.bmc.functions.model.Function$LifecycleState` in the Functions service
- Class `com.oracle.bmc.functions.model.FunctionSummary$LifecycleState` has been removed from the Functions service

## 3.8.0 - 2023-03-14
### Added
- Support for the Identity Domains service
- Support for long-term backups for autonomous databases on Exadata Cloud at Customer in the Database service
- Support for database OS patching in the Database service
- Support for managing enhanced clusters, cluster add-ons, and serverless virtual node pools in the Container Engine for Kubernetes service
- Support for templates and copy object requests in the Data Integration service
- Support for maintenance features in the GoldenGate service
- Support for AMD_MILAN_BM_GPU configuration type on instances in the Compute service
- Support for host storage metrics and network metrics as part of host capacity planning in the Operations Insights service
 
### Breaking Changes
- Field `GoldengateDeploymentPatch` has been removed from the model `com.oracle.bmc.goldengate.model.OperationType` in the GoldenGate service

## 3.7.0 - 2023-03-07
### Added
- Support for creating and updating autonomous database long-term backup schedules in the Database service
- Support for creating, updating, and deleting autonomous database long-term backups in the Database service
- Support for model deployment resources to use customized container images containing runtime dependencies of ML models and custom web servers to handle inference requests in the Data Science service
- Support for using the compartmentIdInSubtree parameter when summarizing management agent counts in the Management Agent Cloud service
- Support for getting agent property details in the Management Agent Cloud service
- Support for filtering by gateway ID when listing agents in the Management Agent Cloud service
- Support for the Hebrew and Greek languages during AI language text translation in the AI Language service
- Support for auto-detection when analyzing text with pre-trained models in the AI Language service
- Support for specifying update operation constraints when updating an instance in the Compute Service
- Support for disaster recovery in the Content Management service
- Support for advanced autonomous databases insights in the Operations Insights service
 
### Breaking Changes
- Support for retries by default on operations of the Analytics Cloud service
- Enum value `ACTIVE` has been removed from the model `com.oracle.bmc.oce.model.LifecycleDetails` in the Content Management service

## 3.6.0 - 2023-02-28
### Added
- Support for calling Oracle Cloud Infrastructure services in the eu-dcc-rating-1, eu-dcc-rating-2, eu-dcc-dublin-1, eu-dcc-dublin-2, and eu-dcc-milan-2 regions
- Support for on-demand bootstrap script execution in the Big Data Service
   
### Fixed
- The log names for synchronous clients now use the correct class names (e.g. ComputeClient uses ComputeClient, not ComputeAsyncClient)
 
### Breaking Changes
- The dependency on FindBugs (`com.google.code.findbugs:jsr305`) has been removed:
  - `javax.annotation.Nonnull` has been replaced by `jakarta.annotation.Nonnull`
  - `javax.annotation.Nullable` has been replaced by `jakarta.annotation.Nullable`
  - `javax.annotation.Generated` has been replaced by `jakarta.annotation.Generated`
  - `javax.annotation.concurrent.Immutable`, `javax.annotation.concurrent.NotThreadSafe`, and `javax.annotation.concurrent.ThreadSafe` have been replaced by comments

## 3.5.0 - 2023-02-21
### Added
- Support for async jobs in the AI Anomaly Detection service
- Support for specifying algorithm hints and windows sizes during model training in the AI Anomaly Detection service
- Support for specifying a sensitivity value during model detection in the AI Anomaly Detection service
- Support for discovery and monitoring of external Oracle database infrastructure components in the Database Management service  
 
### Breaking Changes
- The data type of `systemTags` field has been changed from a Map of String to another map to a Map of String to Object for the models `com.oracle.bmc.aianomalydetection.model.AiPrivateEndpoint`, `com.oracle.bmc.aianomalydetection.model.AiPrivateEndpointSummary`, `com.oracle.bmc.aianomalydetection.model.DataAsset`, `com.oracle.bmc.aianomalydetection.model.DataAssetSummary`, `com.oracle.bmc.aianomalydetection.model.Model`, `com.oracle.bmc.aianomalydetection.model.ModelSummary`, `com.oracle.bmc.aianomalydetection.model.Project` and `com.oracle.bmc.aianomalydetection.model.ProjectSummary` in the AI Anomaly Detection service
- Support for retries by default on operations of the AI Anomaly Detection service

## 3.4.0 - 2023-02-14
### Added
- Support for the Visual Builder Studio service
- Support for the Autonomous Recovery service
- Support for selecting specific database servers when creating autonomous VM clusters in the Database service
- Support for creating autonomous VMs during the creation of autonomous VM clusters in the Database service

### Breaking Changes
- Support for retries by default on operations of the Compute service

## 3.3.0 - 2023-02-07
### Added
- Support for changing Data Guard role of a database instance within the Database service
- Support for listing autonomous container database versions in the Database service
- Support for specifying a database version when creating or updating an autonomous container database in the Database service
- Support for specifying an eCPU count when creating or updating autonomous shared databases in the Database service
- Support for Helm attestation and Helm arguments on deploy operations in the DevOps service
- Support for uploading master key wallets for deployments in the GoldenGate service
- Support for custom configurations in the Operations Insights service  
 
### Breaking Changes
- Field `cpuCoreCount` has been made optional in the models `com.oracle.bmc.database.model.AutonomousDatabaseSummary` and `com.oracle.bmc.database.model.AutonomousDatabase` in the Database service

## 3.2.3 - 2023-01-31
### Added
- Support for ECPU billing for autonomous databases and dedicated autonomous databases on Exadata Cloud at Customer in the Database service
- Support for providing a vault secret ID when creating or updating autonomous shared databases in the Database service
- Support for including ORDS and database transform URLs as autonomous database connections in the Database service
- Support for role-based access control on OpenSearch clusters in the Search service
- Support for managed shell stages on deployments in the DevOps service
- Support for memory encryption on confidential VMs in the Compute service
- Support for configuration items, and reporting ownership of configuration items, in the Application Performance Monitoring service

## 3.2.2 - 2023-01-24
### Added
- Support for the Cloud Migrations service
- Support for setting up custom private IPs while creating private endpoints in the Database service
- Support for machine learning pipelines in the Data Science service
- Support for personally identifiable information detection in the AI Language service

## 3.2.1 - 2023-01-17
### Added
- Support for calling Oracle Cloud Infrastructure services in the us-chicago-1 region
- Support for cross-region replication in the File Storage service
- Support for setting up private DNS on ExaCS systems during provisioning in the Database service
- Support for elastic storage expansion on infrastructure resources for Exadata Cloud at Customer in the Database service
- Support for target versions during infrastructure patching on Cloud Exadata infrastructure in the Database service
- Support for creating model version sets in the model catalog in the Data Science service
- Support for associating a model with a model version set in the Data Science service
- Support for custom key/value annotations on documents using the Document Understanding service's optical character recognition in the Data Labeling service
- Support for configurable timeouts in the Service Mesh service

## 3.2.0 - 2022-12-13
### Fixed
- Fixed regression in Instance Principals authentication in version 3.1.0 (see [#468](https://github.com/oracle/oci-java-sdk/issues/468))
### Added
- Support for the Queue service
- Support for Intel X9 shapes when launching VM database systems in the Database service
- Support for enabling, disabling, and editing Database Management service connections on pluggable databases in the Database service
- Support for availability configurations and maintenance window schedules on synthetic monitors in the Application Performance Monitoring service
- Support for scheduling cascading deletes on a project in the DevOps service
- Support for cancelling a scheduled cascading delete on a project in the DevOps service
- Support for issue and action fields on job phases of validation and migration processes in the Database Migration service
- Support for cluster profiles in the Big Data service
- Support for egress-only services in the Service Mesh service
- Support for optional listeners and service discovery metadata on virtual deployments in the Service Mesh service
- Support for canceling work requests in the accepted state in the Service Mesh service
- Support for filtering work requests on associated resource id and operation status in the Service Mesh service
- Support for sorting while listing work requests, listing work request logs, and listing work request errors in the Service Mesh service
- Support for Oracle Managed Access integration in the Fusion Apps as a Service service
- Support for refresh scheduling in the Fusion Apps as a Service service
- Support for additional connections types on database resources in the GoldenGate service

### Breaking Changes
- Support for retries by default on operations of the Fusion Apps as a Service service
- Support for retries by default on operations of the Database Migration service
- Support for retries by default on operations of the Service Mesh service
- Model `com.oracle.bmc.databasemigration.model.CreateAgentDetails` has been removed in the Database Migration service
- Model `com.oracle.bmc.databasemigration.model.GenerateToken` has been removed in the Database Migration service
- Model `com.oracle.bmc.databasemigration.model.ParLink` has been removed in the Database Migration service
- Return type of method `public com.oracle.bmc.servicemesh.model.CreateIngressGatewayMutualTransportLayerSecurityDetails getMtls()` has been changed to `com.oracle.bmc.servicemesh.model.IngressGatewayMutualTransportLayerSecurityDetails` in `com.oracle.bmc.servicemesh.model.CreateIngressGatewayDetails` in the Service Mesh service
- Model `com.oracle.bmc.servicemesh.model.CreateIngressGatewayMutualTransportLayerSecurityDetails` has been removed in the Service Mesh service
- Model `com.oracle.bmc.servicemesh.model.CreateMutualTransportLayerSecurityDetails` has been removed in in the Service Mesh service
- Return type of method `public com.oracle.bmc.servicemesh.model.CreateMutualTransportLayerSecurityDetails getMtls()` has been changed to `com.oracle.bmc.servicemesh.model.VirtualServiceMutualTransportLayerSecurityDetails` in `com.oracle.bmc.servicemesh.model.CreateVirtualServiceDetails` in the Service Mesh service
- Return type of method `public com.oracle.bmc.servicemesh.model.CreateIngressGatewayMutualTransportLayerSecurityDetails getMtls()` has been changed to `com.oracle.bmc.servicemesh.model.IngressGatewayMutualTransportLayerSecurityDetails` in `com.oracle.bmc.servicemesh.model.UpdateIngressGatewayDetails` in the Service Mesh service
- Return type of method `public com.oracle.bmc.servicemesh.model.CreateMutualTransportLayerSecurityDetails getMtls()` has been changed to `com.oracle.bmc.servicemesh.model.VirtualServiceMutualTransportLayerSecurityDetails` in `com.oracle.bmc.servicemesh.model.UpdateVirtualServiceDetails` in the Service Mesh service
- Return type of method `public java.lang.String getLifecycleState()` has been changed to `com.oracle.bmc.servicemesh.model.AccessPolicy$LifecycleState` in  `com.oracle.bmc.servicemesh.requests.ListAccessPoliciesRequest` in the Service Mesh service
- Return type of method `public java.lang.String getLifecycleState()` has been changed to `com.oracle.bmc.servicemesh.model.IngressGatewayRouteTable$LifecycleState` in  `com.oracle.bmc.servicemesh.requests.ListIngressGatewayRouteTablesRequest` in the Service Mesh service
- Return type of method `public java.lang.String getLifecycleState()` has been changed to `com.oracle.bmc.servicemesh.model.IngressGateway$LifecycleState` in `com.oracle.bmc.servicemesh.requests.ListIngressGatewaysRequest` in the Service Mesh service
- Return type of method `public java.lang.String getLifecycleState()` has been changed to `com.oracle.bmc.servicemesh.model.Mesh$LifecycleState` in  `com.oracle.bmc.servicemesh.requests.ListMeshesRequest` in the Service Mesh service
- Return type of method `public java.lang.String getLifecycleState()` has been changed to `com.oracle.bmc.servicemesh.model.VirtualDeployment$LifecycleState` in `com.oracle.bmc.servicemesh.requests.ListVirtualDeploymentsRequest` in the Service Mesh service
- Return type of method `public java.lang.String getLifecycleState()` has been changed to `com.oracle.bmc.servicemesh.model.VirtualServiceRouteTable$LifecycleState` in `com.oracle.bmc.servicemesh.requests.ListVirtualServiceRouteTablesRequest` in the Service Mesh service
- Return type of method `public java.lang.String getLifecycleState()` has been changed to `com.oracle.bmc.servicemesh.model.VirtualService$LifecycleState` in  `com.oracle.bmc.servicemesh.requests.ListVirtualServicesRequest` in the Service Mesh service

## 3.1.0 - 2022-12-06
### Added
- Support for the Container Instances service
- Support for the Document Understanding service
- Support for creating stacks from OCI DevOps service and Bitbucket Cloud/Server as source control management in the Resource Manager service
- Support for deployment stage level parameters in the DevOps service
- Support for PeopleSoft discovery in the Stack Monitoring service
- Support for Apache Tomcat discovery in the Stack Monitoring service
- Support for SQL Server discovery in the Stack Monitoring service
- Support for OpenId Connect in the API Gateway service
- Support for returning compartment ids when listing backups in the MySQL Database service
- Support for adding a load balancer endpoint to a DB system in the MySQL Database service
- Support for managed read replicas in the MySQL Database service
- Support for setting replication filters on channels in the MySQL Database service
- Support for replicating from a source configured without global transaction identifiers into a channel in the MySQL Database service
- Support for time zone and language preferences in the Announcements service
- Support for adding report schedules for activity auditing and alerts reports in the Data Safe service
- Support for bulk operations on alerts in the Data Safe service
- Support for Java server usage reporting in the Java Management service
- Support for Java library usage reporting in the Java Management service
- Support for cryptographic roadmap impact analysis in the Java Management service
- Support for Java Flight Recorder recordings in the Java Management service
- Support for post-installation steps in the Java Management service
- Support for restricting management of advanced functionality in the Java Management service
- Support for plugin improvements in the Java Management service
- Support for collecting diagnostics on deployments in the GoldenGate service
- Support for onboarding Exadata Public Cloud (ExaCS) targets to the Operations Insights service

### Breaking Changes
- A required property `CompartmentId` was added to the model `com.oracle.bmc.datasafe.model.PatchAlertsDetails` in the Data Safe service

## 3.0.1 - 2022-11-15
### Added
- Support for mTLS authentication with listeners during Autonomous VM Cluster creation on Exadata Cloud at Customer in the Database service
- Support for providing custom values for TLS and non-TLS ports during Autonomous VM Cluster creation on Exadata Cloud at Customer in the Database service
- Support for creating multiple Autonomous VM Clusters in the same Exadata infrastructure in the Database service
- Support for listing resources associated with a job in the Resource Manager service
- Support for listing resources associated with a stack in the Resource Manager service
- Support for listing outputs associated with a job in the Resource Manager service
- Support for the Oracle distribution of Apache Hadoop 2.0 in the Big Data service

## 3.0.0 - 2022-11-08
### Added
- Support for listing local and cross-region refreshable clones in the Database service
- Support for adding multiple cloud VM clusters in the Database service
- Support for creating rollback jobs in the Resource Manager service
- Support for edge nodes in the Big Data service
- Support for Single Client Access Name (SCAN) in the Data Flow service
- Support for additional filters when listing application dependencies in the Application Dependency Management service
- Support for additional properties when reading Vulnerability Audit resources in the Application Dependency Management service
- Support for optionally passing compartment IDs when creating Vulnerability Audit resources in the Application Dependency Management service

### Breaking Changes
- Includes the breaking changes from [3.0.0-beta2](https://github.com/oracle/oci-java-sdk/blob/master/CHANGELOG.md#300-beta2---2022-11-01)
- Includes the breaking changes from [3.0.0-beta1](https://github.com/oracle/oci-java-sdk/blob/master/CHANGELOG.md#300-beta1---2022-10-25)
- Field `certificateId` has been made mandatory in `com.oracle.bmc.resourcemanager.model.PrivateServerConfigDetails`

## 3.0.0-beta2 - 2022-11-01
### Added
- Support for cloning from a backup from the last available timestamp in the Database service
- Support for third-party scanning using Qualys in the Vulnerability Scanning service
- Support for customer-provided encryption keys in the Logging Analytics service
- Support for connections for database resources in the GoldenGate service

### Breaking Changes
- Class `com.oracle.bmc.vulnerabilityscanning.model.HostScanAgentConfiguration$Vendor` has been removed in the Vulnerability Scanning service

## 3.0.0-beta1 - 2022-10-25
### Breaking Changes
- HTTP client library is pluggable, choices offered are Jakarta EE 8/Jersey 2, or Jakarta EE 9/Jersey 3
  - The OCI Java SDK does not choose an HTTP client library for you, and there is no default. You have to explicitly choose one, by declaring a dependency on `oci-java-sdk-common-httpclient-jersey` or `oci-java-sdk-common-httpclient-jersey3`
  - Example:

        <dependency>
          <!-- Since this is the "application" pom.xml, we do want to
               choose the httpclient to use. -->
          <groupId>com.oracle.oci.sdk</groupId>
          <artifactId>oci-java-sdk-common-httpclient-jersey</artifactId>
        </dependency>

  - For full examples, see the [bmc-other-examples/bmc-jersey-examples/pom.xml](https://github.com/oracle/oci-java-sdk/tree/master/bmc-other-examples/bmc-jersey-examples/pom.xml) and [bmc-other-examples/bmc-jersey3-examples/pom.xml](https://github.com/oracle/oci-java-sdk/tree/master/bmc-other-examples/bmc-jersey3-examples/pom.xml)
- Invocation callbacks: Instead of using `com.oracle.bmc.util.internal.Consumer<Invocation.Builder>` to register invocation callbacks, use `com.oracle.bmc.http.client.RequestInterceptor` instead, to decouple the implementation from the choice of the HTTP client.
  - Examples of affected code:
    - `com.oracle.bmc.requests.BmcRequest` and any subclass: `setInvocationCallback`/`getInvocationCallback` methods
    - `com.oracle.bmc.objectstorage.transfer.MultipartObjectAssembler$MultipartObjectAssemblerBuilder`: `invocationCallback` method
- Client Configuration has been simplified
  - `com.oracle.bmc.http.ClientConfigurator` has a single `customizeClient(HttpClientBuilder builder)` method, instead of `customizeBuilder`, `customizeClient`, and `customizeRequest` methods. Example:

        IdentityClient.builder()
                      .clientConfigurator(
                              builder -> {
                          builder.property(
                                  StandardClientProperties.BUFFER_REQUEST, false);
                      })
                      // ...
                      .build(authenticationDetailsProvider);

    - Instead of `customizeBuilder` or `customizeClient`, use methods in `HttpClientBuilder`, e.g. the `property` method or the `registerRequestInterceptor` method.
    - Instead of `customizeRequest`, use the `registerRequestInterceptor` method in `HttpClientBuilder` and pass an `com.oracle.bmc.http.client.RequestInterceptor`. The priority controls when the interceptor is executed: lower numbers mean earlier. The request is signed with priority `1000` (`com.oracle.bmc.http.Priorities.AUTHENTICATION`).
    - Specific examples:
      - Setting whether to buffer a request:

            builder.property(
                    StandardClientProperties.BUFFER_REQUEST, shouldBuffer);

      - Setting an Apache connection manager:

            builder.property(
                    ApacheClientProperties.CONNECTION_MANAGER,
                    connectionManager);

      - Setting a trust store:

            // Server CA goes into the trust store
            KeyStore trustStore =
                    keystoreGenerator.createTrustStoreWithServerCa(tlsConfig.getCaBundle());
            builder.property(StandardClientProperties.TRUST_STORE, trustStore);

      - Setting a key store:

            builder.property(
                    StandardClientProperties.KEY_STORE,
                    new KeyStoreWithPassword(keyStore, keystorePassword));

      - Setting the SSL context:

            builder.property(
                    StandardClientProperties.SSL_CONTEXT, sslContext);

      - Setting a proxy:

            builder.property(
                    StandardClientProperties.PROXY, proxyConfig);

      - Setting a hostname verifier:

            builder.property(
                    StandardClientProperties.HOSTNAME_VERIFIER,
                    NoopHostnameVerifier.INSTANCE);
  - More examples:
    - [ApacheConnectorPropertiesExample.java](https://github.com/oracle/oci-java-sdk/blob/v3.0.0/bmc-examples/src/main/java/ApacheConnectorPropertiesExample.java)
    - [HttpProxyExample.java](https://github.com/oracle/oci-java-sdk/blob/v3.0.0/bmc-examples/src/main/java/HttpProxyExample.java)
    - [DisableNoConnectionReuseStrategyUsingApacheConfiguratorExample.java](https://github.com/oracle/oci-java-sdk/blob/v3.0.0/bmc-other-examples/bmc-jersey-examples/src/main/java/DisableNoConnectionReuseStrategyUsingApacheConfiguratorExample.java) and [DisableNoConnectionReuseStrategyUsingApacheConfiguratorExample.java](https://github.com/oracle/oci-java-sdk/blob/v3.0.0/bmc-other-examples/bmc-jersey3-examples/src/main/java/DisableNoConnectionReuseStrategyUsingApacheConfiguratorExample.java) (Jersey 3)
  - For a comprehensive list of pre-defined settable properties, see
    - [StandardClientProperties.java](https://github.com/oracle/oci-java-sdk/blob/v3.0.0/bmc-common-httpclient/src/main/java/com/oracle/bmc/http/client/StandardClientProperties.java)
    - [ApacheClientProperties.java](https://github.com/oracle/oci-java-sdk/blob/d4b2f51c9c69bf64deb124ca921deeac333c3d03/bmc-common-httpclient-choices/bmc-common-httpclient-jersey/src/main/java/com/oracle/bmc/http/client/jersey/ApacheClientProperties.java) or [ApacheClientProperties.java](https://github.com/oracle/oci-java-sdk/blob/d4b2f51c9c69bf64deb124ca921deeac333c3d03/bmc-common-httpclient-choices/bmc-common-httpclient-jersey3/src/main/java/com/oracle/bmc/http/client/jersey3/ApacheClientProperties.java) (Jersey 3)
    - You can also define your own properties.
    - The actual properties that can be set depends on the HTTP client you are using.
- Apache: There were numerous changes to decouple the implementation from the choice of the HTTP client.
  - `com.oracle.bmc.http.ApacheConfigurator`, has been replaced by `com.oracle.bmc.http.client.jersey.ApacheClientProperties` or `com.oracle.bmc.http.client.jersey3.ApacheClientProperties` (for Jersey 3).
    - For clients that should not buffer requests into memory:

          ObjectStorageClient nonBufferingObjectStorageClient = ObjectStorageClient
              .builder()
              .clientConfigurator(builder -> {
                  builder.property(StandardClientProperties.BUFFER_REQUEST, false);
                  builder.property(ApacheClientProperties.RETRY_HANDLER, null);
                  builder.property(ApacheClientProperties.REUSE_STRATEGY, null);
              })
              .region(Region.US_PHOENIX_1)
              .build(provider);

    - For clients that should buffer requests into memory:

          IdentityClient bufferingIdentityClient = IdentityClient
              .builder()
              .clientConfigurator(builder -> {
                  builder.property(StandardClientProperties.BUFFER_REQUEST, true);
                  builder.property(ApacheClientProperties.RETRY_HANDLER, null);
                  builder.property(ApacheClientProperties.REUSE_STRATEGY, null);
              })
              .region(Region.US_PHOENIX_1)
              .build(provider);

      - See [DisableNoConnectionReuseStrategyUsingApacheConfiguratorExample.java](https://github.com/oracle/oci-java-sdk/blob/v3.0.0/bmc-other-examples/bmc-jersey-examples/src/main/java/DisableNoConnectionReuseStrategyUsingApacheConfiguratorExample.java) and [DisableNoConnectionReuseStrategyUsingApacheConfiguratorExample.java](https://github.com/oracle/oci-java-sdk/blob/v3.0.0/bmc-other-examples/bmc-jersey3-examples/src/main/java/DisableNoConnectionReuseStrategyUsingApacheConfiguratorExample.java) (Jersey 3)

      - Also consider using `com.oracle.bmc.http.client.jersey.apacheconfigurator.ApacheConfigurator from the `oci-java-sdk-addons-apache-configurator-jersey` add-on module; or `com.oracle.bmc.http.client.jersey3.apacheconfigurator.ApacheConfigurator` from the `oci-java-sdk-addons-apache-configurator-jersey3` add-on module.
        - See [DisableNoConnectionReuseStrategyUsingApacheConfiguratorExample.java](https://github.com/oracle/oci-java-sdk/blob/v3.0.0/bmc-other-examples/bmc-jersey-examples/src/main/java/DisableNoConnectionReuseStrategyUsingApacheConfiguratorExample.java) and [DisableNoConnectionReuseStrategyUsingApacheConfiguratorExample.java](https://github.com/oracle/oci-java-sdk/blob/v3.0.0/bmc-other-examples/bmc-jersey3-examples/src/main/java/DisableNoConnectionReuseStrategyUsingApacheConfiguratorExample.java) (Jersey 3)
  - `com.oracle.bmc.http.ApacheConnectionPoolConfig` has been replaced by `com.oracle.bmc.http.client.jersey.apacheconfigurator.ApacheConnectionPoolConfig` from the `oci-java-sdk-addons-apache-configurator-jersey` add-on module; or `com.oracle.bmc.http.client.jersey3.apacheconfigurator.ApacheConnectionPoolConfig` from the `oci-java-sdk-addons-apache-configurator-jersey3` add-on module.
  - `com.oracle.bmc.http.ApacheConnectorProperties` has been replaced by `com.oracle.bmc.http.client.jersey.apacheconfigurator.ApacheConnectorProperties` from the `oci-java-sdk-addons-apache-configurator-jersey` add-on module; or `com.oracle.bmc.http.client.jersey3.apacheconfigurator.ApacheConnectorProperties` from the `oci-java-sdk-addons-apache-configurator-jersey3` add-on module.
  - `com.oracle.bmc.http.ApacheProxyConfig` and `com.oracle.bmc.http.ApacheProxyConfigDecorator` have been replaced by `com.oracle.bmc.http.client.ProxyConfiguration`
    - See [HttpProxyExample.java](https://github.com/oracle/oci-java-sdk/blob/v3.0.0/bmc-examples/src/main/java/HttpProxyExample.java)- `com.oracle.bmc.http.signing.RequestSigningFilter` does not implement `javax.ws.rs.client.ClientRequestFilter` anymore; instead, it has been implemented as a `com.oracle.bmc.http.client.RequestInterceptor` to decouple the implementation from the choice of the HTTP client.
- Instead of `com.oracle.bmc.http.JerseyLoggingClientConfigurator`, use `builder.property(JerseyClientProperty.create(LOGGING_FEATURE_VERBOSITY_CLIENT), verbosity)` and `builder.property(JerseyClientProperty.create(LOGGING_FEATURE_LOGGER_LEVEL_CLIENT), loggingLevel)`
- In `com.oracle.bmc.responses.BmcResponse`, the collection used for headers was changed from `javax.ws.rs.core.MultivaluedMap` to `Map<String, List<String>>`, to decouple the implementation from the choice of the HTTP client.
- Circuit breakers
  - The circuit breaker interface has been renamed from `com.oracle.bmc.circuitbreaker.JaxRsCircuitBreaker` to `com.oracle.bmc.circuitbreaker.OciCircuitBreaker`
    - Examples of affectede code:
      - `com.oracle.bmc.circuitbreaker.CircuitBreakerFactory`: Return type of method `public com.oracle.bmc.circuitbreaker.JaxRsCircuitBreaker build(com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration)` has been changed to `com.oracle.bmc.circuitbreaker.OciCircuitBreaker`
  - Instead of using the constructor of `com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration`, use the builder. The constructor is not public anymore.
  - Some constants in `com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration` have been removed, if you need them, replace them with the actual values:
    - `INTERNAL_SERVER_ERROR_EXCEPTION_CLASS`: `javax.ws.rs.InternalServerErrorException.class`
    - `PROCESSING_EXCEPTION_CLASS`: `javax.ws.rs.ServiceUnavailableException.class`
    - `SERVICE_UNAVAILABLE_EXCEPTION_CLASS`: `javax.ws.rs.ProcessingException.class`
  - The `com.oracle.bmc.util.CircuitBreakerUtils` class does not deal with actual circuit breakers anymore, just with `com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration`. As such, the `DEFAULT_CIRCUIT_BREAKER` field and the `getUserDefinedCircuitBreaker` method were removed. Construct a new circuit breaker from the default configuration if necessary using the build methods in `com.oracle.bmc.circuitbreaker.CircuitBreakerFactory`.
  - The `getDefaultCircuitBreakerConfig` method in the `com.oracle.bmc.util.CircuitBreakerUtils` class has been renamed to `getDefaultCircuitBreakerConfiguration`.
- Guava has been removed, which lead to some breaking changes where Guava types have been replaced with JDK types:
  - `com.google.common.base.Optional` has been replaced with `java.util.Optional`
  - `com.google.common.base.Function` has been replaced with `java.util.function.Function`
  - `com.google.common.base.Predicate` has been replaced with `java.util.function.Predicate`
  - `com.google.common.base.Supplier` has been replaced with `java.util.function.Supplier`
- Moved classes
  - Class `com.oracle.bmc.Options` was moved to `com.oracle.bmc.http.client.Options`
  - Class `com.oracle.bmc.http.Serialization` was moved to `com.oracle.bmc.http.client.Serialization`
  - Class `com.oracle.bmc.io.DuplicatableInputStream` was moved to `com.oracle.bmc.http.client.io.DuplicatableInputStream`
- Long deprecated code was removed:
  - The signing strategy `OBJECT_STORAGE` was removed from `com.oracle.bmc.http.signing.SigningStrategy`; it had been deprecated for years and had been replaced by `EXCLUDE_BODY`.
  - The `getPublicKey()` and `getPrivateKey()` methods were removed from `com.oracle.bmc.auth.SessionKeySupplier` and implementing classes; they had been deprecated for years and had been replaced by the `getKeyPair()` method.
- Removed code
  - The `setInstanceMetadataServiceClientConfig` method in `com.oracle.bmc.Region` was removed; it never had any effect.
  - `AbstractFederationClientAuthenticationDetailsProviderBuilder.simpleRetry` method has been removed without replacement, since it is not needed in the OCI Java SDK 3.0.0 and higher.
    - You can copy and paste the [previous implementation](https://github.com/oracle/oci-java-sdk/blob/v2.47.0/bmc-common/src/main/java/com/oracle/bmc/auth/AbstractFederationClientAuthenticationDetailsProviderBuilder.java#L494-L528) if you need it.

- Class `com.oracle.bmc.ailanguage.model.EntityDocument` has been removed in the AI Language service

- Class `com.oracle.bmc.ailanguage.model.KeyPhraseDocument` has been removed in the AI Language service

- Class `com.oracle.bmc.ailanguage.model.SentimentsDocument` has been removed in the AI Language service

- Class `com.oracle.bmc.ailanguage.model.TextClassificationDocument` has been removed in the AI Language service

- Class `com.oracle.bmc.ailanguage.model.EntityDocument` has been removed in the AI Language service
- Class `com.oracle.bmc.ailanguage.model.KeyPhraseDocument` has been removed in the AI Language service
- Class `com.oracle.bmc.ailanguage.model.SentimentsDocument` has been removed in the AI Language service
- Class `com.oracle.bmc.ailanguage.model.TextClassificationDocument` has been removed in the AI Language service

### Added
- Support for the Disaster Recovery service
- Support for running code interactively with session applications using statements in the Data Flow service
- Support for language custom models and language translation in the AI Language service

## 2.46.0 - 2022-10-04
### Added
- Support for calling Oracle Cloud Infrastructure services in the eu-dcc-milan-1 region
- Support for target host identification and SOCKS support on dynamic port forwarding sessions in the Bastion service
- Support for viewing top processes running at a particular point of time in the Operations Insights service
- Support for filtering top processes by a single process to view that process's trend over time in the Operations Insights service
- Support for creating Enterprise Manager-based Windows host targets in the Operations Insights service
- Support for creating Management Agent Cloud-based Windows and Solaris host targets in the Operations Insights service

### Breaking Changes
- Method `public java.lang.Integer getTargetResourcePort()` has been removed from the model `com.oracle.bmc.bastion.model.CreateSessionTargetResourceDetails` in the Bastion Service
-  Method `public java.lang.Integer getTargetResourcePort()` has been removed from the model `com.oracle.bmc.bastion.model.TargetResourceDetails` in the Bastion Service

## 2.45.0 - 2022-09-27
### Added
- Support for search capabilities for monitored resources in the Stack Monitoring service
- Support for deleting monitored resources with their members in the Stack Monitoring service
- Support for creating host-type monitored resources in the Stack Monitoring service
- Support for associating external resources during creation of monitored resources in the Stack Monitoring service
- Support for uploading bulk data in the NoSQL Database Cloud service
- Support for examining query execution plans in the NoSQL Database Cloud service
- Support for starting and stopping clusters in the Big Data service
- Support for additional compute shapes in the Big Data service
- Support for backwards pagination in the Search service
- Support for elastic compute for Exadata Cloud at Customer in the Database service

### Breaking Changes
- Support for default retries on operations of the NoSQL Database Cloud service

## 2.44.0 - 2022-09-20
### Added
- Support for the Cloud Bridge service
- Support for the Cloud Migrations service
- Support for display banners, trails, and sizes in the GoldenGate service
- Support for generic REST data assets, flattening of data in Data Flow, and runtime information on pipelines in the Data Integration service
- Support for expanded search functionality in the Threat Intelligence service
- Support for ingest-time rules and specifying logsets and query strings during recalls in the Logging Analytics service
- Support for repository mirroring from Visual Builder Studio in the DevOps service
- Support for running a managed build stage with the source code hosted in a Visual Builder Studio repository in the DevOps service
- Support for triggering a build run based on an event in a Visual Builder Studio repository in the DevOps service
- Support for additional parameters during cost management scheduling in the Usage service

### Breaking Changes
- Support for retries by default on operations of the GoldenGate service
- Support for retries by default on operations of the Threat Intelligence service

## 2.43.0 - 2022-09-13
### Added
- Support for calling Oracle Cloud Infrastructure services in the eu-madrid-1 region
- Support for exporting and importing larger model artifacts in the model catalog in the Data Science service
- Support for Request Based Authorization in the API Gateway service
- Support for Dynamic Authentication in the API Gateway service
- Support for Dynamic Routing Backend in the API Gateway service

### Breaking Changes
- Support for retries by default on some operations of the Data Science service

## 2.42.0 - 2022-09-06
### Added
- Support for generic REST, OCI Streaming service, and Lake House connectors in the Data Connectivity Management service
- Support for connecting to the Data Catalog service in the Data Connectivity Management service
- Support for Kerberos and SSL for HDFS operations in the Data Connectivity Management service
- Support for excel-formatted data and default columns in the Data Connectivity Management service
- Support for reporting connector usage in the Data Connectivity Management service
- Support for preferred credentials for performing privileged operations in the Database Management service
- Support for passing a content encoding when posting metrics in the Monitoring service

### Breaking Changes
- Support for retries by default on some operations of the Data Connectivity Management service
- Method `public com.oracle.bmc.dataconnectivity.responses.DeleteConnectionValidationResponse deleteConnectionValidation(com.oracle.bmc.dataconnectivity.requests.DeleteConnectionValidationRequest)` has been removed from `com.oracle.bmc.dataconnectivity.DataConnectivityManagement` in the Data Connectivity Management service
- Method `public com.oracle.bmc.dataconnectivity.responses.GetConnectionValidationResponse getConnectionValidation(com.oracle.bmc.dataconnectivity.requests.GetConnectionValidationRequest)` has been removed from `com.oracle.bmc.dataconnectivity.DataConnectivityManagement` in the Data Connectivity Management service
- Method `public com.oracle.bmc.dataconnectivity.responses.ListConnectionValidationsResponse listConnectionValidations(com.oracle.bmc.dataconnectivity.requests.ListConnectionValidationsRequest)` has been removed from `com.oracle.bmc.dataconnectivity.DataConnectivityManagement` in the Data Connectivity Management service
- Method `public java.lang.Iterable listConnectionValidationsRecordIterator(com.oracle.bmc.dataconnectivity.requests.ListConnectionValidationsRequest)` has been removed from `com.oracle.bmc.dataconnectivity.DataConnectivityManagementPaginators` in the Data Connectivity Management service
- Method `public java.lang.Iterable listConnectionValidationsResponseIterator(com.oracle.bmc.dataconnectivity.requests.ListConnectionValidationsRequest)` has been removed from `com.oracle.bmc.dataconnectivity.DataConnectivityManagementPaginators` in the Data Connectivity Management service
- Class `com.oracle.bmc.dataconnectivity.model.ConnectionValidationSummaryCollection` has been removed in the Data Connectivity Management service
- Class `com.oracle.bmc.dataconnectivity.requests.DeleteConnectionValidationRequest` has been removed in the Data Connectivity Management service
- Class `com.oracle.bmc.dataconnectivity.requests.GetConnectionValidationRequest` has been removed in the Data Connectivity Management service
- Class `com.oracle.bmc.dataconnectivity.requests.ListConnectionValidationsRequest` has been removed in the Data Connectivity Management service
- Class `com.oracle.bmc.dataconnectivity.requests.ListConnectionValidationsRequest$SortBy` has been removed in the Data Connectivity Management service
- Class `com.oracle.bmc.dataconnectivity.requests.ListConnectionValidationsRequest$SortOrder` has been removed in the Data Connectivity Management service
- Method `public java.lang.String getResourceId()` has been removed from `com.oracle.bmc.dataconnectivity.requests.ListWorkRequestsRequest` in the Data Connectivity Management service
- Class `com.oracle.bmc.dataconnectivity.responses.DeleteConnectionValidationResponse` has been removed in the Data Connectivity Management service
- Class `com.oracle.bmc.dataconnectivity.responses.GetConnectionValidationResponse` has been removed in the Data Connectivity Management service
- Return type of method `public java.lang.Float getRetryAfter()` has been changed to `java.lang.Integer` in the response `com.oracle.bmc.dataconnectivity.responses.GetWorkRequestResponse` in the Data Connectivity Management service
- Class `com.oracle.bmc.dataconnectivity.responses.ListConnectionValidationsResponse` has been removed in the Data Connectivity Management service

## 2.41.1 - 2022-08-30
### Added
- Support for opting out of guest VM event collection, health metrics, diagnostics logs, and traces in the Database service
- Support for in-place upgrades for software-defined data centers in the VMWare Solution service
- Support for single-client access name protocol as a data source for private access channels in the Analytics Cloud service
- Support for network security groups, egress control on public datasources, and GitHub access in the Analytics Cloud service
- Support for performance-based autotuning of block and boot volumes in the Block Storage service

## 2.41.0 - 2022-08-23
### Added
- Support for the Enterprise Manager Warehouse service
- Support for additional configuration variables in the MySQL Database service
- Support for file filters in the DevOps service
- Support for support rewards redemption summaries in the Usage service
- Support for the parent tenancy of an organization to view child tenancy categories, recommendations, and resource actions in the Optimizer service
- Support for choosing prior versions during infrastructure maintenance on Exadata Cloud at Customer in the Database service

### Breaking Changes
- Class `com.oracle.bmc.emwarehouse.EmDataLake` has been removed in the Enterprise Manager Warehouse service
- Class `com.oracle.bmc.emwarehouse.EmDataLakeClient$Builder` has been removed in the Enterprise Manager Warehouse service
- Class `com.oracle.bmc.emwarehouse.EmDataLakePaginators` has been removed in the Enterprise Manager Warehouse service
- Class `com.oracle.bmc.emwarehouse.EmDataLakeWaiters` has been removed in the Enterprise Manager Warehouse service
- Return type of method `public java.lang.Integer getCteMaxRecursionDepth()` has been changed to `java.lang.Long` in the model `com.oracle.bmc.mysql.model.ConfigurationVariables` in the MySQL Database service
- Return type of method `public java.lang.Integer getInnodbFtResultCacheLimit()` has been changed to `java.lang.Long` in the model `com.oracle.bmc.mysql.model.ConfigurationVariables` in the MySQL Database service
- Return type of method `public java.lang.Integer getInnodbMaxPurgeLag()` has been changed to `java.lang.Long` in the model `com.oracle.bmc.mysql.model.ConfigurationVariables` in the MySQL Database service
- Return type of method `public java.lang.Integer getMaxExecutionTime()` has been changed to `java.lang.Long` in the model `com.oracle.bmc.mysql.model.ConfigurationVariables` in the MySQL Database service
- Return type of method `public java.lang.Integer getParserMaxMemSize()` has been changed to `java.lang.Long` in the model `com.oracle.bmc.mysql.model.ConfigurationVariables` in the MySQL Database service
- Return type of method `public java.lang.Integer getQueryAllocBlockSize()` has been changed to `java.lang.Long` in the model `com.oracle.bmc.mysql.model.ConfigurationVariables` in the MySQL Database service
- Return type of method `public java.lang.Integer getQueryPreallocSize()` has been changed to `java.lang.Long` in the model `com.oracle.bmc.mysql.model.ConfigurationVariables` in the MySQL Database service

## 2.40.0 - 2022-08-16
### Added
- Support for Logging Analytics as a streaming source target in the Service Connector Hub service
- Support for data sources for logging query registration in the Cloud Guard service
- Support for custom detector rules on insight detector recipes in the Cloud Guard service
- Support for fetching data source events and problem entities in the Cloud Guard service
- Support for E3, E4, Standard3, and Optimized3 flexible compute shapes on notebooks, model deployment, and jobs in the Data Science service
- Support for streaming application logs to the Logging service in the Data Flow service

### Breaking Changes
- Support for retries by default on some operations of the Data Flow service

## 2.39.0 - 2022-08-09
### Added
- Support for single-host software-defined data centers in the VMWare Solution service
- Support for Java download and installation in the Java Management service
- Support for lifecycle management for Windows in the Java Management service
- Support for installation scripts in the Java Management service
- Support for unlimited-installation keys in the Java Management service
- Support for configuring automatic usage tracking in the Java Management service
- Support for STANDARDX and ENTERPRISEX instance types in Integration service
- Support for additional languages and multimedia formats in transcription jobs in the AI Speech service
- Support for maintenance run history for Exadata Cloud at Customer in the Database service
- Support for Optimizer statistics monitoring and management on various database administration operations in the Database Management service
- Support for OCI Compute instances in the Operations Insights service
- Support for moving resources in the Console Dashboard service
- Support for round-robin alerting in the Application Performance Monitoring service
- Support for aggregated network data of synthetic monitors in the Application Performance Monitoring service
- Support for etags on operations in the Load Balancing service

### Breaking Changes
- Return type of method `public com.oracle.bmc.opsi.model.UsageUnit getUsageUnit()` has been changed to `com.oracle.bmc.opsi.model.SummarizeDatabaseInsightResourceCapacityTrendAggregationCollection$UsageUnit` in `com.oracle.bmc.opsi.model.SummarizeDatabaseInsightResourceCapacityTrendAggregationCollection` in the Operations Insights service
- Return type of method `public com.oracle.bmc.opsi.model.UsageUnit getUsageUnit()` has been changed to `com.oracle.bmc.opsi.model.SummarizeDatabaseInsightResourceForecastTrendAggregation$UsageUnit` in `com.oracle.bmc.opsi.model.SummarizeDatabaseInsightResourceForecastTrendAggregation` in the Operations Insights service
- Return type of method `public com.oracle.bmc.opsi.model.UsageUnit getUsageUnit()` has been changed to `com.oracle.bmc.opsi.model.SummarizeDatabaseInsightResourceStatisticsAggregationCollection$UsageUnit` in `com.oracle.bmc.opsi.model.SummarizeDatabaseInsightResourceStatisticsAggregationCollection` in the Operations Insights service
- Return type of method `public com.oracle.bmc.opsi.model.UsageUnit getUsageUnit()` has been changed to `com.oracle.bmc.opsi.model.SummarizeDatabaseInsightResourceUsageAggregation$UsageUnit` in `com.oracle.bmc.opsi.model.SummarizeDatabaseInsightResourceUsageAggregation` in the Operations Insights service
- Return type of method `public com.oracle.bmc.opsi.model.UsageUnit getUsageUnit()` has been changed to `com.oracle.bmc.opsi.model.SummarizeDatabaseInsightResourceUsageTrendAggregationCollection$UsageUnit` in `com.oracle.bmc.opsi.model.SummarizeDatabaseInsightResourceUsageTrendAggregationCollection` in the Operations Insights service
- Return type of method `public com.oracle.bmc.opsi.model.UsageUnit getUsageUnit()` has been changed to `com.oracle.bmc.opsi.model.SummarizeDatabaseInsightTablespaceUsageTrendAggregationCollection$UsageUnit` in `com.oracle.bmc.opsi.model.SummarizeDatabaseInsightTablespaceUsageTrendAggregationCollection` in the Operations Insights service
- Return type of method `public com.oracle.bmc.opsi.model.UsageUnit getUsageUnit()` has been changed to `com.oracle.bmc.opsi.model.SummarizeExadataInsightResourceCapacityTrendAggregation$UsageUnit` in `com.oracle.bmc.opsi.model.SummarizeExadataInsightResourceCapacityTrendAggregation` in the Operations Insights service
- Return type of method `public com.oracle.bmc.opsi.model.UsageUnit getUsageUnit()` has been changed to `com.oracle.bmc.opsi.model.SummarizeExadataInsightResourceCapacityTrendCollection$UsageUnit` in `com.oracle.bmc.opsi.model.SummarizeExadataInsightResourceCapacityTrendCollection` in `com.oracle.bmc.opsi.model.SummarizeExadataInsightResourceForecastTrendAggregation` in the Operations Insights service
- Return type of method `public com.oracle.bmc.opsi.model.UsageUnit getUsageUnit()` has been changed to `com.oracle.bmc.opsi.model.SummarizeExadataInsightResourceForecastTrendAggregation$UsageUnit` in `com.oracle.bmc.opsi.model.SummarizeExadataInsightResourceForecastTrendAggregation` in the Operations Insights service
- Return type of method `public com.oracle.bmc.opsi.model.UsageUnit getUsageUnit()` has been changed to `com.oracle.bmc.opsi.model.SummarizeExadataInsightResourceForecastTrendCollection$UsageUnit` in `com.oracle.bmc.opsi.model.SummarizeExadataInsightResourceForecastTrendCollection` in the Operations Insights service
- Return type of method `public com.oracle.bmc.opsi.model.UsageUnit getUsageUnit()` has been changed to `com.oracle.bmc.opsi.model.SummarizeExadataInsightResourceStatisticsAggregationCollection$UsageUnit` in `com.oracle.bmc.opsi.model.SummarizeExadataInsightResourceStatisticsAggregationCollection` in the Operations Insights service
- Return type of method `public com.oracle.bmc.opsi.model.UsageUnit getUsageUnit()` has been changed to `com.oracle.bmc.opsi.model.SummarizeExadataInsightResourceUsageAggregation$UsageUnit` in `com.oracle.bmc.opsi.model.SummarizeExadataInsightResourceUsageAggregation` in the Operations Insights service
- Return type of method `public com.oracle.bmc.opsi.model.UsageUnit getUsageUnit()` has been changed to `com.oracle.bmc.opsi.model.SummarizeExadataInsightResourceUsageCollection$UsageUnit` in `com.oracle.bmc.opsi.model.SummarizeExadataInsightResourceUsageCollection` in the Operations Insights service
- Return type of method `public com.oracle.bmc.opsi.model.UsageUnit getUsageUnit()` has been changed to `com.oracle.bmc.opsi.model.SummarizeHostInsightResourceCapacityTrendAggregationCollection$UsageUnit` in `com.oracle.bmc.opsi.model.SummarizeHostInsightResourceCapacityTrendAggregationCollection` in the Operations Insights service
- Return type of method `public com.oracle.bmc.opsi.model.UsageUnit getUsageUnit()` has been changed to `com.oracle.bmc.opsi.model.SummarizeHostInsightResourceForecastTrendAggregation$UsageUnit` in `com.oracle.bmc.opsi.model.SummarizeHostInsightResourceForecastTrendAggregation` in the Operations Insights service
- Return type of method `public com.oracle.bmc.opsi.model.UsageUnit getUsageUnit()` has been changed to `com.oracle.bmc.opsi.model.SummarizeHostInsightResourceStatisticsAggregationCollection$UsageUnit` in `com.oracle.bmc.opsi.model.SummarizeHostInsightResourceStatisticsAggregationCollection` in the Operations Insights service
- Return type of method `public com.oracle.bmc.opsi.model.UsageUnit getUsageUnit()` has been changed to `com.oracle.bmc.opsi.model.SummarizeHostInsightResourceUsageAggregation$UsageUnit` in `com.oracle.bmc.opsi.model.SummarizeHostInsightResourceUsageAggregation` in the Operations Insights service
- Return type of method `public com.oracle.bmc.opsi.model.UsageUnit getUsageUnit()` has been changed to `com.oracle.bmc.opsi.model.SummarizeHostInsightResourceUsageTrendAggregationCollection$UsageUnit` in `com.oracle.bmc.opsi.model.SummarizeHostInsightResourceUsageTrendAggregationCollection` in the Operations Insights service
- Class `com.oracle.bmc.opsi.model.UsageUnit` has been removed in the Operations Insights service
- Class `com.oracle.bmc.opsi.requests.ListHostInsightsRequest$HostType` has been removed in the Operations Insights service

## 2.38.0 - 2022-08-02
### Added
- Support for OpenSearch in the Search service
- Support for child tables in the NoSQL Database Cloud service
- Support for private repositories in the DevOps service
- Support for session token authentication

### Breaking Changes
- Support for retries by default on operations of the Quotas service

## 2.37.0 - 2022-07-26
### Added
- Support for the Fusion Apps as a Service service
- Support for the Digital Media service
- Support for accessing all Terraform providers from Hashicorp Registry, as well as bringing your own providers, in the Resource Manager service
- Support for runtime configurations in notebook sessions in the Data Science service
- Support for compartmentIdInSubtree and accessLevel filters when listing management agents in the Management Agent Cloud service
- Support for filtering by type when listing work requests in the Management Agent Cloud service
- Support for filtering by agent id when listing management agent plugins in the Management Agent Cloud service
- Support for specifying size preference when requesting a data transfer appliance in the Data Transfer service
- Support for encryption of boot and block volumes associated with a cluster using customer-specified KMS keys in the Big Data service
- Support for the VM.Standard.E4.Flex shape for Cloud SQL (CSQL) nodes in the Big Data service
- Support for listing block and boot volumes, as well as block and boot volume replicas, within a volume group in the Block Volume service
- Support for dedicated autonomous databases in the Operator Access Control service
- Support for viewing automatic workload repository (AWR) data for databases added to AWRHub in the Operations Insights service
- Support for ports, protocols, roles, and SSL secrets when enabling or modifying database management in the Database service
- Support for monthly security maintenance runs in the Database service
- Support for monthly infrastructure patching for Exadata Cloud at Customer resources in the Database service

### Breaking Changes
- Class `com.oracle.bmc.fusionapps.DataMaskingActivity` has been removed from `com.oracle.bmc.fusionapps.DataMaskingActivity` in the Fusion Apps as a Service service
- Class `com.oracle.bmc.fusionapps.DataMaskingActivityClient$Builder` has been removed from `com.oracle.bmc.fusionapps.DataMaskingActivityClient$Builder` in the Fusion Apps as a Service service
- Class `com.oracle.bmc.fusionapps.DataMaskingActivityPaginators` has been removed from `com.oracle.bmc.fusionapps.DataMaskingActivityPaginators` in the Fusion Apps as a Service service
- Class `com.oracle.bmc.fusionapps.DataMaskingActivityWaiters` has been removed from `com.oracle.bmc.fusionapps.DataMaskingActivityWaiters` in the Fusion Apps as a Service service
- Class `com.oracle.bmc.fusionapps.FusionEnvironment` has been removed from `com.oracle.bmc.fusionapps.FusionEnvironment` in the Fusion Apps as a Service service
- Class `com.oracle.bmc.fusionapps.FusionEnvironmentClient$Builder` has been removed from `com.oracle.bmc.fusionapps.FusionEnvironmentClient$Builder` in the Fusion Apps as a Service service
- Class `com.oracle.bmc.fusionapps.FusionEnvironmentFamily` has been removed from `com.oracle.bmc.fusionapps.FusionEnvironmentFamily` in the Fusion Apps as a Service service
- Class `com.oracle.bmc.fusionapps.FusionEnvironmentFamilyClient$Builder` has been removed from `com.oracle.bmc.fusionapps.FusionEnvironmentFamilyClient$Builder` in the Fusion Apps as a Service service
- Class `com.oracle.bmc.fusionapps.FusionEnvironmentFamilyPaginators` has been removed from `com.oracle.bmc.fusionapps.FusionEnvironmentFamilyPaginators` in the Fusion Apps as a Service service
- Class `com.oracle.bmc.fusionapps.FusionEnvironmentFamilyWaiters` has been removed from `com.oracle.bmc.fusionapps.FusionEnvironmentFamilyWaiters` in the Fusion Apps as a Service service
- Class `com.oracle.bmc.fusionapps.FusionEnvironmentPaginators` has been removed from `com.oracle.bmc.fusionapps.FusionEnvironmentPaginators` in the Fusion Apps as a Service service
- Class `com.oracle.bmc.fusionapps.FusionEnvironmentWaiters` has been removed from `com.oracle.bmc.fusionapps.FusionEnvironmentWaiters` in the Fusion Apps as a Service service
- Class `com.oracle.bmc.fusionapps.RefreshActivity` has been removed from `com.oracle.bmc.fusionapps.RefreshActivity`  in the Fusion Apps as a Service service
- Class `com.oracle.bmc.fusionapps.RefreshActivityClient$Builder` has been removed from `com.oracle.bmc.fusionapps.RefreshActivityClient$Builder` in the Fusion Apps as a Service service
- Class `com.oracle.bmc.fusionapps.RefreshActivityPaginators` has been removed from `com.oracle.bmc.fusionapps.RefreshActivityPaginators` in the Fusion Apps as a Service service
- Class `com.oracle.bmc.fusionapps.RefreshActivityWaiters` has been removed from `com.oracle.bmc.fusionapps.RefreshActivityWaiters` in the Fusion Apps as a Service service
- Class `com.oracle.bmc.fusionapps.ScheduledActivity` has been removed from `com.oracle.bmc.fusionapps.ScheduledActivity` in the Fusion Apps as a Service service
- Class `com.oracle.bmc.fusionapps.ScheduledActivityClient$Builder` has been removed from `com.oracle.bmc.fusionapps.ScheduledActivityClient$Builder` in the Fusion Apps as a Service service
- Class `com.oracle.bmc.fusionapps.ScheduledActivityPaginators` has been removed from `com.oracle.bmc.fusionapps.ScheduledActivityPaginators` in the Fusion Apps as a Service service
- Class `com.oracle.bmc.fusionapps.ScheduledActivityWaiters` has been removed from `com.oracle.bmc.fusionapps.ScheduledActivityWaiters` in the Fusion Apps as a Service service
- Class `com.oracle.bmc.fusionapps.ServiceAttachment` has been removed from `com.oracle.bmc.fusionapps.ServiceAttachment` in the Fusion Apps as a Service service
- Class `com.oracle.bmc.fusionapps.ServiceAttachmentClient$Builder` has been removed from `com.oracle.bmc.fusionapps.ServiceAttachmentClient$Builder` in the Fusion Apps as a Service service
- Class `com.oracle.bmc.fusionapps.ServiceAttachmentPaginators` has been removed from `com.oracle.bmc.fusionapps.ServiceAttachmentPaginators` in the Fusion Apps as a Service service
- Class `com.oracle.bmc.fusionapps.ServiceAttachmentWaiters` has been removed from `com.oracle.bmc.fusionapps.ServiceAttachmentWaiters` in the Fusion Apps as a Service service
- Method `public java.lang.String getOpcProvisionOption()` has been removed from `com.oracle.bmc.fusionapps.requests.CreateFusionEnvironmentFamilyRequest` in the Fusion Apps as a Service service

## 2.36.1 - 2022-07-19
### Added
- Support for calling Oracle Cloud Infrastructure services in the mx-queretaro-1 region
- Support for the Process Automation service
- Support for the Managed Access service
- Support for extending maintenance reboot due dates on virtual machines in the Compute service
- Support for ingress routing tables on NAT gateways and internet gateways in the Networking service
- Support for container database and pluggable database discovery in the Stack Monitoring service
- Support for displaying rack serial numbers for Exadata infrastructure resources in the Database service
- Support for grace periods for wallet rotation on autonomous databases in the Database service
- Support for hosting models on flexible compute shapes with customizable OCPUs and memory in the Data Science service

## 2.36.0 - 2022-07-12
### Added
- Support for DBCS databases in the Operations Insights service
- Support for point-in-time recovery for non-highly-available database systems in the MySQL Database service
- Support for triggering reboot migration on instances with pending maintenance in the Compute service
- Support for native pod networking in the Container Engine for Kubernetes service
- Support for creating Data Guard associations with new database systems in the Database service

### Breaking Changes
- Method `public java.lang.Boolean getPreserveDataVolumes()` has been removed from `com.oracle.bmc.core.requests.TerminateInstanceRequest` in the Core service

## 2.35.0 - 2022-07-05
### Added
- Support for backup policies returned as part of the database system list operation in the MySQL Database service

### Breaking Changes
- Support for retries by default on some operations of the Bastion service

## 2.34.0 - 2022-06-28
### Added
- Support for the Network Monitoring service
- Support for specifying application scan settings when creating or updating host scan recipes in the Vulnerability Scanning service
- Support for moving data into an autonomous data warehouse in the Operations Insights service
- Support for shared infrastructure autonomous database character sets in the Database service
- Support for data collection logging events on Exadata instances in the Database service
- Support for specifying boot volume VPUs when launching instances from images in the Compute service
- Support for safe-deleting nodes in the Container Engine for Kubernetes service

### Breaking Changes
- Support for retries by default on operations of the Logging Analytics service

## 2.33.0 - 2022-06-21
### Added
- Support for the Network Firewall service
- Support for smaller and larger HeatWave cluster nodes in the MySQL Database service
- Support for CSV file type datasets for text labeling and JSONL in the Data Labeling service
- Support for diagnostics in the Database Management service

### Breaking Changes
- Support for retries by default on operations of the Network Firewall service
- Support for retries by default on the createAnnotation operation of the Data Labeling service

## 2.32.0 - 2022-06-14
### Added
- Support for the Web Application Acceleration (WAA) service
- Support for the Governance Rules service
- Support for the OneSubscription service
- Support for resource locking in the Identity service
- Support for quota resource locking in the Limits service
- Support for returning the backup with the requested changes in the MySQL Database service
- Support for time zone in Cloud Autonomous VM (CAVM) clusters in the Database service
- Support for configuration options in the Application Performance Monitoring service
- Support for MySQL connections in the Database Tools service

### Breaking Changes
- Support for default retries in some operations of the Database Tools service
- Model `com.oracle.bmc.databasetools.model.DatabaseToolsAllowedNetworkSources` has been removed in the Database Tools service
- Model `com.oracle.bmc.databasetools.model.DatabaseToolsVirtualSource` has been removed in the Database Tools service
- Model `com.oracle.bmc.databasetools.model.ServiceCapability` has been removed in the Database Tools service

## 2.31.0 - 2022-06-07
### Added
- Support for calling Oracle Cloud Infrastructure services in the eu-paris-1 region
- Support for private endpoints in Resource Manager service
- Support downloading generated Terraform plan output in JSON or binary format in Resource Manager service
- Support for querying OPSI Data Objects in the Operations Insights service

### Changed
- Network security groups (NSGs) are now optional for autonomous databases on private endpoints in the Database service

### Fixed
- Fixed a potential data corruption problem for binary data upload with default retries. We recommend that you update to this version `2.31.0` or later. For details, see https://github.com/oracle/oci-java-sdk/issues/402

## 2.30.0 - 2022-05-31
### Added

- Support for in-depth monitoring, diagnostics capabilities, and advanced management functionality for on-premise Oracle databases in the Database Management service
- Support for using Oracle Cloud Agent to perform iSCSI login and logout for non-multipath-enabled iSCSI attachments in the Container Engine for Kubernetes service
- Support for Fault Domain placement in the Container Engine for Kubernetes service
- Support for worker node images in the Container Engine for Kubernetes service
- Support for flexible shapes using the driverShapeConfig and executorShapeConfig properties in the Data Flow service

### Breaking Changes
- Support for retries by default on operations in the Application Dependency Management service

## 2.29.0 - 2022-05-24
### Added
- Support for the License Manager service
- Support for usage plans in the API Gateway service
- Support for packaged skill and instance metadata management, role-based access options on instance creation, and assigned ownership in the Digital Assistant service
- Support for compute capacity reservations in the VMWare Solution service
- Support for Oracle Linux 8 application streams in the OS Management service
- Support for GraalVM

### Breaking Changes
- Support for retries by default on operations in the API Gateway service

## 2.28.0 - 2022-05-17
### Added
- Support for information requests in the Operator Access Control service
- Support for Helm charts and repositories on deployments in the DevOps service
- Support for Application Dependency Management service scan results on builds in the DevOps service
- Support for build resources to use Bitbucket Cloud repositories for source code in the DevOps service
- Support for character set selection on autonomous dedicated databases in the Database service
- Support for listing autonomous dedicated database supported character sets in the Database service
- Support for AMD E4 flex shapes on virtual machine database systems in the Database service
- Support for terraform and improvements for cross-region ADGs in the Database service

### Breaking Changes
- Support for retries by default on GET / LIST operations in the Visual Builder service

## 2.27.0 - 2022-05-10
### Added
- Support for getting usage information for autonomous databases and Cloud at Customer autonomous databases in the Database service
- Support for the "standby" lifecycle state on autonomous databases in the Database service
- Support for BIP connections and dataflow operators in the Data Integration service

### Breaking Changes
- Support for retries by default on WAF Edge Policy GET / LIST operations in the Web Application Acceleration and Security service
- Support for retries by default on some operations in the Stack Monitoring service
- Support for retries by default on some resource discovery and monitoring operations in the Application Management service
- Support for retries by default on some operations in the MySQL Database service
- Return type of method `public com.oracle.bmc.dataintegration.model.CreateConnectionFromBICC getDefaultConnection()` has been changed to `com.oracle.bmc.dataintegration.model.CreateConnectionDetails` in the model `com.oracle.bmc.dataintegration.model.CreateDataAssetFromFusionApp` in the Data Integration service
- Return type of method `public com.oracle.bmc.dataintegration.model.ConnectionFromBICCDetails getDefaultConnection()` has been changed to `com.oracle.bmc.dataintegration.model.ConnectionDetails` in the model `com.oracle.bmc.dataintegration.model.DataAssetFromFusionApp` in the Data Integration service
- Return type of method `public com.oracle.bmc.dataintegration.model.ConnectionSummaryFromBICC getDefaultConnection()` has been changed to `com.oracle.bmc.dataintegration.model.ConnectionSummary` in the model `com.oracle.bmc.dataintegration.model.DataAssetSummaryFromFusionApp` in the Data Integration service

## 2.26.0 - 2022-05-03
### Added
- Support for the Application Dependency Management service
- Support for platform configuration options on some bare metal shapes in the Compute service
- Support for shielded instances for BM.Standard.E4.128 and BM.Standard3.64 shapes in the Compute service
- Support for E4 dense VMs on launch and update instance operations in the Compute service
- Support for reboot migration on DenseIO shapes in the Compute service
- Support for an increased database name maximum length, from 14 to 30 characters, in the Database service
- Support for provisioned concurrency in the Functions service

### Breaking Changes
- Support for retries by default on operations in the Vault service
- Support for retries by default on operations in the DNS service
- Support for retries by default on operations in the Content Management service
- Support for retries by default on operations in the Console Dashboard service
- Support for retries by default on Web Application Firewall operations in the Web Application Acceleration and Security service
- Support for retries by default on operations in the Data Science service

## 2.25.0 - 2022-04-26
### Added
- Support for the Service Mesh service
- Support for security zones in the Cloud Guard service
- Support for virtual test access points (VTAPs) in the Networking service
- Support for monitoring as a source in the Service Connector Hub service
- Support for creating budgets that target subscriptions and child tenancies in the Budgets service
- Support for listing shapes and specifying a shape during creation of a node in the Roving Edge Infrastructure service
- Support for bringing your own key in the Roving Edge Infrastructure service
- Support for enabling inspection of HTTP request bodies in the Web Application Acceleration and Security
- Support for cost management schedules in the Usage service
- Support for TCPS on external containers as well as non-container and pluggable databases in the Database service
- Support for autoscaling on Open Data Hub (ODH) clusters in the Big Data service
- Support for creating Open Data Hub (ODH) 0.9 clusters in the Big Data service
- Support for Open Data Hub (ODH) patch management in the Big Data service
- Support for customizable Kerberos realm names in the Big Data service
- Support for dedicated vantage points in the Application Performance Monitoring service
- Support for reactivating child tenancies in the Organizations service
- Support for punctuation and the SRT transcription format in the AI Speech service

### Breaking Changes
- Support for default retries on some operations in the Networking service
- Support for default retries on all operations in the Data Safe service
- Support for default retries on some additional operations in the Application Performance Monitoring service
- Method `public java.lang.Double getRiskScore()` has been removed from the model `com.oracle.bmc.cloudguard.model.Sighting` in the Cloud Guard service

## 2.24.0 - 2022-04-19
### Added
- Support for the Stack Monitoring service
- Support for stack monitoring on external databases in the Database service
- Support for upgrading VM database systems in place in the Database service
- Support for viewing supported VMWare software versions when listing host shapes in the VMWare Solution service
- Support for choosing compute shapes when creating SDDCs and ESXi hosts in the VMWare Solution service
- Support for work requests on delete operations in the Vulnerability Scanning service
- Support for additional scan metadata in reports, including CVE descriptions, in the Vulnerability Scanning service
- Support for redemption codes in the Usage service

### Breaking Changes
- Method `public java.lang.String getEtag()` has been removed from `com.oracle.bmc.usage.responses.ListRedeemableUsersResponse` in the Usage service
- The maximum wait time in SDK default retry configuration was changed from 30 milliseconds to 30 seconds

## 2.23.0 - 2022-04-12
### Added
- Support for bringing your own IPv6 addresses in the Networking service
- Support for specifying database edition and maximum CPU core count when creating or updating an autonomous database in the Database service
- Support for enabling and disabling data collection options when creating or updating Exadata Cloud at Customer VM clusters in the Database service
- Improved error messages for service errors and other miscellaneous errors

### Breaking Changes
- Support for retries by default on operations in the Identity service
- Support for retries by default on operations in the Operations Insights service

## 2.22.0 - 2022-04-05
### Added
- Fixed the lifecycle state values for target databases in the Data Safe service
- Support for content length and content type response headers when downloading PDFs in the Account Management service
- Support for creating Enterprise Manager-based zLinux host targets, creating alarms, and viewing top process analytics in the Operations Insights service
- Support for diagnostic reboots on VM instances in the Compute service

### Breaking Changes
- The data type of property `lifecycleState` in request `ListTargetDatabasesRequest` was changed from `com.oracle.bmc.datasafe.model.LifecycleState` to `com.oracle.bmc.datasafe.model.TargetDatabaseLifecycleState` in the Data Safe service
- The data type of property `lifecycleState` in model `TargetDatabase` was changed from `com.oracle.bmc.datasafe.model.LifecycleState` to `com.oracle.bmc.datasafe.model.TargetDatabaseLifecycleState` in the Data Safe service
- The data type of property `lifecycleState` in model `TargetDatabaseSummary` was changed from `com.oracle.bmc.datasafe.model.LifecycleState` to `com.oracle.bmc.datasafe.model.TargetDatabaseLifecycleState` in the Data Safe service

## 2.21.0 - 2022-03-29
### Added
- Support for returning the number of network ports as part of listing shapes in the Compute service
- Support for Java runtime removal and custom logs in the Java Management service
- Support for new parameters for BGP admin state and enabling/disabling BFD in the Networking service
- Support for private OKE clusters and blue-green deployments in the DevOps service
- Support for international customers to consume and launch third-party paid listings in the Marketplace service
- Support for additional fields on entities, attributes, and folders in the Data Catalog service

### Breaking Changes
- Support for retries by default on operations in the Marketplace service

## 2.20.0 - 2022-03-22
### Added
- Support for getting the storage utilization of a deployment on deployment list and get operations in the GoldenGate service
- Support for virtual machines, bare metal machines, and Exadata databases with private endpoints in the Operations Insights service
- Support for setting deletion policies on database systems in the MySQL Database service

### Breaking Changes
- Support for retries by default on operations in the Data Labeling service (data plane and control plane)

## 2.19.1 - 2022-03-15
### Added
- Support for Ubuntu platforms and unlimited installation keys in the Management Agent Cloud service
- Support for shielded instances in the VMWare Solution service
- Support for application resources in the Data Integration service
- Support for multi-AVM on Exadata Cloud at Customer infrastructure in the Database service
- Support for heterogeneous (VM and AVM) clusters on Exadata Cloud at Customer infrastructure in the Database service
- Support for custom maintenance schedules for AVM clusters on Exadata Cloud at Customer infrastructure in the Database service
- Support for listing vulnerabilities, vulnerability-impacted containers, and vulnerability-impacted hosts in the Vulnerability Scanning service
- Support for specifying an image count when creating or updating container scan recipes in the Vulnerability Scanning service

## 2.19.0 - 2022-03-08
### Added
- Support for the Sales Accelerator license option in the Content Management service
- Support for VCN hostname cluster endpoints in the Container Engine for Kubernetes service
- Support for optionally specifying an admin username and password when creating a database system during a restore operation in the MySQL Database service
- Support for automatic tablespace creation on non-autonomous and autonomous database dedicated targets in the Database Migration service
- Support for reporting excluded objects based on static exclusion rules and dynamic exclusion settings in the Database Migration service
- Support for removing, listing, and adding database objects reported by the Cloud Premigration Advisor Tool (CPAT) in the Database Migration service
- Support for migrating Oracle databases from the AWS RDS service to OCI as autonomous databases, using the AWS S3 service and DBLINK for data transfer, in the Database Migration service
- Support for querying additional fields of a resource using return clauses in the Search service
- Support for clusters and station clusters in the Roving Edge Infrastructure service
- Support for creating database systems and database homes using customer-managed keys in the Database service

### Breaking Changes
- Parameter 2 of `public com.oracle.bmc.waiter.Waiter forOceInstance(com.oracle.bmc.oce.requests.GetOceInstanceRequest, com.oracle.bmc.oce.model.OceInstance$LifecycleState[])` has changed its type to `com.oracle.bmc.oce.model.LifecycleState[]` in `com.oracle.bmc.oce.OceInstanceWaiters` in the Content Management service
- Parameter 2 of `public com.oracle.bmc.waiter.Waiter forOceInstance(com.oracle.bmc.oce.requests.GetOceInstanceRequest, com.oracle.bmc.oce.model.OceInstance$LifecycleState, com.oracle.bmc.waiter.TerminationStrategy, com.oracle.bmc.waiter.DelayStrategy)` has changed its type to `com.oracle.bmc.oce.model.LifecycleState` in `com.oracle.bmc.oce.OceInstanceWaiters` in the Content Management service 
- Parameter 4 of `public com.oracle.bmc.waiter.Waiter forOceInstance(com.oracle.bmc.oce.requests.GetOceInstanceRequest, com.oracle.bmc.waiter.TerminationStrategy, com.oracle.bmc.waiter.DelayStrategy, com.oracle.bmc.oce.model.OceInstance$LifecycleState[])` has changed its type to `com.oracle.bmc.oce.model.LifecycleState[]` in `com.oracle.bmc.oce.OceInstanceWaiters` in the Content Management service
- Return type of method `public com.oracle.bmc.oce.model.OceInstance$LifecycleState getLifecycleState()` has been changed to `com.oracle.bmc.oce.model.LifecycleState` in the model `com.oracle.bmc.oce.model.OceInstance` in the Content Management service 
- Class `com.oracle.bmc.oce.model.OceInstance$LifecycleState` has been removed in the Content Management service
- Return type of method `public com.oracle.bmc.oce.model.OceInstanceSummary$LifecycleState getLifecycleState()` has been changed to `com.oracle.bmc.oce.model.LifecycleState` in the model `com.oracle.bmc.oce.model.OceInstanceSummary` in the Content Management service 
- Class `com.oracle.bmc.oce.model.OceInstanceSummary$LifecycleState` has been removed in the Content Management service
- Return type of method `public com.oracle.bmc.oce.requests.ListOceInstancesRequest$LifecycleState getLifecycleState()` has been changed to `com.oracle.bmc.oce.model.LifecycleState` in `com.oracle.bmc.oce.requests.ListOceInstancesRequest` in the Content Management service
- Class `com.oracle.bmc.oce.requests.ListOceInstancesRequest$LifecycleState` has been removed in the Content Management service
- Support for retries enabled by default on operations in the Container Engine for Kubernetes service
- Support for retries enabled by default on operations in the Resource Manager service
- Support for retries enabled by default on operations in the Search service

## 2.18.0 - 2022-03-01
### Added
- Support for DRG route distribution statements to be specified with a new match type `MATCH_ALL` for matching criteria in the Networking service
- Support for VCN route types on DRG attachments for deciding whether to import VCN CIDRs or subnet CIDRs into route rules in the Networking service
- Support for CPS offline reports in the Database service
- Support for infrastructure patching v2 features in the Database service
- Support for auto-scaling the storage of an autonomous database, as well as shrinking an autonomous database, in the Database service
- Support for managed egress via a default networking option on jobs and notebooks in the Data Science service
- Support for more types of saved search enums in the Management Dashboard service

### Breaking Changes
- Support for retries enabled by default on some operations in the AI Vision service

## 2.17.0 - 2022-02-22
### Added
- Support for the Data Connectivity Management service
- Support for the AI Speech service
- Support for disabling crash recovery in the MySQL Database service
- Support for detector recipes of type "threat", new detector rule of type "rogue user", and sightings operations in the Cloud Guard service
- Support for more VM shape configurations when listing shapes in the Compute service
- Support for customer-managed encryption keys in the Analytics Cloud service
- Support for FastConnect device information in the Networking service

### Breaking Changes
- Support for retries enabled by default on all operations in the Application Performance Monitoring Control Plane service

## 2.16.0 - 2022-02-15
### Added
- Support for the AI Vision service
- Support for the Threat Intelligence service
- Support for creation of NoSQL database tables with on-demand throughput capacity in the NoSQL Database Cloud service
- Support for tagging features in the Oracle Container Engine for Kubernetes (OKE) service
- Support for trace snapshots in the Application Performance Monitoring service
- Support for auditing and alerts in the Data Safe service
- Support for data discovery and data masking in the Data Safe service
- Support for customized subscriptions and delivery of announcements by email and SMS in the Announcements service

### Breaking Changes
- Method `public com.oracle.bmc.apmtraces.responses.QueryOldResponse queryOld(com.oracle.bmc.apmtraces.requests.QueryOldRequest)` has been removed in the Application Performance Monitoring service
- Class `com.oracle.bmc.apmtraces.requests.QueryOldRequest` has been removed in the Application Performance Monitoring service
- Class `com.oracle.bmc.apmtraces.responses.QueryOldResponse` has been removed in the Application Performance Monitoring service

## 2.15.0 - 2022-02-08
### Added
- Support for managing tablespaces in the Database Management service
- Support for upgrading and managing payment for subscriptions in the Account Management service
- Support for listing fast launch job configurations in the Data Science service

### Breaking Changes
- Support for retries enabled by default on all operations in the Application Performance Monitoring service
- Class `com.oracle.bmc.ospgateway.model.Address` has been removed from the Account Management service
- Return type of the method `com.oracle.bmc.ospgateway.model.Address getBillToAddress()` has been changed to `com.oracle.bmc.ospgateway.model.BillToAddress` in the model `com.oracle.bmc.ospgateway.model.Invoice` in the Account Management service

## 2.14.1 - 2022-02-01
### Added
- Support for calling Oracle Cloud Infrastructure services in the ap-dcc-canberra-1 region
- Support for the Console Dashboard service
- Support for capacity reservation in the Container Engine for Kubernetes service
- Support for tagging in the Container Engine for Kubernetes service
- Support for fetching listings by image OCID in the Marketplace service
- Support for underscores and hyphens in project resource names in the DevOps service
- Support for cross-region cloning in the Database service

## 2.14.0 - 2022-01-25
### Added
- Support for OneSubscription services
- Support for specifying if a run or application is streaming or batch in the Data Flow service
- Support for updating the Instance Configuration of an Instance Pool within a Cluster Network in the Compute Management service
- Updated documentation for Cross Region ADG feature for Autonomous Database in the Database service

### Breaking Changes
- Support for retries enabled by default on all operations in the Object Storage service

## 2.13.1 - 2022-01-18
### Added
- Support for calling Oracle Cloud Infrastructure services in the me-dcc-muscat-1 region
- Support for the Visual Builder service
- Support for cross-region replication of volume groups in the Block Storage service
- Support for boot volume encryption in the Container Engine for Kubernetes service
- Support for adding metadata to records when creating and updating records in the Data Labeling service
- Support for global export formats in snapshot datasets in the Data Labeling service
- Support for adding labeling instructions to datasets in the Data Labeling service
- Support for updating autonomous dataguard associations for autonomous container databases in the Database service
- Support for setting up automatic failover when creating autonomous container databases in the Database service
- Support for setting the RECO storage size when updating a database system in the Database service
- Support for reconnecting refreshable clones to source for autonomous databases on shared infrastructure in the Database service
- Support for checking if an autonomous database on shared infrastructure can be reconnected to source, in the Database service

## 2.13.0 - 2022-01-11
### Added
- Support for calling Oracle Cloud Infrastructure services in the af-johannesburg-1 and eu-stockholm-1 regions
- Support for multiple protocols on the same listener in the Network Load Balancing service
- IPv6 support in the Network Load Balancing service
- Support for creating Enterprise Manager-based Solaris and SunOS host targets in the Operations Insights service
- Support for choosing Data Guard type (Active Data Guard or regular) on databases in the Database service

### Breaking Changes
- Support for retries enabled by default on all operations in the Java Management service
- Return type of method `com.oracle.bmc.auth.AuthenticationDetailsProvider getProvider()` has been changed from `AuthenticationDetailsProvider` to `BasicAuthenticationDetailsProvider` in `com.oracle.bmc.encryption.KmsMasterKey` in the Encryption service
- Return type of method `com.oracle.bmc.auth.AuthenticationDetailsProvider getAuthenticationProvider()` has been changed from `AuthenticationDetailsProvider` to `BasicAuthenticationDetailsProvider`  in `com.oracle.bmc.encryption.KmsMasterKeyProvider` in the Encryption service

## 2.12.0 - 2021-12-14
### Added
- Support for node replacement in the VMWare Solution service
- Support for ingestion of SQL stats metrics in the Operations Insights service
- Support for AWR hub integration in the Operations Insights service
- Support for automatically generating logical entities from filename patterns and relationships between business terms across glossaries in the Data Catalog service
- Support for automatic start/stop at scheduled times in the Database service
- Support for cloud VM cluster resources on autonomous dedicated databases in the Database service
- Support for external Hive metastores in the Big Data service
- Support for batch detection/inference in the AI Language service
- Support for dimensions on monitoring targets in the Service Connector Hub service
- Support for invoice operations in the Account Management service
- Support for custom CA trust stores in the API Gateway service
- Support for generating scoped database tokens in the Identity service
- Support for database passwords for users, for logging into database accounts, in the Identity service 

### Breaking Changes
- Support for retries enabled by default on some operations in the Data Catalog service
- Support for retries enabled by default on all operations in the Ocvp service

## 2.11.1 - 2021-12-07
### Added
- Support for the Application Management service
- Support for getting the inventory of JMS resources and listing Java runtime usage in a specified host in the Java Management service
- Support for categories, entity topology, and verifying scheduled tasks in the Logging Analytics service
- Support for RAC databases in the GoldenGate service
- Support for querying additional fields of a resource using return clauses in the Search service
- Support for key versions and key version OCIDs in the Key Management service

## 2.11.0 - 2021-11-30
### Added
- Support for SQL Tuning Advisor in the Database Management service
- Support for listing users and getting user details in the Database Management service
- Support for autonomous databases in the Database Management service
- Support for enabling and disabling Database Management features on autonomous databases in the Database service
- Support for the Solaris platform in the Management Agent Cloud service
- Support for cross-compartment operations in the Operations Insights service
- Support for listing deployment backups in the GoldenGate service
- Support for standard tags in the Identity service
- Support for viewing problems for deleted targets in the Cloud Guard service
- Support for choosing a platform version while creating a platform instance in the Blockchain Platform service
- Support for custom IPSec connection tunnel internet key exchange phase 1 and phase 2 encryption algorithms in the Networking service
- Support for pagination when listing work requests corresponding to an APM domain in the Application Performance Monitoring service
- Support for the "deleted" lifecycle state on APM domains in the Application Performance Monitoring service
- Support for calling Oracle Cloud Infrastructure services in the eu-milan-1 and me-abudhabi-1 regions

### Breaking Changes
- Support for retries enabled by default in all operations of the DevOps, Build, and Source Code Management services. This support is not added on the async clients.

## 2.10.0 - 2021-11-17
### Added
- Support for getting subnet topology in the Networking service
- Support for encrypted FastConnect resources in the Networking service
- Support for performance and high availability, as well as recommendation metrics, in the Optimizer service
- Support for optional TDE wallet passwords in the Database service
- Support for Object Storage service integration in the Big Data service

### Breaking Changes
- Support for circuit breakers enabled by default in all services except Streaming and Compute. This support is not added on the async clients
- Support for retries enabled by default in all operations of the Functions and Roving Edge services, and in some operations of the Streaming service. This support is not added on the async clients

## 2.9.0 - 2021-11-09
### Added
- Support for drill down metadata in the Management Dashboard service
- Support for operator access control on dedicated autonomous databases in the Operator Access Control service

### Breaking Changes
- Return type of method `public java.lang.String getResourceType()` has been changed to `com.oracle.bmc.operatoraccesscontrol.model.ResourceTypes` in the model `com.oracle.bmc.operatoraccesscontrol.model.OperatorControlAssignmentSummary` in the Operator Access Control service

## 2.8.1 - 2021-11-02
### Added
- Support for the Database Tools service
- Support for scan listener port TCP and TCP SSL on cloud VM clusters in the Database service
- Support for domains in the Identity service
- Support for redeemable users and support rewards in the Usage service
- Support for calling Oracle Cloud Infrastructure services in the ap-singapore-1 and eu-marseille-1 regions

### Changed
- Endpoint for Identity service changed to include ".oci" subdomain

## 2.8.0 - 2021-10-26
### Added
- Support for the Source Code Management service
- Support for the Build service
- Support for the Certificates service
- Support to create child tenancies in an organization and manage subscriptions in the Organizations service
- Support for Certificates service integration in the Load Balancing service
- Support for creating hosts in specific availability domains in the VMWare Solution service
- Support for user-defined functions and libraries, as well as scheduling and orchestration, in the Data Integration service
- Support for EM-managed Exadatas and EM-managed hosts in the Operations Insights service

### Breaking Changes
- Class `com.oracle.bmc.devops.model.ComputeInstanceGroupBlueGreenDeployStageExecutionProgress` has been removed in the DevOps service
- Class `com.oracle.bmc.devops.model.ComputeInstanceGroupBlueGreenTrafficShiftDeployStageExecutionProgress` has been removed in the DevOps service
- Class `com.oracle.bmc.devops.model.ComputeInstanceGroupCanaryApprovalDeployStageExecutionProgress` has been removed in the DevOps service
- Class `com.oracle.bmc.devops.model.ComputeInstanceGroupCanaryDeployStageExecutionProgress` has been removed in the DevOps service
- Class `com.oracle.bmc.devops.model.ComputeInstanceGroupCanaryTrafficShiftDeployStageExecutionProgress` has been removed in the DevOps service
- Class `com.oracle.bmc.devops.model.RunPipelineDeployStageExecutionProgress` has been removed in the DevOps service
- Class `com.oracle.bmc.devops.model.RunValidationTestOnComputeInstanceDeployStageExecutionProgress` has been removed in the DevOps service

## 2.7.2 - 2021-10-19
### Added
- Support for creating database systems from backups with database software images in the Database service
- Support for optionally providing a SID prefix during Exadata database creation in the Database service
- Support for node subsetting on VM clusters in the Database service
- Support for non-CDB to PDB conversion in the Database service
- Support for default homepages, unprocessed data buckets, and parsing geostats in the Logging Analytics service

## 2.7.1 - 2021-10-12
### Added
- Support for the Data Labeling Service
- Support for querying and setting Application Performance Monitoring configurations in the Application Performance Monitoring service
- Support for the run-once monitor feature and network data collection in the Application Performance Monitoring service
- Support for Oracle Enterprise Manager bridges, source auto-association, source event types mapping, and partitioning and searching data by LogSet in the Logging Analytics service
- Support for Log events APIs used by plugins like fluentd, fluentbit, etc. to upload data in the Logging Analytics service
- Support for a new ActionType: FAILED in work requests in the VMware Provisioning service
- Support for calling Oracle Cloud Infrastructure services in the il-jerusalem-1 region

## 2.7.0 - 2021-10-05
### Added
- Support for configuring Binlog variables in the MySQL Database service
- Support new response value "OPERATOR" for backup creationType in list and get MDS backup API in the MySQL Database service
- Support for SetAutoUpgradableConfig and GetAutoUpgradableConfig operations in Management Agent Cloud service
- Support for additional installType filter for List Management Agents, Images and Count API operations in Management Agent Cloud service
- Support for list and read DeploymentUpgrade, cancel and restore DeploymentBackup in the Golden Gate service
- Support for non-autonomous databases targets, executing Pre-Migration advisor, uploading Datapump logs into Object Storage bucket, and filtering Database Objects in the Database Migration service
- Support for calling Oracle Cloud Infrastructure services in the ap-ibaraki-1 region

### Breaking changes
- Return type of method `public com.oracle.bmc.databasemigration.model.LifecycleStates getLifecycleState()` has been changed to `com.oracle.bmc.databasemigration.model.MigrationLifecycleStates` in the Database Migration service
- Method `public java.lang.String getCompartmentId()` has been removed from model `com.oracle.bmc.databasemigration.model.UpdateAgentDetails` in the Database Migration service
- Method `public java.util.Date getTimeStamp()` has been removed from the model `com.oracle.bmc.databasemigration.model.WorkRequestError` in the Database Migration service
- Method `public java.util.Date getTimeStamp()` has been removed from the model `com.oracle.bmc.databasemigration.model.WorkRequestLogEntry` in the Database Migration service
- Return type of method `public com.oracle.bmc.databasemigration.model.LifecycleStates getLifecycleState()` has been changed to `com.oracle.bmc.databasemigration.model.MigrationLifecycleStates` in `com.oracle.bmc.databasemigration.requests.ListMigrationsRequest` in the Database Migration service
- Method `public java.lang.String getDisplayName()` has been removed from `com.oracle.bmc.databasemigration.requests.ListWorkRequestErrorsRequest` in the Database Migration service
- Removed field `DisplayName` from `com.oracle.bmc.databasemigration.requests.ListWorkRequestErrorsRequest$SortBy` in the Database Migration service
- Removed field `TimeCreated` from `com.oracle.bmc.databasemigration.requests.ListWorkRequestErrorsRequest$SortBy` in the Database Migration service
- Method `public java.lang.String getDisplayName()` has been removed from `com.oracle.bmc.databasemigration.requests.ListWorkRequestLogsRequest` in the Database Migration service
- Removed field `DisplayName` from `com.oracle.bmc.databasemigration.requests.ListWorkRequestLogsRequest$SortBy` in the Database Migration service
- Removed field `TimeCreated` from `com.oracle.bmc.databasemigration.requests.ListWorkRequestLogsRequest$SortBy` in the Database Migration service
- Method `public java.lang.String getDisplayName()` has been removed from `com.oracle.bmc.databasemigration.requests.ListWorkRequestsRequest` in the Database Migration service
- Removed field `DisplayName` from `com.oracle.bmc.databasemigration.requests.ListWorkRequestsRequest$SortBy` in the Database Migration service
- Removed field `TimeCreated` from `com.oracle.bmc.databasemigration.requests.ListWorkRequestsRequest$SortBy` in the Database Migration service
- Parameter 2 of `public com.oracle.bmc.waiter.Waiter forMigration(com.oracle.bmc.databasemigration.requests.GetMigrationRequest, com.oracle.bmc.databasemigration.model.LifecycleStates[])` has changed its type to `com.oracle.bmc.databasemigration.model.MigrationLifecycleStates[]` in `com.oracle.bmc.databasemigration.DatabaseMigrationWaiters` in the Database Migration service
- Parameter 2 of `public com.oracle.bmc.waiter.Waiter forMigration(com.oracle.bmc.databasemigration.requests.GetMigrationRequest, com.oracle.bmc.databasemigration.model.LifecycleStates, com.oracle.bmc.waiter.TerminationStrategy, com.oracle.bmc.waiter.DelayStrategy)` has changed its type to `com.oracle.bmc.databasemigration.model.MigrationLifecycleStates` in `com.oracle.bmc.databasemigration.DatabaseMigrationWaiters` in the Database Migration service
- Parameter 4 of `public com.oracle.bmc.waiter.Waiter forMigration(com.oracle.bmc.databasemigration.requests.GetMigrationRequest, com.oracle.bmc.waiter.TerminationStrategy, com.oracle.bmc.waiter.DelayStrategy, com.oracle.bmc.databasemigration.model.LifecycleStates[])` has changed its type to `com.oracle.bmc.databasemigration.model.MigrationLifecycleStates[]` in `com.oracle.bmc.databasemigration.DatabaseMigrationWaiters` in the Database Migration service
- Return type of method `public com.oracle.bmc.databasemigration.model.LifecycleStates getLifecycleState()` has been changed to `com.oracle.bmc.databasemigration.model.MigrationLifecycleStates` in the model `com.oracle.bmc.databasemigration.model.Migration` in the Database Migration service
- Return type of method `public com.oracle.bmc.databasemigration.model.LifecycleStates getLifecycleState()` has been changed to `com.oracle.bmc.databasemigration.model.MigrationLifecycleStates` in the model `com.oracle.bmc.databasemigration.model.MigrationSummary` in the Database Migration service
- Method `public java.lang.Boolean getIsAgentAutoUpgradable()` has been removed from `com.oracle.bmc.managementagent.model.UpdateManagementAgentDetails` in the Management Agent Cloud service

## 2.6.0 - 2021-09-28
### Added
- Support for autonomous databases and clones on shared infrastructure not requiring mTLS in the Database service
- Support for server-side encryption using object-specific KMS keys in the Object Storage service
- Support for Windows in the Java Management service
- Support for using network security groups in the API Gateway service
- Support for network security groups in the Functions service
- Support for signed container images in the Functions service
- Support for setting message format when creating and updating alarms in the Monitoring service
- Support for user and security assessment features in the Data Safe service

### Breaking Changes
- Method `public com.oracle.bmc.jms.responses.RequestSummarizedApplicationUsageResponse requestSummarizedApplicationUsage(com.oracle.bmc.jms.requests.RequestSummarizedApplicationUsageRequest)` has been removed from `com.oracle.bmc.jms.JavaManagementService` in the Java Management service
- Method `public com.oracle.bmc.jms.responses.RequestSummarizedInstallationUsageResponse requestSummarizedInstallationUsage(com.oracle.bmc.jms.requests.RequestSummarizedInstallationUsageRequest)` has been removed from `com.oracle.bmc.jms.JavaManagementService` in the Java Management service
- Method `public com.oracle.bmc.jms.responses.RequestSummarizedJreUsageResponse requestSummarizedJreUsage(com.oracle.bmc.jms.requests.RequestSummarizedJreUsageRequest)` has been removed has been removed from `com.oracle.bmc.jms.JavaManagementService` in the Java Management service
- Method `public com.oracle.bmc.jms.responses.RequestSummarizedManagedInstanceUsageResponse requestSummarizedManagedInstanceUsage(com.oracle.bmc.jms.requests.RequestSummarizedManagedInstanceUsageRequest)` has been removed from `com.oracle.bmc.jms.JavaManagementService` in the Java Management service
- Class `com.oracle.bmc.jms.model.RequestSummarizedApplicationUsageDetails` has been removed in the Java Management service
- Class `com.oracle.bmc.jms.model.RequestSummarizedInstallationUsageDetails` has been removed in the Java Management service
- Class `com.oracle.bmc.jms.model.RequestSummarizedJreUsageDetails` has been removed in the Java Management service
- Class `com.oracle.bmc.jms.model.RequestSummarizedManagedInstanceUsageDetails` has been removed in the Java Management service
- Class `com.oracle.bmc.jms.requests.RequestSummarizedApplicationUsageRequest` has been removed in the Java Management service
- Class `com.oracle.bmc.jms.requests.RequestSummarizedInstallationUsageRequest` has been removed in the Java Management service
- Class `com.oracle.bmc.jms.requests.RequestSummarizedJreUsageRequest` has been removed in the Java Management service
- Class `com.oracle.bmc.jms.requests.RequestSummarizedManagedInstanceUsageRequest` has been removed in the Java Management service
- Class `com.oracle.bmc.jms.responses.RequestSummarizedApplicationUsageResponse` has been removed in the Java Management service
- Class `com.oracle.bmc.jms.responses.RequestSummarizedInstallationUsageResponse` has been removed in the Java Management service
- Class `com.oracle.bmc.jms.responses.RequestSummarizedJreUsageResponse` has been removed in the Java Management service
- Class `com.oracle.bmc.jms.responses.RequestSummarizedManagedInstanceUsageResponse` has been removed in the Java Management service

## 2.5.1 - 2021-09-14
### Added
- Support for serviceHostKeyFingerprint property for InstanceConsoleConnection in the Core service
- Support for Shielded Instances in the Core service
- Support for ML Jobs in the Data Science service

## 2.5.0 - 2021-09-07
### Added
- Support for terraform advanced options (detailed log level, refresh, and parallelism) on jobs in the Resource Manager service
- Support for forced cancellation when cancelling jobs in the Resource Manager service
- Support for getting the detailed log content of a job in the Resource Manager service
- Support for provider information in the responses of list operations in the Management Dashboard service
- Support for scheduled jobs in Database Management service
- Support for monitoring and management of OCI virtual machine, bare metal, and ExaCS databases in the Database Management service
- Support for a unified way of managing both external and cloud databases in the Database Management service
- Support for metrics and Performance Hub on virtual machine, bare metal, and ExaCS databases in the Database Management service

### Breaking Changes
- Method `public java.lang.String getOciSplatGeneratedOcids()` has been removed from `com.oracle.bmc.resourcemanager.requests.CreateTemplateRequest` in the Resource Manager service 

## 2.4.2 - 2021-08-31
### Added
- Support for Oracle Analytics Cloud and OCI Vault integration on connections in the Data Catalog service
- Support for critical event monitoring in the OS Management service

## 2.4.1 - 2021-08-24
### Added
- Support for generating recommended VM cluster networks in the Database service
- Support for creating VM cluster networks with a specified listener port in the Database service

## 2.4.0 - 2021-08-17
### Added
- Support for getting management agent hosts which are eligible to create Operations Insights host resources on, in the Operations Insights service
- Support for getting summarized agent counts and summarized plugin counts in the Management Agent Cloud service

### Breaking Changes
- Class `com.oracle.bmc.managementagent.model.WorkSubmissionKey` has been removed in the Management Agent service
- Return type of method `public com.oracle.bmc.managementagent.model.PlatformTypes getPlatformType()` has been changed to `java.util.List` in the Management Agent service
- Return type of method `public java.lang.String getPluginName()` has been changed to `java.util.List` in the Management Agent service
- Return type of method `public java.lang.String getVersion()` has been changed to `java.util.List` in the Management Agent service

## 2.3.2 - 2021-08-03
### Added
- Support for manually copying volume group backups across regions in the Block Volume service
- Support for work requests for the copy volume backup and copy boot volume backup operations in the Block Volume service
- Support for specifying external Hive metastores during application creation in the Data Flow service
- Support for changing the compartment of a backup in the MySQL Database service
- Support for model catalog features including provenance, metadata, schemas, and artifact introspection in the Data Science service
- Support for Exadata system network bonding in the Database service
- Support for creating autonomous databases with early patching enabled in the Database service

## 2.3.1 - 2021-07-27
### Added
- Support for filtering by tag on capacity planning and SQL warehouse list operations in the Operations Insights service
- Support for creating cross-region autonomous data guards in the Database service
- Support for the customer contacts feature on cloud exadata infrastructure in the Database service
- Support for cost analysis custom tables in the Usage service

## 2.3.0 - 2021-07-20
### Added
- Support for schedules, schedule tasks, REST tasks, operators, S3, and Fusion Apps in the Data Integration service
- Support for getting available updates and update histories for VM clusters in the Database service
- Support for downloading network validation reports for Exadata network resources in the Database service
- Support for patch and upgrade of Grid Infrastructure (GI), and update of DomU OS software for VM clusters in the Database service
- Support for updating data guard associations in the Database service

### Breaking Changes
- Return type of method `public java.lang.String getType()` has been changed to `java.lang.Object` in the model `com.oracle.bmc.dataintegration.model.NativeShapeField` in the Data Integration service
- Removed field `RestOperator` from the model `com.oracle.bmc.dataintegration.model.Operator$ModelType` in the Data Integration service
- Method `public java.lang.String getBucketName()` has been removed from the model `com.oracle.bmc.dataintegration.model.OracleAdwcWriteAttributes` in the Data Integration service
- Method `public java.lang.String getBucketName()` has been removed from the model `com.oracle.bmc.dataintegration.model.OracleAtpWriteAttributes` in the Data Integration service
- Return type of method `public com.oracle.bmc.dataintegration.model.BaseType getType()` has been changed to `java.lang.Object` in the model `com.oracle.bmc.dataintegration.model.Parameter` in the Data Integration service
- Return type of method `public java.lang.String getType()` has been changed to `java.lang.Object` in the model `com.oracle.bmc.dataintegration.model.ShapeField` in the Data Integration service
- Return type of method `public com.oracle.bmc.dataintegration.requests.ListWorkspacesRequest$LifecycleState getLifecycleState()` has been changed to `com.oracle.bmc.dataintegration.model.Workspace$LifecycleState` in the Data Integration service
- Class `com.oracle.bmc.dataintegration.requests.ListWorkspacesRequest$LifecycleState` has been removed in the Data Integration service

## 2.2.0 - 2021-07-13
### Added
- Support for the AI Anomaly Detection service
- Support for retrieving a DNS zone as a zone file in the DNS service
- Support for querying manual adjustments in the Usage service
- Support for searching Marketplace listings in the Marketplace service
- Support for new cluster type `ODH` in the Big Data service
- Support for availability domain as an optional parameter when creating VLANs in the Networking service
- Support for search domain type on DHCP options, to support multi-level domain search in the Networking service

### Breaking Changes
- Method `public com.oracle.bmc.dns.model.TSIG getTsig()` has been removed from the model `com.oracle.bmc.dns.model.ExternalMaster` in the DNS service
- Class `com.oracle.bmc.dns.model.TSIG` has been removed in the DNS service
- Class `com.oracle.bmc.usageapi.model.CreateCustomTableDetails` has been removed in the Usage service
- Class `com.oracle.bmc.usageapi.model.CreateScheduleReportDetails` has been removed in the Usage service
- Class `com.oracle.bmc.usageapi.model.CustomTable` has been removed in the Usage service
- Class `com.oracle.bmc.usageapi.model.CustomTableCollection` has been removed in the Usage service
- Class `com.oracle.bmc.usageapi.model.CustomTableSummary` has been removed in the Usage service
- Class `com.oracle.bmc.usageapi.model.SavedScheduleReport` has been removed in the Usage service
- Class `com.oracle.bmc.usageapi.model.SavedScheduleReport$NotificationType` has been removed from the model `com.oracle.bmc.usageapi.model.SavedScheduleReport` in the Usage service
- Class `com.oracle.bmc.usageapi.model.ScheduleReport` has been removed in the Usage service
- Class `com.oracle.bmc.usageapi.model.ScheduleReportCollection` has been removed in the Usage service
- Class `com.oracle.bmc.usageapi.model.ScheduleReportSummary` has been removed in the Usage service
- Class `com.oracle.bmc.usageapi.model.UpdateCustomTableDetails` has been removed in the Usage service
- Class `com.oracle.bmc.usageapi.model.UpdateScheduleReportDetails` has been removed in the Usage service

## 2.1.1 - 2021-07-06
### Added
- Support for order activation in the Organizations service
- Support for resource principal authorization on Enterprise Manager bridge resources in the Operations Insights service
- Support for the starter edition license type in the Content and Experience service
- Support for the Generic Artifacts service's new domain name

## 2.1.0 - 2021-06-29
### Added
- Support for the DevOps service
- Support for configuring network security groups for node pools in the Container Engine for Kubernetes service
- Support for optionally specifying CPU core count and data storage size when creating autonomous databases in the Database service
- Support for metastore and initial data asset import/export in the Data Catalog service
- Support for associating domain names to emails and managing email domain names / DKIM in the Email Delivery service
- Support for email domain names on senders and suppressions in the Email Delivery service

### Breaking Changes
- Return type of method `getSortOrder()` in `com.oracle.bmc.email.requests.ListSendersRequest` has been changed to `com.oracle.bmc.email.model.SortOrder` in the Email Delivery service
- Class `com.oracle.bmc.email.requests.ListSendersRequest$SortOrder` has been removed from `com.oracle.bmc.email.requests.ListSendersRequest` in the Email Delivery service
- Return type of method `getSortOrder()` in `com.oracle.bmc.email.requests.ListSuppressionsRequest` has been changed to `com.oracle.bmc.email.model.SortOrder` in the Email Delivery service
- Class `com.oracle.bmc.email.requests.ListSuppressionsRequest$SortOrder` has been removed from `com.oracle.bmc.email.requests.ListSuppressionsRequest` in the Email Delivery service
- Removed field `Displayname` from `com.oracle.bmc.datacatalog.requests.ListJobExecutionsRequest$SortBy` in the Data Catalog service

## 2.0.2 - 2021-06-22
### Added
- Support for virtual machine and bare metal pluggable databases in the Database service

## 2.0.0 - 2021-06-15
### Added
- Support for elastic storage on Exadata Infrastructure resources for Cloud at Customer in the Database service
- Support for registration and management of target databases in the Data Safe service
- Support for config on metadata in the Management Dashboard service
- Support for a new work request operation type for node pool reconciliation events in the Container Engine for Kubernetes service
- Support for migrating clusters with a public Kubernetes API endpoint which are not integrated with a customer's VCN to a VCN-native cluster in the Container Engine for Kubernetes service
- Support for getting the spark version of applications, and filtering applications by spark version, in the Data Flow service

### Breaking Changes
- Usage of Jersey's `ApacheConnectorProvider` by default to send requests to the service. For switching back to Jersey's default `HttpUrlConnectorProvider`, see "ApacheConnector-README"
- Performance issues for APIs that return binary/stream response due to upgrade to Jersey's `ApacheConnectorProvider`. For more details, see "ApacheConnector-README"
- Auto-close behavior for response streams on full-read for APIs that return binary/stream response. For more details, see "ApacheConnector-README"
- Method `public java.util.Map getDefinedTags()` has been removed from the model `com.oracle.bmc.managementdashboard.model.ManagementDashboardExportDetails` in the Management Dashboard service
- Method `public java.util.Map getFreeformTags()` has been removed from the model `com.oracle.bmc.managementdashboard.model.ManagementDashboardExportDetails` in the Management Dashboard service

## 1.37.2 - 2021-06-08
### Added
- Support for Java Management service
- Support for resource principals for the Enterprise Manager bridge resource in Operations Insights service
- Support for encryptionInTransitType in BootVolumeAttachment and IScsiVolumeAttachment in Core service
- Support for updating iscsiLoginState for VolumeAttachment in Core service
- Support for a new type of Source called Import for use with the Export tool in Application Migration service

## 1.37.1 - 2021-06-01
### Added
- Support for configuration of autonomous database KMS keys in the Database service
- Support for creating database software images with any supported RUs in the Database service
- Support for creating database software images from an existing database home in the Database service
- Support for listing all NSGs associated with a given VLAN in the Networking service
- Support for a duration windows, task failure reasons, and next execution times on scheduled tasks in the Logging Analytics service
- Support for calling Oracle Cloud Infrastructure services in the sa-vinhedo-1 region

## 1.37.0 - 2021-05-25
### Added
- Support for the Generic Artifacts service
- Support for the Bastion service
- Support for reading secrets by name in the Vault service
- Support for the isDynamic field when listing definitions in the Limits service
- Support for getting billable image sizes in the Compute service
- Support for getting Automatic Workload Repository (AWR) data on external databases in the Database Management service
- Support for the VM.Standard.E3.Flex flexible compute shape with customizable OCPUs and memory on notebooks in the Data Science service
- Support for container images and generic artifacts billing in the Registry service
- Support for the HCX Enterprise add-on in the VMware Solution service

### Breaking Changes
- Return type of method `public com.oracle.bmc.ocvp.model.SupportedSkuSummary$Name getName()` has been changed to `com.oracle.bmc.ocvp.model.Sku` in the model `SupportedSkuSummary` in the Ocvp service
- Class `com.oracle.bmc.ocvp.model.SupportedSkuSummary$Name` has been removed from the model `SupportedSkuSummary` in the Ocvp service

## 1.36.5 - 2021-05-18
### Added
- Support for spark-submit compatible options in the Data Flow service
- Support for Object Storage as a configuration source in the Resource Manager service

## 1.36.4 - 2021-05-11
### Added
- Support for creating notebook sessions with larger block volumes in the Data Science service
- Support for database maintenance run patch modes in the Database service

## 1.36.3 - 2021-05-04
### Added
- Support for the Operator Access Control service
- Support for the Service Catalog service
- Support for the AI Language service
- Support for autonomous database on Exadata Cloud at Customer infrastructure patching in the Database service

## 1.36.2 - 2021-04-27
### Added
- VCN id parameters were moved from being required to being optional on all list operations in the Networking service
- Support for RACs (real application clusters) for external container, non-container, and pluggable databases in the Database service
- Support for data masking in the Cloud Guard service
- Support for opting out of DNS records during instance launch, as well as attaching secondary VNICs, in the Compute service
- Support for mutable sizes on cluster networks in the Autoscaling service
- Support for auto-tiering on buckets in the Object Storage service

## 1.36.1 - 2021-04-20
### Added
- Support for opting in/out of live migration on instances in the Compute service
- Support for enabling/disabling Operations Insights on external non-container and external pluggable databases in the Database service
- Support for a GraphStudio URL as a connection URL on databases in the Database service
- Support for adding customer contacts on autonomous databases in the Database service
- Support for name annotations on harvested objects in the Data Catalog service

## 1.36.0 - 2021-04-13
### Added
- Support for the Database Migration service
- Support for the Networking Topology service
- Support for getting the id of peered VCNs on local peering gateways in the Networking service
- Support for burstable instances in the Compute service
- Support for preemptible instances in the Compute service
- Support for fractional resource usage and availability in the Limits service
- Support for streaming analytics in the Service Connector Hub service
- Support for flexible routing inside DRGs to enable packet flow between any two attachments in the Networking service
- Support for routing policy to customize dynamic import/export of routes in the Networking service
- Support for IPv6, including on FastConnect and IPsec resources, in the Networking service
- Support for request validation policies in the API Gateway service
- Support for RESP-compliant (e.g. REDIS) response caches, and for configuring response caching per-route in the API Gateway service
- Support for flexible billing in the VMWare Solution service
- Support for new DNS format for the Web Application Acceleration and Security service
- Support for configuring APM tracing on applications and functions in the Functions service
- Support for Enterprise Manager external databases and Management Agent Service managed external databases and hosts in the Operations Insights service
- Support for getting cluster cache metrics for RAC CDB managed databases in the Database Management service

### Breaking Changes
- Method `public java.lang.Boolean getIsInternetAccessAllowed()` has been removed from the model `CreateIpv6Details` in the Core service
- Method `public java.lang.String getIpv6CidrBlock()` has been removed from the model `CreateVcnDetails` in the Core service
- Method `public java.lang.Boolean getIsInternetAccessAllowed()` has been removed from the model `Ipv6` in the Core service
- Method `public java.lang.String getPublicIpAddress()` has been removed from the model `Ipv6` in the Core service
- Method `public java.lang.String getIpv6PublicCidrBlock()` has been removed from the model `Subnet` in the Core service
- Method `public java.lang.Boolean getIsInternetAccessAllowed()` has been removed from the model `UpdateIpv6Details` in the Core service
- Method `public java.lang.String getIpv6CidrBlock()` has been removed from the model `Vcn` in the Core service
- Method `public java.lang.String getIpv6PublicCidrBlock()` has been removed from the model `Vcn` in the Core service
- Method `public com.oracle.bmc.opsi.model.DatabaseInsightSummary$Builder builder()` has been removed from the model `DatabaseInsightSummary` in the Opsi service
- Method `public java.util.Set get__explicitlySet__()` has been removed from the model `DatabaseInsightSummary` in the Opsi service
- Method `public com.oracle.bmc.opsi.model.DatabaseInsightSummary$Builder toBuilder()` has been removed from the model `DatabaseInsightSummary` in the Opsi service
- Accessibility of method `public DatabaseInsightSummary(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.Map, java.util.Map, java.util.Map)` from the model `DatabaseInsightSummary` in Opsi service has been decreased from public to protected

## 1.35.1 - 2021-04-06
### Added
- Support for scheduling the suspension and resumption of compute instance pools based on predefined schedules in the Autoscaling service
- Support for database software images for Cloud@Customer in the Database service
- Support for OCIC IDCS authorization details in the Application Migration service
- Support for cross-region asynchronous volume replication in the Block Storage service
- Support for SDK generation in the API Gateway service
- Support for container image signing in the Registry service
- Support for cluster features as a part of the Container Engine for Kubernetes service
- Support for filtering dedicated virtual machine hosts by remaining memory and OCPUs in the Compute service
- Support for read/write-any object from buckets using pre-authenticated requests in the Object Storage service
- Support for restricting pre-authenticated requests by prefix in the Object Storage service
- Support for route filtering on public virtual circuits in the Virtual Networking service

## 1.35.0 - 2021-03-30
### Added
- Support for the Vulnerability Scanning service
- Support for vSphere 7.0 in the VMware Solution service
- Support for forecasting in the Usage service
- Support for viewing, searching, and modifying parameters for on-premise Oracle databases in the Database Management service
- Support for listing tablespaces of managed databases in the Database Management service
- Support for cross-regional replication of keys in the Key Management service
- Support for highly-available database systems in the MySQL Database service
- Support for Oracle Enterprise Manager bridges, source auto-association, source event type mappings, and plugins to upload data in the Logging Analytics service

### Breaking Changes
- Renamed field `Succesful` to `Successful` from enum `Status` of request `ListLookupsRequest` in the Logging Analytics service
- Renamed field `ForcastType` to `ForecastType` from the model `Forecast` in the Usage service

## 1.34.0 - 2021-03-23
### Added
- Support for the Network Load Balancing service
- Support for maintenance runs on autonomous databases in the Database service
- Support for announcement preferences in the Announcements service
- Support for domain claiming in the Organizations service
- Support for saved reports in the Usage service
- Support for the HeatWave in-memory analytics accelerator in the MySQL Database service
- Support for community applications in the Marketplace service
- Support for capacity reservations in the Compute service

### Breaking Changes
- Method `getCompartmentId()` is removed from `ListWorkRequestErrorsRequest` of `tenantmanagercontrolplane` service
- Method `getCompartmentId()` is removed from `ListWorkRequestLogsRequest` of `tenantmanagercontrolplane` service
- Value of Enum attribute `Operator` in Usage API service defaults to `UnknownEnumValue` when it receives an invalid value. In the earlier versions, this raises a `Invalid Operator` error

## 1.33.2 - 2021-03-16
### Added
- Support for routing policies and HTTP2 listener protocols in the Load Balancing service
- Support for model deployments in the Data Science service
- Support for private clusters in the Container Engine for Kubernetes service
- Support for updating an instance's usage type in the Content and Experience service

## 1.33.1 - 2021-03-09
### Added
- Support for the Application Performance Monitoring service
- Support for the Golden Gate service
- Support for SMS subscriptions in the Notifications service
- Support for friendly-formatted messages in the Service Connector Hub service
- Support for attaching and detaching instances to instance pools in the Autoscaling service

## 1.33.0 - 2021-03-02
### Added
- Support for pipelines, pipeline tasks, and favorites in the Data Integration service
- Support for publishing tasks to OCI Data Flow in the Data Integration service
- Support for clones in the File Storage service

### Breaking Changes
- Removed fields `PrimaryKey` and `UniqueKey` from enum `ModelType` of model `Key` in the Data Integration service

## 1.32.2 - 2021-02-23
### Added
- Support for the OCI Registry service
- Support for exporting an existing running VM, or a copy of VM, into a VMDK, QCOW2, VDI, VHD, or OCI formatted image in the Compute service
- Support for platform configurations on instances in the Compute service
- Support for providing target tags and target compartments on profiles in the Optimizer service
- Support for the 'Fix it' feature in the Optimizer service

## 1.32.1 - 2021-02-16
### Added
- Support for scan DNS names and zone ids on database system, cloud VM cluster, and autonomous Exadata infrastructure responses in the Database service
- Support for specifying ACL rules to limit ingress into public load balancers in the Integration service
- Support for Cloud at Customer as a source type in the Application Migration service
- Support for selective migration of specific resources in the Application Migration service

## 1.32.0 - 2021-02-09
### Added
- Support for the Database Management service
- Support for setting an offset for budget processing in the Budgets service
- Support for enabling and disabling Oracle Cloud Agent plugins in the Compute service
- Support for listing available plugins and for getting the status of plugins in the Oracle Cloud Agent service
- Support for one-off patching in autonomous transaction processing - dedicated databases in the Database service
- Support for additional database upgrade options in the Database service
- Support for glossary term recommendations in the Data Catalog service
- Support for listing errata in the OS Management service

### Breaking Changes
- Model `InstanceAgentCommandContentInfo` is removed from Compute Instance Agent service
- Model `InstallationRequirements` is removed from OS Management service

## 1.31.0 - 2021-02-02
### Added
- Support for checking if a contact for Exadata infrastructure is valid in My Oracle Support in the Database service
- Support for checking if Exadata infrastructure is in a degraded state in the Database service
- Support for updating the operating system on a VM cluster in the Database service
- Support for external databases in the Database service
- Support for uploading objects to the infrequent access storage tier in the Object Storage service
- Support for changing the storage tier of existing objects in the Object Storage service
- Support for private templates in the Resource Manager service
- Support for multiple encryption domains on IPSec tunnels in the Networking service

### Breaking Changes
 - The return type of method `getArchivalState()` in `com.oracle.bmc.objectstorage.responses.GetObjectResponse` has been changed to `com.oracle.bmc.objectstorage.model.ArchivalState` in the Object Storage service
 - The return type of method `getArchivalState()` in `com.oracle.bmc.objectstorage.responses.HeadObjectResponse` has been changed to `com.oracle.bmc.objectstorage.model.ArchivalState ` in the Object Storage service
 - The method `public java.lang.String getEtag()` has been removed from `com.oracle.bmc.core.responses.ListAppCatalogListingResourceVersionsResponse` in the Core service

## 1.30.1 - 2021-01-26
### Added
- Support for creating, managing, and using asymmetric keys in the Key Management service
- Support for peer ACD unique names in Exadata Cloud at Customer in the Database service
- Support for ACLs on autonomous databases in Exadata Cloud at Customer Data Guard in the Database service
- Support for drift detection on individual resources of a stack in the Resource Manager service
- Support for private access channels and vanity URLs in the Analytics Cloud service
- Support for updating load balancer shapes in the Blockchain Platform service
- Support for assigning volume backup policies to volume groups in the Block Volume service

## 1.30.0 - 2021-01-19
### Added
- Support for Logging Analytics as a target in the Service Connector Hub service
- Support for lookups, agent collection warnings, task commands, and data archive/recall in the Logging Analytics service

### Fixed
- Fixed a bug in the endpoint used for the Management Dashboard service

### Breaking Changes
- Parameter `sortBy` in requests `ListMetaSourceTypesRequest`, `ListParserFunctionsRequest`, `ListParserMetaPluginsRequest`, `ListSourceLabelOperatorsRequest`, `ListSourceMetaFunctionsRequest` has changed its datatype from `String` to `SortBy` enum in the Logging Analytics service
- Parameter `lifecycleState` in `LogAnalyticsObjectCollectionRule` has changed its datatype from `LogAnalyticsObjectCollectionRule.LifecycleState` to `ObjectCollectionRuleLifecycleStates` in the Logging Analytics Service
- Methods `builder()`, `toBuilder()`, and `get__explicitlySet__()` has been removed from `UpdateScheduledTaskDetails` in the Logging Analytics Service
- Methods `builder()`, `toBuilder()`, and `get__explicitlySet__()` has been removed from `ScheduledTask` in the Logging Analytics Service

## 1.29.0 - 2021-01-12
### Added
- Support for auto-scaling in the Big Data service
- Documentation fixes for the Logging Search service

### Breaking Changes
- Removed `Starting` and `Stopping` values from enum `LifecycleState` of model `Node` in the Big Data service
- Removed `UpdatingInfra` value from enum `LifecycleState` of model `BdsInstance` in the Big Data service

## 1.28.0 - 2020-12-15
### Added
- Support for filtering listKeys based on KeyShape in KeyManagement service
- Support for the Oracle Roving Edge Infrastructure service
- Support for flexible ShapeDetails in Load Balancer service
- Support for listing of harvested Rules, additional filtering for Logical Entity list calls in Data Catalog service
- Support second level domain for audit SDK
- Support for listing flex components in Database service
- Support for APEX service for ADBS on OCI console for Database service
- Support for Customer-Managed Key features as a part of the Database service
- Support for Github configuration source provider as part of the Resource Manager service

### Breaking Changes
- The following deprecated API methods have been removed from the Database Service : `createAutonomousDataWarehouse`,`createAutonomousDataWarehouseBackup`,`deleteAutonomousDataWarehouse`,`generateAutonomousDataWarehouseWallet`,`getAutonomousDataWarehouse`,`getAutonomousDataWarehouseBackup`,`listAutonomousDataWarehouseBackups`,`listAutonomousDataWarehouses`,`restoreAutonomousDataWarehouse`,`startAutonomousDataWarehouse`,`stopAutonomousDataWarehouse`,`updateAutonomousDataWarehouse`

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
