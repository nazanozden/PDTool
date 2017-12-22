
package com.compositesw.services.system.admin;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import com.compositesw.services.system.admin.user.DomainList;
import com.compositesw.services.system.admin.user.DomainMemberReferenceList;
import com.compositesw.services.system.admin.user.DomainTypeList;
import com.compositesw.services.system.admin.user.DomainTypeValue;
import com.compositesw.services.system.admin.user.GroupList;
import com.compositesw.services.system.admin.user.ScopeValue;
import com.compositesw.services.system.admin.user.User;
import com.compositesw.services.system.admin.user.UserList;
import com.compositesw.services.system.util.common.AttributeDefList;
import com.compositesw.services.system.util.common.AttributeList;
import com.compositesw.services.system.util.common.DetailLevel;
import com.compositesw.services.system.util.common.NameList;
import com.compositesw.services.system.util.common.OperationStatus;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.1-b01-
 * Generated source version: 2.2
 * 
 */
@WebService(name = "userPortType", targetNamespace = "http://www.compositesw.com/services/system/admin")
@XmlSeeAlso({
    com.compositesw.services.system.admin.server.ObjectFactory.class,
    com.compositesw.services.system.admin.resource.ObjectFactory.class,
    com.compositesw.services.system.admin.archive.ObjectFactory.class,
    com.compositesw.services.system.admin.execute.ObjectFactory.class,
    com.compositesw.services.system.util.common.ObjectFactory.class,
    com.compositesw.services.system.util.security.ObjectFactory.class,
    com.compositesw.services.system.admin.user.ObjectFactory.class
})
public interface UserPortType {


    /**
     * 
     * @param groupNames
     * @param domainName
     * @param userName
     * @throws AddUserToGroupsSoapFault
     */
    @WebMethod(action = "addUserToGroups")
    @RequestWrapper(localName = "addUserToGroups", targetNamespace = "http://www.compositesw.com/services/system/admin/user", className = "com.compositesw.services.system.admin.user.AddUserToGroupsRequest")
    @ResponseWrapper(localName = "addUserToGroupsResponse", targetNamespace = "http://www.compositesw.com/services/system/admin/user", className = "com.compositesw.services.system.admin.user.AddUserToGroupsResponse")
    public void addUserToGroups(
        @WebParam(name = "domainName", targetNamespace = "http://www.compositesw.com/services/system/admin/user")
        String domainName,
        @WebParam(name = "userName", targetNamespace = "http://www.compositesw.com/services/system/admin/user")
        String userName,
        @WebParam(name = "groupNames", targetNamespace = "http://www.compositesw.com/services/system/admin/user")
        DomainMemberReferenceList groupNames)
        throws AddUserToGroupsSoapFault
    ;

    /**
     * 
     * @param groupName
     * @param domainName
     * @param userNames
     * @throws AddUsersToGroupSoapFault
     */
    @WebMethod(action = "addUsersToGroup")
    @RequestWrapper(localName = "addUsersToGroup", targetNamespace = "http://www.compositesw.com/services/system/admin/user", className = "com.compositesw.services.system.admin.user.AddUsersToGroupRequest")
    @ResponseWrapper(localName = "addUsersToGroupResponse", targetNamespace = "http://www.compositesw.com/services/system/admin/user", className = "com.compositesw.services.system.admin.user.AddUsersToGroupResponse")
    public void addUsersToGroup(
        @WebParam(name = "domainName", targetNamespace = "http://www.compositesw.com/services/system/admin/user")
        String domainName,
        @WebParam(name = "groupName", targetNamespace = "http://www.compositesw.com/services/system/admin/user")
        String groupName,
        @WebParam(name = "userNames", targetNamespace = "http://www.compositesw.com/services/system/admin/user")
        DomainMemberReferenceList userNames)
        throws AddUsersToGroupSoapFault
    ;

