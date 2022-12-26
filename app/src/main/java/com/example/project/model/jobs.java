package com.example.project.model;
import java.util.ArrayList;
public class jobs implements jobData{
    public static ArrayList<jobItem> job;


    public void jobData(){
        job = new ArrayList<>();
        job.add(new jobItem(
                "JOB ANNOUNCEMENT",
                "Gaza",
                "1500",
                "Under the responsibility of the General Coordinator, the Field Coordinator is responsible for MdM-CH Project Design, Activities Implementation and Monitoring & Evaluation. He/she engages in a constant monitoring of the context of intervention, population needs & other actors’ responses provision, he/she ensures a close supervision of MdM-CH field workers and emphasizes positive cooperation attitudes among all profiles so that MdM-CH actions are coherent with the organization strategy and in lines with developmental best practices. development of MdM-CH strategy and ensure the implementation," +
                        " the quality and the consistency of the mental health component of the program with partners and MdM coordination team.",
                "Ability to work under pressure in an unstable and changing environment\n" +
                        "Ability to manage priorities effectively\n" +
                        "Good writing skills in writing and designing proposals and good communication skills\n" +
                        "Reactivity, anticipation, adaptability, capacity to take initiatives\n" +
                        "Excellent communication skills are essential to ensure cohesion with other programme and partner staff skills are primordial.\n" +
                        "Good skills in organization, co-ordination and the transfer of knowledge are essential. The person must be able to work independently and without constant supervision.\n" +
                        "Ability to live and work in a difficult security context and willingness to accept and abide with the organization security protocols.",
                "30\12\2022"));

        job.add(new jobItem(
                "IT Support Engineers",
                "Ramallah",
                "2000",
                "FIS is a leading IT and Business solutions firm based in Ramallah that provides a blend of technology solutions for the local market for over the last 23 years.\n" +
                        "\n" +
                        "FIS is currently looking for like-minded IT Support Engineers who share our enthusiasm and want to be part of an innovative, fast-paced environment.",
                "Previous experience/knowledge of working with databases / oracle is preferred.\n" +
                        "SQL proficient; handling complex, nested and recursive queries\n" +
                        "Experience in PC System Support.\n" +
                        "Excellent knowledge in Windows Servers, networks and infrastructures.\n" +
                        "Good technical and analytical skills.\n" +
                        "Strong, confident communication skills are expected.\n" +
                        "Ability to work both independently and as part of a team to ensure that a high level of service is provided.\n" +
                        "Excellent understanding of web technologies.\n" +
                        "Excellent oral and written communication skills.\n" +
                        "Strong organizational skills and detail oriented.\n" +
                        "Proficient in written and spoken English",
                "1\1\2023"));

        job.add(new jobItem(
                "Director of Institutional Affairs",
                "Bethlehem",
                "3000",
                "Bethlehem University is seeking a full-time Director of Institutional Affairs. This position requires a flexible weekly schedule in which the 40 working hours per week may include evenings and weekends. The Director of Institutional Affairs holds a senior administrative position working directly with the governance and the executive management bodies of Bethlehem University to coordinate their activities. " +
                        "The position holder provides follow up and guides, as necessary, the initiatives of the Executive Council.",
                "A Master’s degree in Higher Education Administration, Business or in a related field.\n" +
                        "At least, 5 years of experience in a senior management position in a university, NGO, or company.\n" +
                        "Has a record of effective management of boards, committees, and other groups.",
                "1\1\2023"));

        job.add(new jobItem(
                "Administrative and Finance Officer",
                "Hebron ",
                "4000",
                "The overall responsibility will be to manage accountancy by effectively using AGRESSO based on AAH standards, IFRS, Government Regulations, and Donor Policies; carry out financial and " +
                        "accounting tasks in a correct manner to regularly produce reliable and transparent information in a timely manner.",
                "Bachelor or Master of Science in Accountancy, Financial Management or Administration or related area.\n" +
                        "Minimum 2 years experience in finance and/or accounting-related field. \n" +
                        "Knowledge of Admin procedures, accounting, and finance. is compulsory.\n" +
                        "Previous working experience in NGOs or INGOs is preferred.\n" +
                        "Knowledge of accounting, finance bookkeeping, and archiving. \n" +
                        "Basic Knowledge of Logistics\n" +
                        "Knowledge of donor’s guidelines (ECHO, EU, UNICEF, AECID, OCHA . etc.) is an advantage\n" +
                        "Experience in working with Agresso accountancy software is a plus.\n" +
                        "Experience in the appropriate bank and cash management. Accounting cycle. \n" +
                        "Basic experience in budgeting and budget management.\n",
                "10\1\2023"));

        job.add(new jobItem(
                "Research Consultant",
                "Jerusalem ",
                "5000",
                "Now in its fourteenth year of operation, Al-Quds Bard College for Arts and Sciences (AQB) is an innovative program introducing a liberal arts undergraduate education to the West Bank, with an enrollment of approximately 331 undergraduate and graduate students. The undergraduate program at AQB is rigorous, culminating in a two-semester independent senior project, which is generally a demanding research paper. The Master of Arts in Teaching (MAT) program requires an equal amount of advanced study in the elected academic discipline (Mathematics, Biology, English, History, or Sciences), and in key education courses that challenge teachers to apply the results of research and pedagogical analysis to the actual work of teaching. Graduates of AQB receive two degrees: a BA or a MAT from Al-Quds University and a BA or MAT from Bard College (New York). " +
                        "The College is also part of a global network of higher education institutions, the Open Society University Network (OSUN).",
                "Ph.D. in any academic field preferred\n" +
                        "Minimum 5 years of experience in K-12 education\n" +
                        "Good knowledge of both the K-12 and higher education landscape in Palestine.\n" +
                        "Previous experience in research in the education field\n" +
                        "Strong research skills\n" +
                        "Good analytical skills and capacity to present data in a clear and concise manner\n" +
                        "Advanced communication and interpersonal skills.\n" +
                        "Fluent in written and spoken English and Arabic",
                "10\1\2023"));

        job.add(new jobItem(
                "Social Worker",
                "Nablus ",
                "6000",
                "The Palestine Children's Relief Fund is a nonprofit, nonpolitical, nonreligious humanitarian relief organization, established in 1992 to arrange medical care for sick and injured Palestinian children who could not be treated in their homeland. Since our founding, we have expanded and grown into one of the main relief organizations in the Middle East," +
                        " helping thousands of children each year get the care and support they need to live better lives.",
                "PMinimum Skill Requirements \n" +
                        "A minimum total of 2 years of field experience.\n" +
                        "BA in Social Work or another related field.\n" +
                        "Fluency in using Google Apps. \n" +
                        "Ability to quickly learn and adapt to new systems.\n" +
                        "Communication\n" +
                        "Fluent in written and spoken Arabic; English language is spoken adequately \n" +
                        "Accurately prepare written correspondence that is coherent, grammatically correct, effective and professional across languages.\n" +
                        "Listen to others and accept input from team members.\n" +
                        "Dress and speak in a professional and polite manner to all volunteers, staff, beneficiaries, and others. ",
                "16\1\2023"));
    }


