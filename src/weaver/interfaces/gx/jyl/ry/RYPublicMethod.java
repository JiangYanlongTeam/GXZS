package weaver.interfaces.gx.jyl.ry;

import java.rmi.RemoteException;

import jsgx_mdm_hr.beans.ws.mdm.sap.com.*;
import weaver.conn.RecordSet;
import weaver.general.BaseBean;
import JSGX_MDM_HRWsd.JSGX_MDM_HRViProxy;
import beans.core.mdm.sap.com.RepositoryInformation;
import beans.ws.mdm.sap.com.BasicRecordIdentification;
import beans.ws.mdm.sap.com.ExecutionStatus;
import beans.ws.mdm.sap.com.TextConstraint;
import beans.ws.mdm.sap.com.TextCriteria;

/**
 * 人员公共方法
 */
public class RYPublicMethod extends BaseBean {
    
    /**
     * 查找单位行业标识
     * 
     * @param disvalue
     * @param proxy
     * @return
     */
    public IndustryLookup lookIndustryLookup(String disvalue,JSGX_MDM_HRViProxy proxy) {
        IndustryLookup IndustryLookup = new IndustryLookup();
        IndustryLookup.setDisplayValue(disvalue);
        IndustryQuery IndustryQuery = new IndustryQuery();
        IndustryCriteria IndustryCriteria = new IndustryCriteria();
        IndustryCriteria.setCode(setTextCriteria(disvalue));
        IndustryQuery.setCriteria(IndustryCriteria);
        IndustryResultSet IndustryResultSet = null;
        try {
            IndustryResultSet = proxy.searchIndustry(IndustryQuery, setReposInfo());
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
        if(null != IndustryResultSet) {
            Industry[] Industrys = IndustryResultSet.getIndustry();
            if(null != Industrys && Industrys.length > 0) {
                BasicRecordIdentification base = new BasicRecordIdentification();
                base.setInternalID(Industrys[0].getRecordIdentification().getInternalID());
                IndustryLookup.setRecordIdentification(base);
            } else {
                return null;
            }
        } else {
            return null;
        }
        return IndustryLookup;
    }
    
    /**
     * 查找地址类型
     * 
     * @param disvalue
     * @param proxy
     * @return
     */
    public AddressTypeLookup lookAddressTypeLookup(String disvalue,JSGX_MDM_HRViProxy proxy) {
        AddressTypeLookup AddressTypeLookup = new AddressTypeLookup();
        AddressTypeLookup.setDisplayValue(disvalue);
        AddressTypeQuery AddressTypeQuery = new AddressTypeQuery();
        AddressTypeCriteria AddressTypeCriteria = new AddressTypeCriteria();
        AddressTypeCriteria.setCode(setTextCriteria(disvalue));
        AddressTypeQuery.setCriteria(AddressTypeCriteria);
        AddressTypeResultSet AddressTypeResultSet = null;
        try {
            AddressTypeResultSet = proxy.searchAddressType(AddressTypeQuery, setReposInfo());
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
        if(null != AddressTypeResultSet) {
            AddressType[] AddressTypes = AddressTypeResultSet.getAddressType();
            if(null != AddressTypes && AddressTypes.length > 0) {
                BasicRecordIdentification base = new BasicRecordIdentification();
                base.setInternalID(AddressTypes[0].getRecordIdentification().getInternalID());
                AddressTypeLookup.setRecordIdentification(base);
            } else {
                return null;
            }
        } else {
            return null;
        }
        return AddressTypeLookup;
    }
    
    /**
     * 查询家庭成员关系
     * 
     * @param disvalue
     * @param proxy
     * @return
     */
    public RelationshipLookup lookRelationshipLookup(String disvalue,JSGX_MDM_HRViProxy proxy) {
        RelationshipLookup RelationshipLookup = new RelationshipLookup();
        RelationshipLookup.setDisplayValue(disvalue);
        RelationshipQuery RelationshipQuery = new RelationshipQuery();
        RelationshipCriteria RelationshipCriteria = new RelationshipCriteria();
        RelationshipCriteria.setCode(setTextCriteria(disvalue));
        RelationshipQuery.setCriteria(RelationshipCriteria);
        RelationshipResultSet  RelationshipResultSet = null;
        try {
            RelationshipResultSet = proxy.searchRelationship(RelationshipQuery, setReposInfo());
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
        if(null != RelationshipResultSet) {
            Relationship[] Relationship = RelationshipResultSet.getRelationship();
            if(null != Relationship && Relationship.length > 0) {
                BasicRecordIdentification base = new BasicRecordIdentification();
                base.setInternalID(Relationship[0].getRecordIdentification().getInternalID());
                RelationshipLookup.setRecordIdentification(base);
            } else {
                return null;
            }
        } else {
            return null;
        }
        return RelationshipLookup;
    }
    
    /**
     * 查找电话类型
     * 
     * @param disvalue
     * @param proxy
     * @return
     */
    public ContactTypeLookup lookContactTypeLookup(String disvalue,JSGX_MDM_HRViProxy proxy) {
        ContactTypeLookup ContactTypeLookup = new ContactTypeLookup();
        ContactTypeLookup.setDisplayValue(disvalue);
        ContactTypeQuery ContactTypeQuery = new ContactTypeQuery();
        ContactTypeCriteria ContactTypeCriteria = new ContactTypeCriteria();
        ContactTypeCriteria.setCode(setTextCriteria(disvalue));
        ContactTypeQuery.setCriteria(ContactTypeCriteria);
        ContactTypeResultSet ContactTypeResultSet = null;
        try {
            ContactTypeResultSet = proxy.searchContactType(ContactTypeQuery, setReposInfo());
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
        if(null != ContactTypeResultSet) {
            ContactType[] ContactType = ContactTypeResultSet.getContactType();
            if(null != ContactType && ContactType.length > 0) {
                BasicRecordIdentification base = new BasicRecordIdentification();
                base.setInternalID(ContactType[0].getRecordIdentification().getInternalID());
                ContactTypeLookup.setRecordIdentification(base);
            } else {
                return null;
            }
        } else {
            return null;
        }
        return ContactTypeLookup;
    }
    
    /**
     * 查找水平等级
     * 
     * @param disvalue
     * @param proxy
     * @return
     */
    public LanguageLevelLookup lookLanguageLevelLookup(String disvalue,JSGX_MDM_HRViProxy proxy) {
        LanguageLevelLookup LanguageLevelLookup = new LanguageLevelLookup();
        LanguageLevelLookup.setDisplayValue(disvalue);
        LanguageLevelQuery LanguageLevelQuery = new LanguageLevelQuery();
        LanguageLevelCriteria LanguageLevelCriteria = new LanguageLevelCriteria();
        LanguageLevelCriteria.setCode(setTextCriteria(disvalue));
        LanguageLevelQuery.setCriteria(LanguageLevelCriteria);
        LanguageLevelResultSet LanguageLevelResultSet = null;
        try {
            LanguageLevelResultSet = proxy.searchLanguageLevel(LanguageLevelQuery, setReposInfo());
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
        if(null != LanguageLevelResultSet) {
            LanguageLevel[] LanguageLevel = LanguageLevelResultSet.getLanguageLevel();
            if(null != LanguageLevel && LanguageLevel.length > 0) {
                BasicRecordIdentification base = new BasicRecordIdentification();
                base.setInternalID(LanguageLevel[0].getRecordIdentification().getInternalID());
                LanguageLevelLookup.setRecordIdentification(base);
            } else {
                return null;
            }
        } else {
            return null;
        }
        return LanguageLevelLookup;
    }
    
    /**
     * 查找语种名称
     * 
     * @param disvalue
     * @param proxy
     * @return
     */
    public LanguageLookup lookLanguageLookup(String disvalue,JSGX_MDM_HRViProxy proxy) {
        LanguageLookup LanguageLookup = new LanguageLookup();
        LanguageLookup.setDisplayValue(disvalue);
        LanguageQuery LanguageQuery = new LanguageQuery();
        LanguageCriteria LanguageCriteria = new LanguageCriteria();
        LanguageCriteria.setCode(setTextCriteria(disvalue));
        LanguageQuery.setCriteria(LanguageCriteria);
        LanguageResultSet LanguageResultSet = null;
        try {
            LanguageResultSet = proxy.searchLanguage(LanguageQuery, setReposInfo());
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
        if(null != LanguageResultSet) {
            Language[] Language = LanguageResultSet.getLanguage();
            if(null != Language && Language.length > 0) {
                BasicRecordIdentification base = new BasicRecordIdentification();
                base.setInternalID(Language[0].getRecordIdentification().getInternalID());
                LanguageLookup.setRecordIdentification(base);
            } else {
                return null;
            }
        } else {
            return null;
        }
        return LanguageLookup;
    }
    
    /**
     * 查找所学专业代码
     * 
     * @param disvalue
     * @param proxy
     * @return
     */
    public MajorLookup lookMajorLookup(String disvalue,JSGX_MDM_HRViProxy proxy) {
        MajorLookup MajorLookup = new MajorLookup();
        MajorLookup.setDisplayValue(disvalue);
        MajorQuery MajorQuery = new MajorQuery();
        MajorCriteria MajorCriteria = new MajorCriteria();
        MajorCriteria.setCode(setTextCriteria(disvalue));
        MajorQuery.setCriteria(MajorCriteria);
        MajorResultSet MajorResultSet = null;
        try {
            MajorResultSet = proxy.searchMajor(MajorQuery, setReposInfo());
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
        if(null != MajorResultSet) {
            Major[] Major = MajorResultSet.getMajor();
            if(null != Major && Major.length > 0) {
                BasicRecordIdentification base = new BasicRecordIdentification();
                base.setInternalID(Major[0].getRecordIdentification().getInternalID());
                MajorLookup.setRecordIdentification(base);
            } else {
                return null;
            }
        } else {
            return null;
        }
        return MajorLookup;
    }
    
    /**
     * 查询学校类型
     * 
     * @param disvalue
     * @param proxy
     * @return
     */
    public SchoolTypeLookup lookSchoolTypeLookup(String disvalue,JSGX_MDM_HRViProxy proxy) {
        SchoolTypeLookup SchoolTypeLookup = new SchoolTypeLookup();
        SchoolTypeLookup.setDisplayValue(disvalue);
        SchoolTypeQuery SchoolTypeQuery = new SchoolTypeQuery();
        SchoolTypeCriteria SchoolTypeCriteria = new SchoolTypeCriteria();
        SchoolTypeCriteria.setCode(setTextCriteria(disvalue));
        SchoolTypeQuery.setCriteria(SchoolTypeCriteria);
        SchoolTypeResultSet SchoolTypeResultSet = null;
        try {
            SchoolTypeResultSet = proxy.searchSchoolType(SchoolTypeQuery, setReposInfo());
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
        if(null != SchoolTypeResultSet){
            SchoolType[] SchoolType = SchoolTypeResultSet.getSchoolType();
            if(null != SchoolType && SchoolType.length > 0) {
                BasicRecordIdentification base = new BasicRecordIdentification();
                base.setInternalID(SchoolType[0].getRecordIdentification().getInternalID());
                SchoolTypeLookup.setRecordIdentification(base);
            } else {
                return null;
            }
        } else {
            return null;
        }
        return SchoolTypeLookup;
    }
    
    /**
     * 查找毕业院校代码
     * 
     * @param disvalue
     * @param proxy
     * @return
     */
    public SchoolLookup lookSchoolLookup(String disvalue,JSGX_MDM_HRViProxy proxy) {
        SchoolLookup SchoolLookup = new SchoolLookup();
        SchoolLookup.setDisplayValue(disvalue);
        SchoolQuery SchoolQuery = new SchoolQuery();
        SchoolCriteria SchoolCriteria = new SchoolCriteria();
        SchoolCriteria.setCode(setTextCriteria(disvalue));
        SchoolQuery.setCriteria(SchoolCriteria);
        SchoolResultSet SchoolResultSet = null;
        try {
            SchoolResultSet = proxy.searchSchool(SchoolQuery, setReposInfo());
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
        if(null != SchoolResultSet) {
            School[] Schools = SchoolResultSet.getSchool();
            if(null != Schools && Schools.length > 0) {
                BasicRecordIdentification base = new BasicRecordIdentification();
                base.setInternalID(Schools[0].getRecordIdentification().getInternalID());
                SchoolLookup.setRecordIdentification(base);
            } else {
                return null;
            }
        } else {
            return null;
        }
        return SchoolLookup;
    }
    
    /**
     * 查询学制（单位）
     * 
     * @param disvalue
     * @param proxy
     * @return
     */
    public EducationSystemUnitLookup lookEducationSystemUnitLookup(String disvalue,JSGX_MDM_HRViProxy proxy) {
        EducationSystemUnitLookup EducationSystemUnitLookup = new EducationSystemUnitLookup();
        EducationSystemUnitLookup.setDisplayValue(disvalue);
        EducationSystemUnitQuery EducationSystemUnitQuery = new EducationSystemUnitQuery();
        EducationSystemUnitCriteria EducationSystemUnitCriteria = new EducationSystemUnitCriteria();
        EducationSystemUnitCriteria.setCode(setTextCriteria(disvalue));
        EducationSystemUnitQuery.setCriteria(EducationSystemUnitCriteria);
        EducationSystemUnitResultSet EducationSystemUnitResultSet = null;
        try {
            EducationSystemUnitResultSet = proxy.searchEducationSystemUnit(EducationSystemUnitQuery, setReposInfo());
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
        if(null != EducationSystemUnitResultSet) {
            EducationSystemUnit[] EducationSystemUnits = EducationSystemUnitResultSet.getEducationSystemUnit();
            if(null != EducationSystemUnits && EducationSystemUnits.length > 0) {
                BasicRecordIdentification base = new BasicRecordIdentification();
                base.setInternalID(EducationSystemUnits[0].getRecordIdentification().getInternalID());
                EducationSystemUnitLookup.setRecordIdentification(base);
            } else {
                return null;
            }
        } else {
            return null;
        }
        return EducationSystemUnitLookup;
    }
    
    /**
     * 查找学习形式
     * 
     * @param disvalue
     * @param proxy
     * @return
     */
    public LearningFormLookup lookLearningFormLookup(String disvalue,JSGX_MDM_HRViProxy proxy) {
        LearningFormLookup LearningFormLookup = new LearningFormLookup();
        LearningFormLookup.setDisplayValue(disvalue);
        LearningFormQuery LearningFormQuery = new LearningFormQuery();
        LearningFormCriteria LearningFormCriteria = new LearningFormCriteria();
        LearningFormCriteria.setCode(setTextCriteria(disvalue));
        LearningFormQuery.setCriteria(LearningFormCriteria);
        LearningFormResultSet LearningFormResultSet = null;
        try {
            LearningFormResultSet = proxy.searchLearningForm(LearningFormQuery, setReposInfo());
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
        if(null != LearningFormResultSet) {
            LearningForm[] LearningForms = LearningFormResultSet.getLearningForm();
            if(null != LearningForms && LearningForms.length > 0) {
                BasicRecordIdentification base = new BasicRecordIdentification();
                base.setInternalID(LearningForms[0].getRecordIdentification().getInternalID());
                LearningFormLookup.setRecordIdentification(base);
            } else {
                return null;
            }
        } else {
            return null;
        }
        return LearningFormLookup;
    }
    
    /**
     * 查询教育类型
     * 
     * @param disvalue
     * @param proxy
     * @return
     */
    public EducationTypeLookup lookEducationTypeLookup(String disvalue,JSGX_MDM_HRViProxy proxy) {
        EducationTypeLookup EducationTypeLookup = new EducationTypeLookup();
        EducationTypeLookup.setDisplayValue(disvalue);
        EducationTypeQuery EducationTypeQuery = new EducationTypeQuery();
        EducationTypeCriteria EducationTypeCriteria = new EducationTypeCriteria();
        EducationTypeCriteria.setCode(setTextCriteria(disvalue));
        EducationTypeQuery.setCriteria(EducationTypeCriteria);
        EducationTypeResultSet EducationTypeResultSet = null;
        try {
            EducationTypeResultSet = proxy.searchEducationType(EducationTypeQuery, setReposInfo());
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
        if(null != EducationTypeResultSet ){
            EducationType[] EducationTypes = EducationTypeResultSet.getEducationType();
            if(null != EducationTypes && EducationTypes.length > 0) {
                BasicRecordIdentification base = new BasicRecordIdentification();
                base.setInternalID(EducationTypes[0].getRecordIdentification().getInternalID());
                EducationTypeLookup.setRecordIdentification(base);
            } else {
                return null;
            }
        } else {
            return null;
        }
        return EducationTypeLookup;
    }
    
    /**
     * 查找民族
     * 
     * @param disvalue
     * @param proxy
     * @return
     */
    public EthnicGroupsLookup lookEthnicGroupsLookup(String disvalue,JSGX_MDM_HRViProxy proxy) {
        EthnicGroupsLookup ethnicGroupsLookup = new EthnicGroupsLookup();
        ethnicGroupsLookup.setDisplayValue(disvalue);
        EthnicGroupsQuery EthnicGroupsQuery = new EthnicGroupsQuery();
        EthnicGroupsCriteria EthnicGroupsCriteria = new EthnicGroupsCriteria();
        EthnicGroupsCriteria.setCode(setTextCriteria(disvalue));
        EthnicGroupsQuery.setCriteria(EthnicGroupsCriteria);
        EthnicGroupsResultSet EthnicGroupsResultSet = null;
        try {
            EthnicGroupsResultSet = proxy.searchEthnicGroups(EthnicGroupsQuery, setReposInfo());
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
        if(null != EthnicGroupsResultSet) {
            EthnicGroups[] EthnicGroups = EthnicGroupsResultSet.getEthnicGroups();
            if(null != EthnicGroups && EthnicGroups.length > 0) {
                BasicRecordIdentification base = new BasicRecordIdentification();
                base.setInternalID(EthnicGroups[0].getRecordIdentification().getInternalID());
                ethnicGroupsLookup.setRecordIdentification(base);
            } else {
                return null;
            }
        } else {
            return null;
        }
        return ethnicGroupsLookup;
    }
    
    /**
     * 查找证件类型
     * 
     * @param disvalue
     * @param proxy
     * @return
     */
    public ID_TypeLookup lookID_TypeLookup(String disvalue,JSGX_MDM_HRViProxy proxy) {
        ID_TypeLookup ID_TypeLookup = new ID_TypeLookup();
        ID_TypeLookup.setDisplayValue(disvalue);
        ID_TypeQuery ID_TypeQuery = new ID_TypeQuery();
        ID_TypeCriteria ID_TypeCriteria = new ID_TypeCriteria();
        ID_TypeCriteria.setCode(setTextCriteria(disvalue));
        ID_TypeQuery.setCriteria(ID_TypeCriteria);
        ID_TypeResultSet ID_TypeResultSet = null;
        try {
            ID_TypeResultSet = proxy.searchID_Type(ID_TypeQuery, setReposInfo());
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
        if(null != ID_TypeResultSet) {
            ID_Type[] ID_Types = ID_TypeResultSet.getID_Type();
            if(null != ID_Types && ID_Types.length > 0) {
                BasicRecordIdentification base = new BasicRecordIdentification();
                base.setInternalID(ID_Types[0].getRecordIdentification().getInternalID());
                ID_TypeLookup.setRecordIdentification(base);
            } else {
                return null;
            }
        } else {
            return null;
        }
        
        return ID_TypeLookup;
    }
    
    /**
     * 查找费用归集（原劳动合同）
     * 
     * @param disvalue
     * @param proxy
     * @return
     */
    public CostpoolLookup lookCostpoolLookup(String disvalue,JSGX_MDM_HRViProxy proxy) {
        CostpoolLookup costpoolLookup = new CostpoolLookup();
        costpoolLookup.setDisplayValue(disvalue);
        CostpoolQuery costpoolQuery = new CostpoolQuery();
        CostpoolCriteria costpoolCriteria = new CostpoolCriteria();
        costpoolCriteria.setCode(setTextCriteria(disvalue));
        costpoolQuery.setCriteria(costpoolCriteria);
        CostpoolResultSet costpoolResultSet = null;
        try {
            costpoolResultSet = proxy.searchCostpool(costpoolQuery, setReposInfo());
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
        if(null != costpoolResultSet) {
            Costpool[] costpools = costpoolResultSet.getCostpool();
            if(null != costpools && costpools.length > 0) {
                BasicRecordIdentification base = new BasicRecordIdentification();
                base.setInternalID(costpools[0].getRecordIdentification().getInternalID());
                costpoolLookup.setRecordIdentification(base);
            } else {
                return null;
            }
        } else {
            return null;
        }
        return costpoolLookup;
    }
    
    /**
     * 查找工资核算范围
     * 
     * @param disvalue
     * @param proxy
     * @return
     */
    public PayrollAreaLookup lookPayrollAreaLookup(String disvalue,JSGX_MDM_HRViProxy proxy) {
        PayrollAreaLookup payrollAreaLookup = new PayrollAreaLookup();
        payrollAreaLookup.setDisplayValue(disvalue);
        PayrollAreaQuery payrollAreaQuery = new PayrollAreaQuery();
        PayrollAreaCriteria payrollAreaCriteria = new PayrollAreaCriteria();
        payrollAreaCriteria.setCode(setTextCriteria(disvalue));
        payrollAreaQuery.setCriteria(payrollAreaCriteria);
        PayrollAreaResultSet payrollAreaResultSet = null;
        try {
            payrollAreaResultSet = proxy.searchPayrollArea(payrollAreaQuery, setReposInfo());
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
        if(null != payrollAreaResultSet) {
            PayrollArea[] payrollAreas = payrollAreaResultSet.getPayrollArea();
            if(null != payrollAreas && payrollAreas.length > 0) {
                BasicRecordIdentification base = new BasicRecordIdentification();
                base.setInternalID(payrollAreas[0].getRecordIdentification().getInternalID());
                payrollAreaLookup.setRecordIdentification(base);
            } else {
                return null;
            }
        } else {
            return null;
        }
        return payrollAreaLookup;
    }
    
    /**
     * 查找人事子范围
     * 
     * @param disvalue
     * @param proxy
     * @return
     */
    public PersonnelSubareasLookup lookPersonnelSubareasLookup(String disvalue,JSGX_MDM_HRViProxy proxy) {
        PersonnelSubareasLookup personnelSubareasLookup = new PersonnelSubareasLookup();
        personnelSubareasLookup.setDisplayValue(disvalue);
        PersonnelSubareasQuery personnelSubareasQuery = new PersonnelSubareasQuery();
        PersonnelSubareasCriteria personnelSubareasCriteria = new PersonnelSubareasCriteria();
        personnelSubareasCriteria.setCode(setTextCriteria(disvalue));
        personnelSubareasQuery.setCriteria(personnelSubareasCriteria);
        PersonnelSubareasResultSet personnelSubareasResultSet = null;
        try {
            personnelSubareasResultSet = proxy.searchPersonnelSubareas(personnelSubareasQuery, setReposInfo());
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
        if(null != personnelSubareasResultSet) {
            PersonnelSubareas[] personnelSubareas = personnelSubareasResultSet.getPersonnelSubareas();
            if(null != personnelSubareas && personnelSubareas.length > 0) {
                BasicRecordIdentification base = new BasicRecordIdentification();
                base.setInternalID(personnelSubareas[0].getRecordIdentification().getInternalID());
                personnelSubareasLookup.setRecordIdentification(base);
            } else {
                return null;
            }
        } else {
            return null;
        }
        return personnelSubareasLookup;
    }
    
    /**
     * 查找人事范围
     * 
     * @param disvalue
     * @param proxy
     * @return
     */
    public PersonnelAreaLookup lookPersonnelAreaLookup(String disvalue,JSGX_MDM_HRViProxy proxy) {
        PersonnelAreaLookup personnelAreaLookup = new PersonnelAreaLookup();
        personnelAreaLookup.setDisplayValue(disvalue);
        PersonnelAreaQuery personnelAreaQuery = new PersonnelAreaQuery();
        PersonnelAreaCriteria personnelAreaCriteria = new PersonnelAreaCriteria();
        personnelAreaCriteria.setCode(setTextCriteria(disvalue));
        personnelAreaQuery.setCriteria(personnelAreaCriteria);
        PersonnelAreaResultSet personnelAreaResultSet = null;
        try {
            personnelAreaResultSet = proxy.searchPersonnelArea(personnelAreaQuery, setReposInfo());
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
        if(null != personnelAreaResultSet) {
            PersonnelArea[] personnelAreas = personnelAreaResultSet.getPersonnelArea();
            if(null != personnelAreas && personnelAreas.length > 0) {
                BasicRecordIdentification base = new BasicRecordIdentification();
                base.setInternalID(personnelAreas[0].getRecordIdentification().getInternalID());
                personnelAreaLookup.setRecordIdentification(base);
            } else {
                return null;
            }
        } else {
            return null;
        }
        return personnelAreaLookup;
    }
    
    /**
     * 查找员工子组
     * 
     * @param disvalue
     * @param proxy
     * @return
     */
    public EmployeeSubgroupLookup lookEmployeeSubgroupLookup(String disvalue,JSGX_MDM_HRViProxy proxy) {
        EmployeeSubgroupLookup employeeSubgroupLookup = new EmployeeSubgroupLookup();
        employeeSubgroupLookup.setDisplayValue(disvalue);
        EmployeeSubgroupQuery employeeSubgroupQuery = new EmployeeSubgroupQuery();
        EmployeeSubgroupCriteria employeeSubgroupCriteria = new EmployeeSubgroupCriteria();
        employeeSubgroupCriteria.setCode(setTextCriteria(disvalue));
        employeeSubgroupQuery.setCriteria(employeeSubgroupCriteria);
        EmployeeSubgroupResultSet employeeSubgroupResultSet = null;
        try {
            employeeSubgroupResultSet = proxy.searchEmployeeSubgroup(employeeSubgroupQuery, setReposInfo());
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
        if(null != employeeSubgroupResultSet) {
            EmployeeSubgroup[] employeeSubgroups = employeeSubgroupResultSet.getEmployeeSubgroup();
            if(null != employeeSubgroups && employeeSubgroups.length > 0) {
                BasicRecordIdentification base = new BasicRecordIdentification();
                base.setInternalID(employeeSubgroups[0].getRecordIdentification().getInternalID());
                employeeSubgroupLookup.setRecordIdentification(base);
            } else {
                return null;
            }
        } else {
            return null;
        }
        return employeeSubgroupLookup;
    }
    
    /**
     * 查找员工组
     * 
     * @param disvalue
     * @param proxy
     * @return
     */
    public EmployeeGroupLookup lookEmployeeGroupLookup(String disvalue,JSGX_MDM_HRViProxy proxy) {
        EmployeeGroupLookup employeeGroupLookup = new EmployeeGroupLookup();
        employeeGroupLookup.setDisplayValue(disvalue);
        EmployeeGroupQuery employeeGroupQuery = new EmployeeGroupQuery();
        EmployeeGroupCriteria employeeGroupCriteria = new EmployeeGroupCriteria();
        employeeGroupCriteria.setCode(setTextCriteria(disvalue));
        employeeGroupQuery.setCriteria(employeeGroupCriteria);
        EmployeeGroupResultSet employeeGroupResultSet = null;
        try {
            employeeGroupResultSet = proxy.searchEmployeeGroup(employeeGroupQuery, setReposInfo());
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
        if(null != employeeGroupResultSet) {
            EmployeeGroup[] employeeGroups = employeeGroupResultSet.getEmployeeGroup();
            if(null != employeeGroups && employeeGroups.length > 0) {
                BasicRecordIdentification base = new BasicRecordIdentification();
                base.setInternalID(employeeGroups[0].getRecordIdentification().getInternalID());
                employeeGroupLookup.setRecordIdentification(base);
            } else {
                return null;
            }
        } else {
            return null;
        }
        return employeeGroupLookup;
    }
    
    /**
     * 查找劳务关系
     * 
     * @param disvalue
     * @param proxy
     * @return
     */
    public WorkTypeLookup lookWorkTypeLookup(String disvalue,JSGX_MDM_HRViProxy proxy) {
        WorkTypeLookup workTypeLookup = new WorkTypeLookup();
        workTypeLookup.setDisplayValue(disvalue);
        WorkTypeQuery workTypeQuery = new WorkTypeQuery();
        WorkTypeCriteria workTypeCriteria = new WorkTypeCriteria();
        workTypeCriteria.setCode(setTextCriteria(disvalue));
        workTypeQuery.setCriteria(workTypeCriteria);
        WorkTypeResultSet workTypeResultSet = null;
        try {
            workTypeResultSet = proxy.searchWorkType(workTypeQuery, setReposInfo());
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
        if(null != workTypeResultSet) {
            WorkType[] workTypes = workTypeResultSet.getWorkType();
            if(null != workTypes && workTypes.length > 0) {
                BasicRecordIdentification base = new BasicRecordIdentification();
                base.setInternalID(workTypes[0].getRecordIdentification().getInternalID());
                workTypeLookup.setRecordIdentification(base);
            } else {
                return null;
            }
        } else {
            return null;
        }
        return workTypeLookup;
    }
    
    /**
     * 查找婚姻状况
     * 
     * @param disvalue
     * @param proxy
     * @return
     */
    public MaritalStatusLookup lookMaritalStatusLookup(String disvalue,JSGX_MDM_HRViProxy proxy) {
        MaritalStatusLookup maritalStatusLookup = new MaritalStatusLookup();
        maritalStatusLookup.setDisplayValue(disvalue);
        MaritalStatusQuery maritalStatusQuery = new MaritalStatusQuery();
        MaritalStatusCriteria maritalStatusCriteria = new MaritalStatusCriteria();
        maritalStatusCriteria.setCode(setTextCriteria(disvalue));
        maritalStatusQuery.setCriteria(maritalStatusCriteria);
        MaritalStatusResultSet maritalStatusResultSet = null;
        try {
            maritalStatusResultSet = proxy.searchMaritalStatus(maritalStatusQuery, setReposInfo());
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
        if(null != maritalStatusResultSet) {
            MaritalStatus[] maritalStatus = maritalStatusResultSet.getMaritalStatus();
            if(null != maritalStatus && maritalStatus.length > 0) {
                BasicRecordIdentification base = new BasicRecordIdentification();
                base.setInternalID(maritalStatus[0].getRecordIdentification().getInternalID());
                maritalStatusLookup.setRecordIdentification(base);
            } else {
                return null;
            }
        } else {
            return null;
        }
        
        return maritalStatusLookup;
    }
    
    /**
     * 查找国籍
     * 
     * @param disvalue
     * @param proxy
     * @return
     */
    public NationalityLookup lookNationalityLookup(String disvalue,JSGX_MDM_HRViProxy proxy) {
        NationalityLookup nationalityLookup = new NationalityLookup();
        nationalityLookup.setDisplayValue(disvalue);
        NationalityQuery nationalityQuery = new NationalityQuery();
        NationalityCriteria nationalityCriteria = new NationalityCriteria();
        nationalityCriteria.setCode(setTextCriteria(disvalue));
        nationalityQuery.setCriteria(nationalityCriteria);
        NationalityResultSet nationalityResultSet = null;
        try {
            nationalityResultSet = proxy.searchNationality(nationalityQuery, setReposInfo());
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
        if(null != nationalityResultSet) {
            Nationality[] nationalitys = nationalityResultSet.getNationality();
            if(null != nationalitys) {
                BasicRecordIdentification base = new BasicRecordIdentification();
                base.setInternalID(nationalitys[0].getRecordIdentification().getInternalID());
                nationalityLookup.setRecordIdentification(base);
            } else {
                return null;
            }
        } else {
            return null;
        }
        return nationalityLookup;
    }
    
    /**
     * 查找性别
     * 
     * @param disvalue
     * @param proxy
     * @return
     */
    public GenderLookup lookGenderLookup(String disvalue,JSGX_MDM_HRViProxy proxy) {
        GenderLookup genderLookup = new GenderLookup();
        genderLookup.setDisplayValue(disvalue);
        GenderQuery genderQuery = new GenderQuery();
        GenderCriteria genderCriteria = new GenderCriteria();
        genderCriteria.setCode(setTextCriteria(disvalue));
        genderQuery.setCriteria(genderCriteria);
        GenderResultSet genderResultSet = null;
        try {
            genderResultSet = proxy.searchGender(genderQuery, setReposInfo());
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
        if(null != genderResultSet) {
            Gender[] genders = genderResultSet.getGender();
            if(null != genders && genders.length > 0) {
                BasicRecordIdentification base = new BasicRecordIdentification();
                base.setInternalID(genders[0].getRecordIdentification().getInternalID());
                genderLookup.setRecordIdentification(base);
            } else {
                return null;
            }
        } else {
            return null;
        }
        return genderLookup;
    }
    
    /**
     * 查找操作原因
     * 
     * @param disvalue
     * @param proxy
     * @return
     */
    public OperationReasonLookup lookOperationReasonLookup(String disvalue,JSGX_MDM_HRViProxy proxy) {
        OperationReasonLookup operationReasonLookup = new OperationReasonLookup();
        operationReasonLookup.setDisplayValue(disvalue);
        OperationReasonQuery operationReasonQuery = new OperationReasonQuery();
        OperationReasonCriteria operationReasonCriteria = new OperationReasonCriteria();
        operationReasonCriteria.setCode(setTextCriteria(disvalue));
        operationReasonQuery.setCriteria(operationReasonCriteria);
        OperationReasonResultSet operationReasonResultSet = null;
        try {
            operationReasonResultSet = proxy.searchOperationReason(operationReasonQuery, setReposInfo());
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
        if(null != operationReasonResultSet) {
            OperationReason[] operationReasons = operationReasonResultSet.getOperationReason();
            if(null != operationReasons && operationReasons.length > 0) {
                BasicRecordIdentification base = new BasicRecordIdentification();
                base.setInternalID(operationReasons[0].getRecordIdentification().getInternalID());
                operationReasonLookup.setRecordIdentification(base);
            } else {
                return null;
            }
        } else {
            return null;
        }
        return operationReasonLookup;
    }
    
    /**
     * 查找人员事件
     * 
     * @param disvalue
     * @param proxy
     * @return
     */
    public IncidentLookup lookIncidentLookup(String disvalue,JSGX_MDM_HRViProxy proxy) {
        IncidentLookup incidentLookup = new IncidentLookup();
        incidentLookup.setDisplayValue(disvalue);
        IncidentQuery incidentQuery = new IncidentQuery();
        IncidentCriteria incidentCriteria = new IncidentCriteria();
        incidentCriteria.setCode(setTextCriteria(disvalue));
        incidentQuery.setCriteria(incidentCriteria);
        IncidentResultSet incidentResultSet = null;
        try {
            incidentResultSet = proxy.searchIncident(incidentQuery, setReposInfo());
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
        if(null != incidentResultSet) {
            Incident[] incidents = incidentResultSet.getIncident();
            if(null != incidents && incidents.length > 0) {
                BasicRecordIdentification base = new BasicRecordIdentification();
                base.setInternalID(incidents[0].getRecordIdentification().getInternalID());
                incidentLookup.setRecordIdentification(base);
            } else {
                return null;
            }
        } else {
            return null;
        }
        return incidentLookup;
    }
    
    
    /**
     * 获取操作标识
     * 
     * @param value code
     * @param f 代理类
     * @return
     */
    public OperationLookup lookOperation(String value, JSGX_MDM_HRViProxy f) {
        OperationQuery operationQuery = new OperationQuery();
        OperationCriteria operationCriteria = new OperationCriteria();
        operationCriteria.setCode(setTextCriteria(value));
        operationQuery.setCriteria(operationCriteria);
        OperationResultSet operateres = null;
        RepositoryInformation reposInfo = setReposInfo();
        try {
            operateres = f.searchOperation(operationQuery, reposInfo);
        } catch (RemoteException e1) {
            e1.printStackTrace();
            writeLog("调用MDM查询操作标识异常："+e1.getMessage());
            return null;
        }
        ExecutionStatus executionStatus = operateres.getExecutionStatus();
        String status = executionStatus.getStatus();
        OperationLookup operatelook = null;
        if("OK".equalsIgnoreCase(status)) {
            Operation[] operation = operateres.getOperation();
            if(null != operation && operation.length > 0) {
                Operation operat = operation[0];
                OperationID identi = operat.getRecordIdentification();
                operatelook = new OperationLookup();
                BasicRecordIdentification basicRecordIdentification = new BasicRecordIdentification();
                basicRecordIdentification.setInternalID(identi.getInternalID());
                operatelook.setRecordIdentification(basicRecordIdentification);
                operatelook.setDisplayValue(value);
            } else {
                return null;
            }
        } else {
            return null;
        }
        return operatelook;
    }
    
    /**
     * 获取分发系统代码内部码
     * 
     * @param value
     * @param f
     * @return
     */
    public ServiceRelationshipsTupleTuple getFFXTDM(String value,JSGX_MDM_HRViProxy f) {
        ClientQuery clientQuery = new ClientQuery();
        ClientCriteria clientCriteria = new ClientCriteria();
        clientCriteria.setCode(setTextCriteria(value));
        clientQuery.setCriteria(clientCriteria);
        ClientResultSet clientResultSet = null;
        ServiceRelationshipsTupleTuple serviceRelationshipsTupleTuple = null;
        try {
            clientResultSet = f.searchClient(clientQuery, setReposInfo());
            ExecutionStatus execution = clientResultSet.getExecutionStatus();
            String status = execution.getStatus();
            if("OK".equalsIgnoreCase(status)){
                Client[] clients = clientResultSet.getClient();
                if(null != clients && clients.length > 0) {
                    ClientID clientId = clients[0].getRecordIdentification();
                    serviceRelationshipsTupleTuple = new ServiceRelationshipsTupleTuple();
                    ClientLookup clientLookup = new ClientLookup();
                    clientLookup.setDisplayValue(value);
                    BasicRecordIdentification basicRecordIdentification = new BasicRecordIdentification();
                    basicRecordIdentification.setInternalID(clientId.getInternalID());
                    clientLookup.setRecordIdentification(basicRecordIdentification);
                    serviceRelationshipsTupleTuple.setCLIENT_SYSTEM(clientLookup);
                    serviceRelationshipsTupleTuple.setDisplayValue(value);
                } else {
                    return null;
                }
            } else {
                return null;
            }
        } catch (RemoteException e) {
            e.printStackTrace();
            writeLog("获取分发系统代码异常："+e.getMessage());
            return null;
        }
        return serviceRelationshipsTupleTuple;
    }
    
    /**
     * 获取分发状态代码
     * 
     * @param value 状态0
     * @param f
     * @return
     */
    public DistributionStatusLookup getFFZT(String value,JSGX_MDM_HRViProxy f){
        
        DistributionStatusQuery distributionStatusQuery = new DistributionStatusQuery();
        DistributionStatusCriteria distributionStatusCriteria = new DistributionStatusCriteria();
        
        distributionStatusCriteria.setCode(setTextCriteria(value));
        
        distributionStatusQuery.setCriteria(distributionStatusCriteria);
        RepositoryInformation reposInfo = setReposInfo();
        DistributionStatusResultSet approvalStatusResultSet = null;
        try {
            approvalStatusResultSet  = f.searchDistributionStatus(distributionStatusQuery, reposInfo);
        } catch (RemoteException e2) {
            e2.printStackTrace();
            writeLog("调用MDM查询分发状态代码异常："+e2.getMessage());
            return null;
        }
        ExecutionStatus executionStatus = approvalStatusResultSet.getExecutionStatus();
        String status = executionStatus.getStatus();
        DistributionStatusLookup distributionStatusLookup = null;
        if("OK".equalsIgnoreCase(status)){
            DistributionStatus[] distributionStatus = approvalStatusResultSet.getDistributionStatus();
            if(null != distributionStatus && distributionStatus.length > 0) {
                DistributionStatus results = approvalStatusResultSet.getDistributionStatus()[0];
                DistributionStatusID approvalStatusID = results.getRecordIdentification();
                distributionStatusLookup = new DistributionStatusLookup();
                BasicRecordIdentification basicRecordIdentification = new BasicRecordIdentification();
                basicRecordIdentification.setInternalID(approvalStatusID.getInternalID());
                distributionStatusLookup.setRecordIdentification(basicRecordIdentification);
            } else {
                return null;
            }
        } else {
            return null;
        }
        return distributionStatusLookup;
    }
    
    /**
     * 审批状态代码
     * 
     * @param value code
     * @param f 代理类
     * @return
     */
    public ApprovalStatusLookup getAPCODCode(String value, JSGX_MDM_HRViProxy f) {
        ApprovalStatusQuery approvalStatusQuery = new ApprovalStatusQuery();
        ApprovalStatusCriteria approvalStatusCriteria = new ApprovalStatusCriteria();
        approvalStatusCriteria.setCode(setTextCriteria(value));
        approvalStatusQuery.setCriteria(approvalStatusCriteria);
        RepositoryInformation reposInfo = setReposInfo();
        ApprovalStatusResultSet approvalStatusResultSet = null;
        try {
            approvalStatusResultSet = f.searchApprovalStatus(approvalStatusQuery, reposInfo);
        } catch (RemoteException e2) {
            e2.printStackTrace();
            writeLog("调用MDM查询审批状态代码异常："+e2.getMessage());
            return null;
        }
        ExecutionStatus executionStatus = approvalStatusResultSet.getExecutionStatus();
        String status = executionStatus.getStatus();
        ApprovalStatusLookup approvalStatusLookup = null;
        if("OK".equalsIgnoreCase(status)){
            ApprovalStatus[] approvalStatus = approvalStatusResultSet.getApprovalStatus();
            if(null != approvalStatus && approvalStatus.length > 0) {
                ApprovalStatus results = approvalStatus[0];
                ApprovalStatusID approvalStatusID = results.getRecordIdentification();
                approvalStatusLookup = new ApprovalStatusLookup();
                BasicRecordIdentification basicRecordIdentification = new BasicRecordIdentification();
                basicRecordIdentification.setInternalID(approvalStatusID.getInternalID());
                approvalStatusLookup.setRecordIdentification(basicRecordIdentification);
            } else {
                return null;
            }
        } else {
            return null;
        }
        return approvalStatusLookup;
    }
    
    /**
     * 设置CustomerAccountGroupsCriteria 对象
     * 
     * @param disvalue 默认值
     * @return
     */
    public TextCriteria setTextCriteria(String disvalue){
        TextCriteria textCriteria = new TextCriteria();
        TextConstraint[] textConstraints = new TextConstraint[1];
        TextConstraint textConstraint = new TextConstraint();
        textConstraint.setExpressionOperator("EQUALS");
        textConstraint.setValue(disvalue);
        textConstraints[0] = textConstraint;
        textCriteria.setConstraint(textConstraints);
        return textCriteria;
    }
    
    /**
     * 设置RepositoryInformation对象
     * 
     * @return
     */
    public RepositoryInformation setReposInfo() {
        RepositoryInformation reposInfo = new RepositoryInformation();
        reposInfo.setDataLang("Chinese [CN]");
        reposInfo.setRepositoryName("JSGX_MDM_HR_Dev");
        reposInfo.setServerName("MDP");
        return reposInfo;
    }
    
    /**
     * 打印日志
     * @param o
     */
    public void log(Object o) {
        writeLog(o);
    }
    
    /**
     * 处理时间字符串
     * @param date
     * @return
     */
    public String toyyyyMMdd(String date) {
        String[] strs = date.split("-");
        StringBuffer sb = new StringBuffer();
        for(String s : strs) {
            sb.append(s);
        }
        return sb.toString();
    }
    
    /**
     * 处理时间字符串
     * @param date
     * @return
     */
    public String toyyyyMMdd(String date,String time) {
        String[] strs = time.split(":");
        StringBuffer sb = new StringBuffer();
        for(String s : strs) {
            sb.append(s);
        }
        return date + sb.toString();
    }
    
    /**
     * 更新创建成功标识字段
     * 
     * @param status
     * @param message
     * @param requestid
     */
    public void updateReturnMsg(String status,String message,String requestid) {
        RecordSet rs = new RecordSet();
        String tablename = getPropValue("MDM", "MDM_RY_TABLE");
        String sql = "update "+tablename+" set fhzt = '"+status+"', fhxx = '"+message+"' where requestid = '"+requestid+"'";
        writeLog("处理SAP返回消息和状态SQL："+sql);
        rs.execute(sql);
    }
}