    /**
     * 
     * @param domainName
     * @return
     *     returns com.compositesw.services.system.util.common.OperationStatus
     * @throws CancelCreateDomainSoapFault
     */
    @WebMethod(action = "cancelCreateDomain")
    @WebResult(name = "status", targetNamespace = "http://www.compositesw.com/services/system/admin/user")
    @RequestWrapper(localName = "cancelCreateDomain", targetNamespace = "http://www.compositesw.com/services/system/admin/user", className = "com.compositesw.services.system.admin.user.CancelCreateDomainRequest")
    @ResponseWrapper(localName = "cancelCreateDomainResponse", targetNamespace = "http://www.compositesw.com/services/system/admin/user", className = "com.compositesw.services.system.admin.user.CancelCreateDomainResponse")
    public OperationStatus cancelCreateDomain(
        @WebParam(name = "domainName", targetNamespace = "http://www.compositesw.com/services/system/admin/user")
        String domainName)
        throws CancelCreateDomainSoapFault
    ;

    /**
     * 
     * @param annotation
     * @param isBlocking
     * @param domainType
     * @param domainName
     * @param attributes
     * @return
     *     returns com.compositesw.services.system.util.common.OperationStatus
     * @throws CreateDomainSoapFault
     */
    @WebMethod(action = "createDomain")
    @WebResult(name = "status", targetNamespace = "http://www.compositesw.com/services/system/admin/user")
    @RequestWrapper(localName = "createDomain", targetNamespace = "http://www.compositesw.com/services/system/admin/user", className = "com.compositesw.services.system.admin.user.CreateDomainRequest")
    @ResponseWrapper(localName = "createDomainResponse", targetNamespace = "http://www.compositesw.com/services/system/admin/user", className = "com.compositesw.services.system.admin.user.CreateDomainResponse")
    public OperationStatus createDomain(
        @WebParam(name = "domainName", targetNamespace = "http://www.compositesw.com/services/system/admin/user")
        String domainName,
        @WebParam(name = "domainType", targetNamespace = "http://www.compositesw.com/services/system/admin/user")
        DomainTypeValue domainType,
        @WebParam(name = "isBlocking", targetNamespace = "http://www.compositesw.com/services/system/admin/user")
        boolean isBlocking,
        @WebParam(name = "annotation", targetNamespace = "http://www.compositesw.com/services/system/admin/user")
        String annotation,
        @WebParam(name = "attributes", targetNamespace = "http://www.compositesw.com/services/system/admin/user")
        AttributeList attributes)
        throws CreateDomainSoapFault
    ;

    /**
     * 
     * @param annotation
     * @param groupName
     * @param explicitRights
     * @param domainName
     * @throws CreateGroupSoapFault
     */
    @WebMethod(action = "createGroup")
    @RequestWrapper(localName = "createGroup", targetNamespace = "http://www.compositesw.com/services/system/admin/user", className = "com.compositesw.services.system.admin.user.CreateGroupRequest")
    @ResponseWrapper(localName = "createGroupResponse", targetNamespace = "http://www.compositesw.com/services/system/admin/user", className = "com.compositesw.services.system.admin.user.CreateGroupResponse")
    public void createGroup(
        @WebParam(name = "domainName", targetNamespace = "http://www.compositesw.com/services/system/admin/user")
        String domainName,
        @WebParam(name = "groupName", targetNamespace = "http://www.compositesw.com/services/system/admin/user")
        String groupName,
        @WebParam(name = "explicitRights", targetNamespace = "http://www.compositesw.com/services/system/admin/user")
        String explicitRights,
        @WebParam(name = "annotation", targetNamespace = "http://www.compositesw.com/services/system/admin/user")
        String annotation)
        throws CreateGroupSoapFault
    ;

    /**
     * 
     * @param annotation
     * @param password
     * @param explicitRights
     * @param domainName
     * @param userName
     * @throws CreateUserSoapFault
     */
    @WebMethod(action = "createUser")
    @RequestWrapper(localName = "createUser", targetNamespace = "http://www.compositesw.com/services/system/admin/user", className = "com.compositesw.services.system.admin.user.CreateUserRequest")
    @ResponseWrapper(localName = "createUserResponse", targetNamespace = "http://www.compositesw.com/services/system/admin/user", className = "com.compositesw.services.system.admin.user.CreateUserResponse")
    public void createUser(
        @WebParam(name = "domainName", targetNamespace = "http://www.compositesw.com/services/system/admin/user")
        String domainName,
        @WebParam(name = "userName", targetNamespace = "http://www.compositesw.com/services/system/admin/user")
        String userName,
        @WebParam(name = "password", targetNamespace = "http://www.compositesw.com/services/system/admin/user")
        String password,
        @WebParam(name = "explicitRights", targetNamespace = "http://www.compositesw.com/services/system/admin/user")
        String explicitRights,
        @WebParam(name = "annotation", targetNamespace = "http://www.compositesw.com/services/system/admin/user")
        String annotation)
        throws CreateUserSoapFault
    ;

