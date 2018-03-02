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
        resources.add(entity.service.AccidentagenttpFacadeREST.class);
        resources.add(entity.service.AccidentnatureFacadeREST.class);
        resources.add(entity.service.ActivityFacadeREST.class);
        resources.add(entity.service.AgentFacadeREST.class);
        resources.add(entity.service.BitFacadeREST.class);
        resources.add(entity.service.CaseagentFacadeREST.class);
        resources.add(entity.service.DamageFacadeREST.class);
        resources.add(entity.service.DetailsiteFacadeREST.class);
        resources.add(entity.service.DpropertyFacadeREST.class);
        resources.add(entity.service.ElementFacadeREST.class);
        resources.add(entity.service.EntrepriseFacadeREST.class);
        resources.add(entity.service.ExcuseFacadeREST.class);
        resources.add(entity.service.ExcuseagentFacadeREST.class);
        resources.add(entity.service.Function1FacadeREST.class);
        resources.add(entity.service.FunctionagentFacadeREST.class);
        resources.add(entity.service.GridFacadeREST.class);
        resources.add(entity.service.InstanceFacadeREST.class);
        resources.add(entity.service.InstanceworksheetFacadeREST.class);
        resources.add(entity.service.IpropertyFacadeREST.class);
        resources.add(entity.service.JobpostingFacadeREST.class);
        resources.add(entity.service.LabelFacadeREST.class);
        resources.add(entity.service.LinkedtaskFacadeREST.class);
        resources.add(entity.service.ListagentFacadeREST.class);
        resources.add(entity.service.MarkFacadeREST.class);
        resources.add(entity.service.NatureFacadeREST.class);
        resources.add(entity.service.NpropertyFacadeREST.class);
        resources.add(entity.service.Object1FacadeREST.class);
        resources.add(entity.service.OperationFacadeREST.class);
        resources.add(entity.service.PropertyFacadeREST.class);
        resources.add(entity.service.RankFacadeREST.class);
        resources.add(entity.service.SiteFacadeREST.class);
        resources.add(entity.service.StatementtaskFacadeREST.class);
        resources.add(entity.service.TitletaskFacadeREST.class);
        resources.add(entity.service.TypeobjectFacadeREST.class);
        resources.add(entity.service.TypeoperationFacadeREST.class);
        resources.add(entity.service.UnitmeasureFacadeREST.class);
        resources.add(entity.service.VpropertyFacadeREST.class);
        resources.add(entity.service.VwAccidentnatureFacadeREST.class);
        resources.add(entity.service.VwDamageFacadeREST.class);
        resources.add(entity.service.VwDamageaccidentnatureFacadeREST.class);
        resources.add(entity.service.VwElementdamageFacadeREST.class);
        resources.add(entity.service.VwLastidoftableFacadeREST.class);
        resources.add(entity.service.VwPropertyFacadeREST.class);
        resources.add(entity.service.WorksheetFacadeREST.class);
    }
    
}