    @Override
    public ArrayList<String> getJobName() {
        ArrayList<String> result = new ArrayList<>();

        for(jobItem i : job){
            result.add(i.getCategory());
        }
        return result;
    }

    @Override
    public ArrayList<String> getCategories() {
        ArrayList<String> cats = new ArrayList<>();
        cats.add("Category");
        cats.add("JOB ANNOUNCEMENT");
        cats.add("IT Support Engineers");
        cats.add("Director of Institutional Affairs");
        cats.add("Administrative and Finance Officer");
        cats.add("Research Consultant");
        cats.add("Social Worker");
        return cats;
    }

    @Override
    public ArrayList<String> getSalaries() {
        ArrayList<String> salaries = new ArrayList<>();
        salaries.add("Salary");
        salaries.add("1500");
        salaries.add("2000");
        salaries.add("3000");
        salaries.add("4000");
        salaries.add("5000");
        salaries.add("6000");
        return salaries;
    }

    @Override
    public ArrayList<String> getCities() {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("City");
        cities.add("Gaza");
        cities.add("Ramallah");
        cities.add("Bethlehem");
        cities.add("Hebron");
        cities.add("Jerusalem");
        cities.add("Nablus");
        return cities;
    }

    @Override
    public ArrayList<jobItem> getAllJobData() {
        ArrayList<jobItem> result = new ArrayList<>();
        for(jobItem i: job){
            result.add(i);
        }
        return result;
    }

    @Override
    public ArrayList<jobItem> getJobData(String category, String city, int salary) {
        ArrayList<jobItem> result = new ArrayList<>();

        for(jobItem i : job){
            if(i.getCategory().equals(category)
                    && i.getCity().equals(city)
                    && i.getSalary().equals(salary)){
                result.add(i);
            }
        }
        return result;
   }


}