    /**
     * 
     * @param domainName
     * @throws DestroyDomainSoapFault
     */
    @WebMethod(action = "destroyDomain")
    @RequestWrapper(localName = "destroyDomain", targetNamespace = "http://www.compositesw.com/services/system/admin/user", className = "com.compositesw.services.system.admin.user.DestroyDomainRequest")
    @ResponseWrapper(localName = "destroyDomainResponse", targetNamespace = "http://www.compositesw.com/services/system/admin/user", className = "com.compositesw.services.system.admin.user.DestroyDomainResponse")
    public void destroyDomain(
        @WebParam(name = "domainName", targetNamespace = "http://www.compositesw.com/services/system/admin/user")
        String domainName)
        throws DestroyDomainSoapFault
    ;

    /**
     * 
     * @param groupName
     * @param domainName
     * @throws DestroyGroupSoapFault
     */
    @WebMethod(action = "destroyGroup")
    @RequestWrapper(localName = "destroyGroup", targetNamespace = "http://www.compositesw.com/services/system/admin/user", className = "com.compositesw.services.system.admin.user.DestroyGroupRequest")
    @ResponseWrapper(localName = "destroyGroupResponse", targetNamespace = "http://www.compositesw.com/services/system/admin/user", className = "com.compositesw.services.system.admin.user.DestroyGroupResponse")
    public void destroyGroup(
        @WebParam(name = "domainName", targetNamespace = "http://www.compositesw.com/services/system/admin/user")
        String domainName,
        @WebParam(name = "groupName", targetNamespace = "http://www.compositesw.com/services/system/admin/user")
        String groupName)
        throws DestroyGroupSoapFault
    ;

    /**
     * 
     * @param domainName
     * @param userName
     * @throws DestroyUserSoapFault
     */
    @WebMethod(action = "destroyUser")
    @RequestWrapper(localName = "destroyUser", targetNamespace = "http://www.compositesw.com/services/system/admin/user", className = "com.compositesw.services.system.admin.user.DestroyUserRequest")
    @ResponseWrapper(localName = "destroyUserResponse", targetNamespace = "http://www.compositesw.com/services/system/admin/user", className = "com.compositesw.services.system.admin.user.DestroyUserResponse")
    public void destroyUser(
        @WebParam(name = "domainName", targetNamespace = "http://www.compositesw.com/services/system/admin/user")
        String domainName,
        @WebParam(name = "userName", targetNamespace = "http://www.compositesw.com/services/system/admin/user")
        String userName)
        throws DestroyUserSoapFault
    ;

    /**
     * 
     * @param domainName
     * @param scope
     * @return
     *     returns com.compositesw.services.system.admin.user.GroupList
     * @throws GetDomainGroupsSoapFault
     */
    @WebMethod(action = "getDomainGroups")
    @WebResult(name = "groups", targetNamespace = "http://www.compositesw.com/services/system/admin/user")
    @RequestWrapper(localName = "getDomainGroups", targetNamespace = "http://www.compositesw.com/services/system/admin/user", className = "com.compositesw.services.system.admin.user.GetDomainGroupsRequest")
    @ResponseWrapper(localName = "getDomainGroupsResponse", targetNamespace = "http://www.compositesw.com/services/system/admin/user", className = "com.compositesw.services.system.admin.user.GetDomainGroupsResponse")
    public GroupList getDomainGroups(
        @WebParam(name = "domainName", targetNamespace = "http://www.compositesw.com/services/system/admin/user")
        String domainName,
        @WebParam(name = "scope", targetNamespace = "http://www.compositesw.com/services/system/admin/user")
        ScopeValue scope)
        throws GetDomainGroupsSoapFault
    ;

