/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity.service;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author boutarfa
 */
@javax.ws.rs.ApplicationPath("wsrv")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(entity.NewCrossOriginResourceSharingFilter.class);
        resources.add(entity.service.AccidentFacadeREST.class);
        resources.add(entity.service.AccidentagenteeFacadeREST.class);
        resources.add(entity.service.AccidentagentshFacadeREST.class);
        resources.add(entity.service.AccidentagentshbitFacadeREST.class);
        resources.add(entity.service.AccidentagenttpFacadeREST.class);
        resources.add(entity.service.AccidentfileFacadeREST.class);
        resources.add(entity.service.AccidentmaterialFacadeREST.class);
        resources.add(entity.service.AccidentnatureFacadeREST.class);
        resources.add(entity.service.AccidentpictureFacadeREST.class);
        resources.add(entity.service.AccidentvehiculeFacadeREST.class);
        resources.add(entity.service.AccidentvehiculedriverFacadeREST.class);
        resources.add(entity.service.AccidentvehiculedrivernsFacadeREST.class);
        resources.add(entity.service.AccidentvehiculedrivershFacadeREST.class);
        resources.add(entity.service.AccidentvehiculeinsuranceFacadeREST.class);
        resources.add(entity.service.AccidentvehiculeownerFacadeREST.class);
        resources.add(entity.service.ActionFacadeREST.class);
        resources.add(entity.service.ActionaccidentFacadeREST.class);
        resources.add(entity.service.ActionassignmentFacadeREST.class);
        resources.add(entity.service.ActivityFacadeREST.class);
        resources.add(entity.service.AgencyFacadeREST.class);
        resources.add(entity.service.AgentFacadeREST.class);
        resources.add(entity.service.AggravatingfactorFacadeREST.class);
        resources.add(entity.service.AssuranceFacadeREST.class);
        resources.add(entity.service.BitFacadeREST.class);
        resources.add(entity.service.BitclassFacadeREST.class);
        resources.add(entity.service.CaseagentFacadeREST.class);
        resources.add(entity.service.CauseFacadeREST.class);
        resources.add(entity.service.DamageFacadeREST.class);
        resources.add(entity.service.DamagedefinitionFacadeREST.class);
        resources.add(entity.service.DetailagentFacadeREST.class);
        resources.add(entity.service.DetailsiteFacadeREST.class);
        resources.add(entity.service.DpropertyFacadeREST.class);
        resources.add(entity.service.ElementFacadeREST.class);
        resources.add(entity.service.EntrepriseFacadeREST.class);
        resources.add(entity.service.ExcuseFacadeREST.class);
        resources.add(entity.service.ExcuseagentFacadeREST.class);
        resources.add(entity.service.Function1FacadeREST.class);
        resources.add(entity.service.FunctionagentFacadeREST.class);
        resources.add(entity.service.GenericResource.class);
        resources.add(entity.service.GridFacadeREST.class);
        resources.add(entity.service.InspectedsiteFacadeREST.class);
        resources.add(entity.service.InspectplanningFacadeREST.class);
        resources.add(entity.service.InstanceFacadeREST.class);
        resources.add(entity.service.InstanceworksheetFacadeREST.class);
        resources.add(entity.service.IpropertyFacadeREST.class);
        resources.add(entity.service.JobpostingFacadeREST.class);
        resources.add(entity.service.LabelFacadeREST.class);
        resources.add(entity.service.LinkedtaskFacadeREST.class);
        resources.add(entity.service.ListagentFacadeREST.class);
        resources.add(entity.service.MarkFacadeREST.class);
        resources.add(entity.service.MaterialFacadeREST.class);
        resources.add(entity.service.NatureFacadeREST.class);
        resources.add(entity.service.NpropertyFacadeREST.class);
        resources.add(entity.service.Object1FacadeREST.class);
        resources.add(entity.service.OperationFacadeREST.class);
        resources.add(entity.service.OpscardFacadeREST.class);
        resources.add(entity.service.PrintResource.class);
        resources.add(entity.service.PropertyFacadeREST.class);
        resources.add(entity.service.RankFacadeREST.class);
        resources.add(entity.service.RecommendationFacadeREST.class);
        resources.add(entity.service.SiteFacadeREST.class);
        resources.add(entity.service.StatementtaskFacadeREST.class);
        resources.add(entity.service.StructureFacadeREST.class);
        resources.add(entity.service.TitletaskFacadeREST.class);
        resources.add(entity.service.TypeobjectFacadeREST.class);
        resources.add(entity.service.TypeoperationFacadeREST.class);
        resources.add(entity.service.UnitmeasureFacadeREST.class);
        resources.add(entity.service.VpropertyFacadeREST.class);
        resources.add(entity.service.VwAccidentagentshbitFacadeREST.class);
        resources.add(entity.service.VwAccidentnatureFacadeREST.class);
        resources.add(entity.service.VwActionaccidentFacadeREST.class);
        resources.add(entity.service.VwAgentFacadeREST.class);
        resources.add(entity.service.VwDamageFacadeREST.class);
        resources.add(entity.service.VwDamageaccidentnatureFacadeREST.class);
        resources.add(entity.service.VwDamagewithrankFacadeREST.class);
        resources.add(entity.service.VwElementdamageFacadeREST.class);
        resources.add(entity.service.VwElementgridFacadeREST.class);
        resources.add(entity.service.VwGridFacadeREST.class);
        resources.add(entity.service.VwInspectedsiteFacadeREST.class);
        resources.add(entity.service.VwLastidoftableFacadeREST.class);
        resources.add(entity.service.VwNotelementofnatureaccidentFacadeREST.class);
        resources.add(entity.service.VwNotnatureofaccidentFacadeREST.class);
        resources.add(entity.service.VwPropertyFacadeREST.class);
        resources.add(entity.service.VwSitenotinspectedFacadeREST.class);
        resources.add(entity.service.WorksheetFacadeREST.class);
        resources.add(entity.service.VwGridforaccidentFacadeREST.class);
    }
    
}
