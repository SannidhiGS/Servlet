package com.xworkz.jdbc;

import java.sql.*;

public class SweetSelect {

    public static void main(String[] args) {

        try(Connection connection= DriverManager.getConnection(DBConst.URL.getProperty(), DBConst.Username.getProperty(),  DBConst.Secret.getProperty());)  {

            Statement statement = connection.createStatement();


            //Select all rows
            String selectall="Select * from sweet";
            ResultSet resultSet1=statement.executeQuery(selectall);
            System.out.println("Resultset:"+resultSet1);

            while (resultSet1.next()){
                int sweet_id=resultSet1.getInt("sweet_id");
                String sweet_name=resultSet1.getString("sweet_name");
                String sweet_type=resultSet1.getString("sweet_type");
                Double price =resultSet1.getDouble("price");
                String quantity=resultSet1.getString("quantity");
                String shop_name=resultSet1.getString("shop_name");
                String ingredients=resultSet1.getString("ingredients");

                System.out.println("Sweet id:"+sweet_id);
                System.out.println("Sweet name is:"+sweet_name);
                System.out.println("Sweet type:"+sweet_type);
                System.out.println("Sweet price:"+price);
                System.out.println("Sweet quantity:"+quantity);
                System.out.println("Sweet shop name:"+shop_name);
                System.out.println("Sweet ingredients:"+ingredients);
                System.out.println("....................................................");
            }

            //Select one row
            String row1="Select * from sweet where sweet_id = 6";
            ResultSet resultSet2=statement.executeQuery(row1);
            System.out.println("Resultset:"+resultSet2);

            while (resultSet2.next()){
                int sweet_id=resultSet2.getInt("sweet_id");
                String sweet_name=resultSet2.getString("sweet_name");
                String sweet_type=resultSet2.getString("sweet_type");
                Double price =resultSet2.getDouble("price");
                String quantity=resultSet2.getString("quantity");
                String shop_name=resultSet2.getString("shop_name");
                String ingredients=resultSet2.getString("ingredients");

                System.out.println("Sweet id:"+sweet_id);
                System.out.println("Sweet name is:"+sweet_name);
                System.out.println("Sweet type:"+sweet_type);
                System.out.println("Sweet price:"+price);
                System.out.println("Sweet quantity:"+quantity);
                System.out.println("Sweet shop name:"+shop_name);
                System.out.println("Sweet ingredients:"+ingredients);
                System.out.println(".....................................................");
            }

            //Select one row one column
            String row1column1="Select sweet_name from sweet where sweet_id=10";
            ResultSet resultSet3=statement.executeQuery(row1column1);
            System.out.println("Resultset:"+resultSet3);

            while (resultSet3.next()){
                String sweet_name=resultSet3.getString("sweet_name");
                System.out.println("Sweet name :"+sweet_name);
                System.out.println(".......................................................");
            }

            //Select two rows
            String selectrow2="Select * from sweet where sweet_id=3 or sweet_id=1";
            ResultSet resultSet4=statement.executeQuery(selectrow2);
            System.out.println("ResultSet:"+resultSet4);

            while (resultSet4.next()) {
                int sweet_id=resultSet4.getInt("sweet_id");
                String sweet_name = resultSet4.getString("sweet_name");
                System.out.println("Sweet id is: " + sweet_id + " Sweet name is: " + sweet_name);
            }
            System.out.println(".......................................................");

            //Select three rows
            String selectrow3 ="select * from sweet where sweet_id IN(6,10,12)";
            ResultSet resultSet5=statement.executeQuery(selectrow3);
            System.out.println("Resultset:"+resultSet5);

            while (resultSet5.next()){
                int sweet_id=resultSet5.getInt("sweet_id");
                String sweet_name = resultSet5.getString("sweet_name");
                String sweet_type = resultSet5.getString("sweet_type");
                System.out.println("Sweet id is: " + sweet_id + " Sweet name is: " + sweet_name + " Sweet type is: " +sweet_type);
            }
            System.out.println(".......................................................");

            //Select one column all rows
            String columnallrows = "Select sweet_name from sweet";
            ResultSet resultSet6 = statement.executeQuery(columnallrows);
            System.out.println("ResultSet: " + resultSet6);

            while (resultSet6.next()) {
                String sweet_name = resultSet6.getString("sweet_name");
                System.out.println("Sweet Name: " + sweet_name);
            }
            System.out.println("......................................................");

            //Select distinct
            String distinct = "Select distinct sweet_type from sweet";
            ResultSet rs7 = statement.executeQuery(distinct);
            System.out.println("Resultset:"+rs7);

            while (rs7.next()) {
                String sweet_type = rs7.getString("sweet_type");
                System.out.println("Sweet Type: " + sweet_type);
            }
            System.out.println(".......................................................");

            //Select Count(*)
            String count = "Select COUNT(*) from sweet";
            ResultSet rs8 = statement.executeQuery(count);
            System.out.println("ResultSet: " + rs8);

            while (rs8.next()) {
                int id = rs8.getInt(1);
                System.out.println("Total Rows: " + id);
            }
            System.out.println(".........................................................");

            //Select latest row
            String lastestRow = "Select * from sweet ORDER BY sweet_id DESC LIMIT 1";
            ResultSet rs9 = statement.executeQuery(lastestRow);
            System.out.println("Resultset:"+rs9);

            while (rs9.next()) {
                int sweet_id = rs9.getInt("sweet_id");
                String sweet_name = rs9.getString("sweet_name");
                String sweet_type = rs9.getString("sweet_type");
                Double price = rs9.getDouble("price");
                String quantity = rs9.getString("quantity");
                String shop_name = rs9.getString("shop_name");
                String ingredients = rs9.getString("ingredients");

                System.out.println("latest Sweet id:" + sweet_id);
                System.out.println("Sweet name is:" + sweet_name);
                System.out.println("Sweet type:" + sweet_type);
                System.out.println("Sweet price:" + price);
                System.out.println("Sweet quantity:" + quantity);
                System.out.println("Sweet shop name:" + shop_name);
                System.out.println("Sweet ingredients:" + ingredients);
            }
            System.out.println("...........................................................");

            //select 2 max row
            String max2 = "Select * from sweet ORDER BY sweet_id DESC LIMIT 2";
            ResultSet rs10 = statement.executeQuery(max2);
            System.out.println("ResultSet: " + rs10);

            while (rs10.next()) {
                int sweet_id = rs10.getInt("sweet_id");
                String sweet_name = rs10.getString("sweet_name");
                String sweet_type = rs10.getString("sweet_type");
                Double price = rs10.getDouble("price");
                String quantity = rs10.getString("quantity");
                String shop_name = rs10.getString("shop_name");
                String ingredients = rs10.getString("ingredients");

                System.out.println("Sweet id:" + sweet_id);
                System.out.println("Sweet name is:" + sweet_name);
                System.out.println("Sweet type:" + sweet_type);
                System.out.println("Sweet price:" + price);
                System.out.println("Sweet quantity:" + quantity);
                System.out.println("Sweet shop name:" + shop_name);
                System.out.println("Sweet ingredients:" + ingredients);
            }
            System.out.println("...........................................................");

            //select min 5 rows
            String min5 = "Select * from sweet ORDER BY sweet_id ASC LIMIT 5";
            ResultSet rs11 = statement.executeQuery(min5);
            System.out.println("ResultSet: " + rs11);

            while (rs11.next()) {
                int sweet_id = rs11.getInt("sweet_id");
                String sweet_name = rs11.getString("sweet_name");
                String sweet_type = rs11.getString("sweet_type");
                Double price = rs11.getDouble("price");
                String quantity = rs11.getString("quantity");
                String shop_name = rs11.getString("shop_name");
                String ingredients = rs11.getString("ingredients");

                System.out.println("Sweet id:" + sweet_id);
                System.out.println("Sweet name is:" + sweet_name);
                System.out.println("Sweet type:" + sweet_type);
                System.out.println("Sweet price:" + price);
                System.out.println("Sweet quantity:" + quantity);
                System.out.println("Sweet shop name:" + shop_name);
                System.out.println("Sweet ingredients:" + ingredients);
            }
            System.out.println("...........................................................");

            //select oldest row
            String oldest = "Select * from sweet ORDER BY sweet_id ASC LIMIT 1";
            ResultSet rs12 = statement.executeQuery(oldest);
            System.out.println("ResultSet: " + rs12);

            while (rs12.next()) {
                int sweet_id = rs12.getInt("sweet_id");
                String sweet_name = rs12.getString("sweet_name");
                String sweet_type = rs12.getString("sweet_type");
                Double price = rs12.getDouble("price");
                String quantity = rs12.getString("quantity");
                String shop_name = rs12.getString("shop_name");
                String ingredients = rs12.getString("ingredients");

                System.out.println("Sweet id:" + sweet_id);
                System.out.println("Sweet name is:" + sweet_name);
                System.out.println("Sweet type:" + sweet_type);
                System.out.println("Sweet price:" + price);
                System.out.println("Sweet quantity:" + quantity);
                System.out.println("Sweet shop name:" + shop_name);
                System.out.println("Sweet ingredients:" + ingredients);
            }
            System.out.println("...........................................................");

            //select all rows order by id desc
            String descRow = "Select * from sweet ORDER BY sweet_id DESC";
            ResultSet rs13 = statement.executeQuery(descRow);
            System.out.println("ResultSet: " + rs13);

            while (rs13.next()) {
                int sweet_id = rs13.getInt("sweet_id");
                String sweet_name = rs13.getString("sweet_name");
                String sweet_type = rs13.getString("sweet_type");
                Double price = rs13.getDouble("price");
                String quantity = rs13.getString("quantity");
                String shop_name = rs13.getString("shop_name");
                String ingredients = rs13.getString("ingredients");

                System.out.println("Sweet id:" + sweet_id);
                System.out.println("Sweet name is:" + sweet_name);
                System.out.println("Sweet type:" + sweet_type);
                System.out.println("Sweet price:" + price);
                System.out.println("Sweet quantity:" + quantity);
                System.out.println("Sweet shop name:" + shop_name);
                System.out.println("Sweet ingredients:" + ingredients);
            }
            System.out.println("...........................................................");

            //select with group by
            String sql = "Select sweet_type, COUNT(*) AS total_sweets from sweet GROUP BY sweet_type";
            ResultSet rs14 = statement.executeQuery(sql);
            System.out.println("Resultset:"+rs14);

            while (rs14.next()) {
                String type = rs14.getString("sweet_type");
                int counts = rs14.getInt("total_sweets");

                System.out.println("Sweet Type: " + type + "  Total: " + counts);
            }
            System.out.println("...........................................................");

            //select with group by and having
            String sql1 = "Select sweet_type, COUNT(*) AS total_sweets from sweet GROUP BY sweet_type HAVING COUNT(*)";
            ResultSet rs15 = statement.executeQuery(sql1);

            while (rs15.next()) {
                String sweet_type = rs15.getString("sweet_type");
                int count1 = rs15.getInt("total_sweets");

                System.out.println("Sweet Type: " + sweet_type + "  Total Sweets: " + count1);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}