    /**
     * 
     * @param domainType
     * @return
     *     returns com.compositesw.services.system.util.common.AttributeDefList
     * @throws GetDomainTypeAttributeDefsSoapFault
     */
    @WebMethod(action = "getDomainTypeAttributeDefs")
    @WebResult(name = "attributeDefs", targetNamespace = "http://www.compositesw.com/services/system/admin/user")
    @RequestWrapper(localName = "getDomainTypeAttributeDefs", targetNamespace = "http://www.compositesw.com/services/system/admin/user", className = "com.compositesw.services.system.admin.user.GetDomainTypeAttributeDefsRequest")
    @ResponseWrapper(localName = "getDomainTypeAttributeDefsResponse", targetNamespace = "http://www.compositesw.com/services/system/admin/user", className = "com.compositesw.services.system.admin.user.GetDomainTypeAttributeDefsResponse")
    public AttributeDefList getDomainTypeAttributeDefs(
        @WebParam(name = "domainType", targetNamespace = "http://www.compositesw.com/services/system/admin/user")
        String domainType)
        throws GetDomainTypeAttributeDefsSoapFault
    ;

    /**
     * 
     * @return
     *     returns com.compositesw.services.system.admin.user.DomainTypeList
     * @throws GetDomainTypesSoapFault
     */
    @WebMethod(action = "getDomainTypes")
    @WebResult(name = "domainTypes", targetNamespace = "http://www.compositesw.com/services/system/admin/user")
    @RequestWrapper(localName = "getDomainTypes", targetNamespace = "http://www.compositesw.com/services/system/admin/user", className = "com.compositesw.services.system.admin.user.GetDomainTypesRequest")
    @ResponseWrapper(localName = "getDomainTypesResponse", targetNamespace = "http://www.compositesw.com/services/system/admin/user", className = "com.compositesw.services.system.admin.user.GetDomainTypesResponse")
    public DomainTypeList getDomainTypes()
        throws GetDomainTypesSoapFault
    ;

    /**
     * 
     * @param domainName
     * @param scope
     * @return
     *     returns com.compositesw.services.system.admin.user.UserList
     * @throws GetDomainUsersSoapFault
     */
    @WebMethod(action = "getDomainUsers")
    @WebResult(name = "users", targetNamespace = "http://www.compositesw.com/services/system/admin/user")
    @RequestWrapper(localName = "getDomainUsers", targetNamespace = "http://www.compositesw.com/services/system/admin/user", className = "com.compositesw.services.system.admin.user.GetDomainUsersRequest")
    @ResponseWrapper(localName = "getDomainUsersResponse", targetNamespace = "http://www.compositesw.com/services/system/admin/user", className = "com.compositesw.services.system.admin.user.GetDomainUsersResponse")
    public UserList getDomainUsers(
        @WebParam(name = "domainName", targetNamespace = "http://www.compositesw.com/services/system/admin/user")
        String domainName,
        @WebParam(name = "scope", targetNamespace = "http://www.compositesw.com/services/system/admin/user")
        ScopeValue scope)
        throws GetDomainUsersSoapFault
    ;

    /**
     * 
     * @param detail
     * @return
     *     returns com.compositesw.services.system.admin.user.DomainList
     * @throws GetDomainsSoapFault
     */
    @WebMethod(action = "getDomains")
    @WebResult(name = "domains", targetNamespace = "http://www.compositesw.com/services/system/admin/user")
    @RequestWrapper(localName = "getDomains", targetNamespace = "http://www.compositesw.com/services/system/admin/user", className = "com.compositesw.services.system.admin.user.GetDomainsRequest")
    @ResponseWrapper(localName = "getDomainsResponse", targetNamespace = "http://www.compositesw.com/services/system/admin/user", className = "com.compositesw.services.system.admin.user.GetDomainsResponse")
    public DomainList getDomains(
        @WebParam(name = "detail", targetNamespace = "http://www.compositesw.com/services/system/admin/user")
        DetailLevel detail)
        throws GetDomainsSoapFault
    ;

    /**
     * 
     * @param names
     * @param domainName
     * @return
     *     returns com.compositesw.services.system.admin.user.GroupList
     * @throws GetGroupsSoapFault
     */
    @WebMethod(action = "getGroups")
    @WebResult(name = "groups", targetNamespace = "http://www.compositesw.com/services/system/admin/user")
    @RequestWrapper(localName = "getGroups", targetNamespace = "http://www.compositesw.com/services/system/admin/user", className = "com.compositesw.services.system.admin.user.GetGroupsRequest")
    @ResponseWrapper(localName = "getGroupsResponse", targetNamespace = "http://www.compositesw.com/services/system/admin/user", className = "com.compositesw.services.system.admin.user.GetGroupsResponse")
    public GroupList getGroups(
        @WebParam(name = "domainName", targetNamespace = "http://www.compositesw.com/services/system/admin/user")
        String domainName,
        @WebParam(name = "names", targetNamespace = "http://www.compositesw.com/services/system/admin/user")
        NameList names)
        throws GetGroupsSoapFault
    ;

    /**
     * 
     * @param domainName
     * @param userName
     * @return
     *     returns com.compositesw.services.system.admin.user.GroupList
     * @throws GetGroupsByUserSoapFault
     */
    @WebMethod(action = "getGroupsByUser")
    @WebResult(name = "groups", targetNamespace = "http://www.compositesw.com/services/system/admin/user")
    @RequestWrapper(localName = "getGroupsByUser", targetNamespace = "http://www.compositesw.com/services/system/admin/user", className = "com.compositesw.services.system.admin.user.GetGroupsByUserRequest")
    @ResponseWrapper(localName = "getGroupsByUserResponse", targetNamespace = "http://www.compositesw.com/services/system/admin/user", className = "com.compositesw.services.system.admin.user.GetGroupsByUserResponse")
    public GroupList getGroupsByUser(
        @WebParam(name = "userName", targetNamespace = "http://www.compositesw.com/services/system/admin/user")
        String userName,
        @WebParam(name = "domainName", targetNamespace = "http://www.compositesw.com/services/system/admin/user")
        String domainName)
        throws GetGroupsByUserSoapFault
    ;

    /**
     * 
     * @return
     *     returns com.compositesw.services.system.admin.user.User
     * @throws GetUserSoapFault
     */
    @WebMethod(action = "getUser")
    @WebResult(name = "user", targetNamespace = "http://www.compositesw.com/services/system/admin/user")
    @RequestWrapper(localName = "getUser", targetNamespace = "http://www.compositesw.com/services/system/admin/user", className = "com.compositesw.services.system.admin.user.GetUserRequest")
    @ResponseWrapper(localName = "getUserResponse", targetNamespace = "http://www.compositesw.com/services/system/admin/user", className = "com.compositesw.services.system.admin.user.GetUserResponse")
    public User getUser()
        throws GetUserSoapFault
    ;

    /**
     * 
     * @param names
     * @param domainName
     * @return
     *     returns com.compositesw.services.system.admin.user.UserList
     * @throws GetUsersSoapFault
     */
    @WebMethod(action = "getUsers")
    @WebResult(name = "users", targetNamespace = "http://www.compositesw.com/services/system/admin/user")
    @RequestWrapper(localName = "getUsers", targetNamespace = "http://www.compositesw.com/services/system/admin/user", className = "com.compositesw.services.system.admin.user.GetUsersRequest")
    @ResponseWrapper(localName = "getUsersResponse", targetNamespace = "http://www.compositesw.com/services/system/admin/user", className = "com.compositesw.services.system.admin.user.GetUsersResponse")
    public UserList getUsers(
        @WebParam(name = "domainName", targetNamespace = "http://www.compositesw.com/services/system/admin/user")
        String domainName,
        @WebParam(name = "names", targetNamespace = "http://www.compositesw.com/services/system/admin/user")
        NameList names)
        throws GetUsersSoapFault
    ;

    /**
     * 
     * @param groupName
     * @param domainName
     * @return
     *     returns com.compositesw.services.system.admin.user.UserList
     * @throws GetUsersByGroupSoapFault
     */
    @WebMethod(action = "getUsersByGroup")
    @WebResult(name = "users", targetNamespace = "http://www.compositesw.com/services/system/admin/user")
    @RequestWrapper(localName = "getUsersByGroup", targetNamespace = "http://www.compositesw.com/services/system/admin/user", className = "com.compositesw.services.system.admin.user.GetUsersByGroupRequest")
    @ResponseWrapper(localName = "getUsersByGroupResponse", targetNamespace = "http://www.compositesw.com/services/system/admin/user", className = "com.compositesw.services.system.admin.user.GetUsersByGroupResponse")
    public UserList getUsersByGroup(
        @WebParam(name = "groupName", targetNamespace = "http://www.compositesw.com/services/system/admin/user")
        String groupName,
        @WebParam(name = "domainName", targetNamespace = "http://www.compositesw.com/services/system/admin/user")
        String domainName)
        throws GetUsersByGroupSoapFault
    ;

    /**
     * 
     * @param groupNames
     * @param domainName
     * @param userName
     * @throws RemoveUserFromGroupsSoapFault
     */
    @WebMethod(action = "removeUserFromGroups")
    @RequestWrapper(localName = "removeUserFromGroups", targetNamespace = "http://www.compositesw.com/services/system/admin/user", className = "com.compositesw.services.system.admin.user.RemoveUserFromGroupsRequest")
    @ResponseWrapper(localName = "removeUserFromGroupsResponse", targetNamespace = "http://www.compositesw.com/services/system/admin/user", className = "com.compositesw.services.system.admin.user.RemoveUserFromGroupsResponse")
    public void removeUserFromGroups(
        @WebParam(name = "domainName", targetNamespace = "http://www.compositesw.com/services/system/admin/user")
        String domainName,
        @WebParam(name = "userName", targetNamespace = "http://www.compositesw.com/services/system/admin/user")
        String userName,
        @WebParam(name = "groupNames", targetNamespace = "http://www.compositesw.com/services/system/admin/user")
        DomainMemberReferenceList groupNames)
        throws RemoveUserFromGroupsSoapFault
    ;

    /**
     * 
     * @param groupName
     * @param domainName
     * @param userNames
     * @throws RemoveUsersFromGroupSoapFault
     */
    @WebMethod(action = "removeUsersFromGroup")
    @RequestWrapper(localName = "removeUsersFromGroup", targetNamespace = "http://www.compositesw.com/services/system/admin/user", className = "com.compositesw.services.system.admin.user.RemoveUsersFromGroupRequest")
    @ResponseWrapper(localName = "removeUsersFromGroupResponse", targetNamespace = "http://www.compositesw.com/services/system/admin/user", className = "com.compositesw.services.system.admin.user.RemoveUsersFromGroupResponse")
    public void removeUsersFromGroup(
        @WebParam(name = "domainName", targetNamespace = "http://www.compositesw.com/services/system/admin/user")
        String domainName,
        @WebParam(name = "groupName", targetNamespace = "http://www.compositesw.com/services/system/admin/user")
        String groupName,
        @WebParam(name = "userNames", targetNamespace = "http://www.compositesw.com/services/system/admin/user")
        DomainMemberReferenceList userNames)
        throws RemoveUsersFromGroupSoapFault
    ;

    /**
     * 
     * @param annotation
     * @param domainName
     * @param attributes
     * @throws UpdateDomainSoapFault
     */
    @WebMethod(action = "updateDomain")
    @RequestWrapper(localName = "updateDomain", targetNamespace = "http://www.compositesw.com/services/system/admin/user", className = "com.compositesw.services.system.admin.user.UpdateDomainRequest")
    @ResponseWrapper(localName = "updateDomainResponse", targetNamespace = "http://www.compositesw.com/services/system/admin/user", className = "com.compositesw.services.system.admin.user.UpdateDomainResponse")
    public void updateDomain(
        @WebParam(name = "domainName", targetNamespace = "http://www.compositesw.com/services/system/admin/user")
        String domainName,
        @WebParam(name = "annotation", targetNamespace = "http://www.compositesw.com/services/system/admin/user")
        String annotation,
        @WebParam(name = "attributes", targetNamespace = "http://www.compositesw.com/services/system/admin/user")
        AttributeList attributes)
        throws UpdateDomainSoapFault
    ;

    /**
     * 
     * @param annotation
     * @param groupName
     * @param explicitRights
     * @param domainName
     * @param userNames
     * @throws UpdateGroupSoapFault
     */
    @WebMethod(action = "updateGroup")
    @RequestWrapper(localName = "updateGroup", targetNamespace = "http://www.compositesw.com/services/system/admin/user", className = "com.compositesw.services.system.admin.user.UpdateGroupRequest")
    @ResponseWrapper(localName = "updateGroupResponse", targetNamespace = "http://www.compositesw.com/services/system/admin/user", className = "com.compositesw.services.system.admin.user.UpdateGroupResponse")
    public void updateGroup(
        @WebParam(name = "domainName", targetNamespace = "http://www.compositesw.com/services/system/admin/user")
        String domainName,
        @WebParam(name = "groupName", targetNamespace = "http://www.compositesw.com/services/system/admin/user")
        String groupName,
        @WebParam(name = "userNames", targetNamespace = "http://www.compositesw.com/services/system/admin/user")
        DomainMemberReferenceList userNames,
        @WebParam(name = "explicitRights", targetNamespace = "http://www.compositesw.com/services/system/admin/user")
        String explicitRights,
        @WebParam(name = "annotation", targetNamespace = "http://www.compositesw.com/services/system/admin/user")
        String annotation)
        throws UpdateGroupSoapFault
    ;

    /**
     * 
     * @param groupNames
     * @param annotation
     * @param password
     * @param explicitRights
     * @param oldPassword
     * @param domainName
     * @param userName
     * @throws UpdateUserSoapFault
     */
    @WebMethod(action = "updateUser")
    @RequestWrapper(localName = "updateUser", targetNamespace = "http://www.compositesw.com/services/system/admin/user", className = "com.compositesw.services.system.admin.user.UpdateUserRequest")
    @ResponseWrapper(localName = "updateUserResponse", targetNamespace = "http://www.compositesw.com/services/system/admin/user", className = "com.compositesw.services.system.admin.user.UpdateUserResponse")
    public void updateUser(
        @WebParam(name = "domainName", targetNamespace = "http://www.compositesw.com/services/system/admin/user")
        String domainName,
        @WebParam(name = "userName", targetNamespace = "http://www.compositesw.com/services/system/admin/user")
        String userName,
        @WebParam(name = "oldPassword", targetNamespace = "http://www.compositesw.com/services/system/admin/user")
        String oldPassword,
        @WebParam(name = "password", targetNamespace = "http://www.compositesw.com/services/system/admin/user")
        String password,
        @WebParam(name = "groupNames", targetNamespace = "http://www.compositesw.com/services/system/admin/user")
        DomainMemberReferenceList groupNames,
        @WebParam(name = "explicitRights", targetNamespace = "http://www.compositesw.com/services/system/admin/user")
        String explicitRights,
        @WebParam(name = "annotation", targetNamespace = "http://www.compositesw.com/services/system/admin/user")
        String annotation)
        throws UpdateUserSoapFault
    ;

    /**
     * 
     * @param lockUser
     * @param userName
     * @return
     *     returns java.lang.String
     * @throws UpdateUserLockStateSoapFault
     */
    @WebMethod(action = "updateUserLockState")
    @WebResult(name = "locked", targetNamespace = "http://www.compositesw.com/services/system/admin/user")
    @RequestWrapper(localName = "updateUserLockState", targetNamespace = "http://www.compositesw.com/services/system/admin/user", className = "com.compositesw.services.system.admin.user.UpdateUserLockStateRequest")
    @ResponseWrapper(localName = "updateUserLockStateResponse", targetNamespace = "http://www.compositesw.com/services/system/admin/user", className = "com.compositesw.services.system.admin.user.UpdateUserLockStateResponse")
    public String updateUserLockState(
        @WebParam(name = "userName", targetNamespace = "http://www.compositesw.com/services/system/admin/user")
        String userName,
        @WebParam(name = "lockUser", targetNamespace = "http://www.compositesw.com/services/system/admin/user")
        String lockUser)
        throws UpdateUserLockStateSoapFault
    ;

}
